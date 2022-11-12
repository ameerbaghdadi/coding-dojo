package com.codingdojo.loginregistration.controllers;

import java.util.List;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;
    
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.codingdojo.loginregistration.models.Book;
import com.codingdojo.loginregistration.models.LoginUser;
import com.codingdojo.loginregistration.models.User;
import com.codingdojo.loginregistration.services.UserService;
    
    
@Controller
public class HomeController {
    
    @Autowired
    private UserService userServ;
    
    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("newUser", new User());
        model.addAttribute("newLogin", new LoginUser());
        return "index.jsp";
    }
    
    
    @PostMapping("/register")
    public String register(@Valid @ModelAttribute("newUser") User newUser, 
            BindingResult result, Model model, HttpSession session) {
        userServ.register(newUser, result);
        if(result.hasErrors()) {
            model.addAttribute("newLogin", new LoginUser());
            return "index.jsp";
        }
        session.setAttribute("user_id", newUser.getId());
        return "redirect:/bookmarket";
    }
    
    @PostMapping("/login")
    public String login(@Valid @ModelAttribute("newLogin") LoginUser newLogin, 
            BindingResult result, Model model, HttpSession session) {
        User user = userServ.login(newLogin, result);
        if(result.hasErrors()) {
            model.addAttribute("newUser", new User());
            return "index.jsp";
        }
        session.setAttribute("user_id", user.getId());
        return "redirect:/bookmarket";
    }
    
    @GetMapping("/bookmarket")
    public String home(Model model, HttpSession session) {
        if (session.getAttribute("user_id") != null) {
        Long user_id = (Long) session.getAttribute("user_id");
        User thisUser = userServ.findUserById(user_id);
   
        model.addAttribute("thisUser", thisUser);
        model.addAttribute("books", userServ.allBooks());
        model.addAttribute("withOutBorrow", userServ.booksNotInBorrow());
        return "home.jsp";
    }
        else {
            return "redirect:/";
        }
    }
    
    @GetMapping("/logout")
    public String logout(HttpSession session) { 
            session.invalidate();
            return "redirect:/";

    }
    
    @GetMapping("/books/new")
    public String newBook(Model model) {
        model.addAttribute("newUser", new User());
        model.addAttribute("newLogin", new LoginUser());
        model.addAttribute("newBook", new Book());
        return "newBook.jsp";
    }
    
    @PostMapping("/create/book")
    public String createBook(@Valid @ModelAttribute("newBook") Book newBook, 
            BindingResult result, Model model, HttpSession session) {
    	
        if(result.hasErrors()) {
            return "newBook.jsp";
        }
        
        userServ.createBook(newBook);
        Long user_id = (Long) session.getAttribute("user_id");
        User thisUser = userServ.findUserById(user_id);
        newBook.setUser(thisUser);
        userServ.updateBook(newBook);
        
        return "redirect:/bookmarket";
    }
    
    @RequestMapping("/books/{id}")
	 public String oneBook(@PathVariable("id") Long id, Model model, HttpSession session) {
	     Book book = userServ.findBook(id);
	     model.addAttribute("thisBook", book);
	     Long user_id = (Long) session.getAttribute("user_id");
	     model.addAttribute("user_id", user_id);
	     
	     
	     return "showBook.jsp";
	 }
    
    @RequestMapping("/books/{id}/edit")
	 public String editBook(@PathVariable("id") Long id, Model model, HttpSession session) {
	     Book book = userServ.findBook(id);
	     model.addAttribute("thisBook", book);
	     Long user_id = (Long) session.getAttribute("user_id");
	     model.addAttribute("user_id", user_id);
    	
	    
	     return "editBook.jsp";
	 }
    
    @PostMapping("/update/book/{id}")
    public String updateBook(@Valid @PathVariable("id") Long id, @ModelAttribute("newBook") Book newBook, 
            BindingResult result, Model model, HttpSession session) {
    	
        if(result.hasErrors()) {
            return "editBook.jsp";
        }
        
        Long user_id = (Long) session.getAttribute("user_id");
        User thisUser = userServ.findUserById(user_id);
        newBook.setUser(thisUser);
        userServ.updateBook(newBook);
        
        return "redirect:/bookmarket";
    }
    
    @RequestMapping(value="/delete/books/{id}")
    public String destroy(@PathVariable("id") Long id) {
        userServ.deleteBook(id);
        
        return "redirect:/bookmarket";
    }
    
    @RequestMapping("/borrow/book/{id}")
    public String borrowBook(@Valid @PathVariable("id") Long id, Model model, HttpSession session) {
        
        Long user_id = (Long) session.getAttribute("user_id");
        User thisUser = userServ.findUserById(user_id);
        Book thisBook = userServ.findBook(id);
        model.addAttribute("thisBook", thisBook);
        thisBook.setBorrower(thisUser);
        userServ.updateBook(thisBook);
        
        return "redirect:/bookmarket";
    }
    
    @RequestMapping("/return/book/{id}")
    public String returnBook(@Valid @PathVariable("id") Long id, Model model, HttpSession session) {
        
        Book thisBook = userServ.findBook(id);
        model.addAttribute("thisBook", thisBook);
        thisBook.setBorrower(null);
        userServ.updateBook(thisBook);
        
        return "redirect:/bookmarket";
    }
    
}