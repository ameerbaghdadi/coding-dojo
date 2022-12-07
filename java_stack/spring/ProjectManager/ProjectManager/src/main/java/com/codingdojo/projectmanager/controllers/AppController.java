package com.codingdojo.projectmanager.controllers;

import java.util.ArrayList;
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

import com.codingdojo.projectmanager.models.LoginUser;
import com.codingdojo.projectmanager.models.Project;
import com.codingdojo.projectmanager.models.User;
import com.codingdojo.projectmanager.services.AppService;

@Controller
public class AppController {
    
    @Autowired
    private AppService appServ;
    
    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("newUser", new User());
        model.addAttribute("newLogin", new LoginUser());
        return "index.jsp";
    }
    
    
    @PostMapping("/register")
    public String register(@Valid @ModelAttribute("newUser") User newUser, 
            BindingResult result, Model model, HttpSession session) {
        appServ.register(newUser, result);
        if(result.hasErrors()) {
            model.addAttribute("newLogin", new LoginUser());
            return "index.jsp";
        }
        session.setAttribute("user_id", newUser.getId());
        return "redirect:/dashboard";
    }
    
    @PostMapping("/login")
    public String login(@Valid @ModelAttribute("newLogin") LoginUser newLogin, 
            BindingResult result, Model model, HttpSession session) {
        User user = appServ.login(newLogin, result);
        if(result.hasErrors()) {
            model.addAttribute("newUser", new User());
            return "index.jsp";
        }
        session.setAttribute("user_id", user.getId());
        return "redirect:/dashboard";
    }
    
    @GetMapping("/dashboard")
    public String dashboard(Model model, HttpSession session) {
        if (session.getAttribute("user_id") != null) {
        Long user_id = (Long) session.getAttribute("user_id");
        User thisUser = appServ.findUserById(user_id);
   
        model.addAttribute("thisUser", thisUser);
        model.addAttribute("allProjectsNot", appServ.usersNotContains(thisUser));
        List<Project> adminProject = thisUser.getProject();
        adminProject.addAll(thisUser.getProjects());
        model.addAttribute("myProjects", adminProject);
        
        
        return "dashboard.jsp";
    }
        else {
            return "redirect:/";
        }
    }
    
    @RequestMapping("/project/new")
    public String newProject(Model model, HttpSession session) {
        if (session.getAttribute("user_id") != null) {
        Long user_id = (Long) session.getAttribute("user_id");
        User thisUser = appServ.findUserById(user_id);
        model.addAttribute("thisUser", thisUser);
        model.addAttribute("newProject", new Project());
//        model.addAttribute("allProjects", appServ.allBooks());
//        model.addAttribute("withOutBorrow", userServ.booksNotInBorrow());
        return "newProject.jsp";
    }
        else {
            return "redirect:/";
        }
    }
    
    @PostMapping("/create/project")
    public String createProject(@Valid @ModelAttribute("newProject") Project newProject, 
            BindingResult result, Model model, HttpSession session) {
    	
        if(result.hasErrors()) {
            return "newProject.jsp";
        }
        
        appServ.createProject(newProject);
        Long user_id = (Long) session.getAttribute("user_id");
        User thisUser = appServ.findUserById(user_id);
        newProject.setUser(thisUser);
        List<User> thisMember = new ArrayList<User>();
        newProject.setMembers(thisMember);
        appServ.updateProject(newProject);
        
        return "redirect:/dashboard";
    }
    
    @RequestMapping("/join/{id}")
    public String joinProject(@Valid @PathVariable("id") Long id, Model model, HttpSession session) {
        
        Long user_id = (Long) session.getAttribute("user_id");
        List<User> thisUser = new ArrayList<User>();

        thisUser.add(appServ.findUserById(user_id));
        Project thisProject = appServ.findProject(id);
       
        thisProject.setMembers(thisUser);
        appServ.updateProject(thisProject);
        
        return "redirect:/dashboard";
    }
    
    @GetMapping("/logout")
    public String logout(HttpSession session) { 
            session.invalidate();
            return "redirect:/";

    }
    
    @RequestMapping("/leave/team/{id}")
    public String leaveProject(@Valid @PathVariable("id") Long id, Model model, HttpSession session) {
        
        Long user_id = (Long) session.getAttribute("user_id");
        List<User> thisUser = new ArrayList<User>();

        thisUser.remove(appServ.findUserById(user_id));
        Project thisProject = appServ.findProject(id);
       
        thisProject.setMembers(thisUser);
        appServ.updateProject(thisProject);
        
        return "redirect:/dashboard";
    }
    
    @GetMapping("/projects/edit/{id}")
    public String editProject(Model model, @PathVariable("id") Long id, HttpSession session) {
    	Project thisProject = appServ.findProject(id);
	     model.addAttribute("thisProject", thisProject);
	     Long user_id = (Long) session.getAttribute("user_id");
	     model.addAttribute("user_id", user_id);
   	
	     return "editProject.jsp";
    }
    
    @PostMapping("/update/project/{id}")
    public String updateProject(@Valid @PathVariable("id") Long id, @ModelAttribute("thisProject") Project thisProject, 
            BindingResult result, Model model, HttpSession session) {
    	
    	  Long user_id = (Long) session.getAttribute("user_id");
          User thisUser = appServ.findUserById(user_id);
          thisProject.setUser(thisUser);
          appServ.updateProject(thisProject);
          
          return "redirect:/dashboard";
    }
    
    @GetMapping("/show/project/{id}")
    public String showProject(Model model, @PathVariable("id") Long id, HttpSession session) {
    	Project thisProject = appServ.findProject(id);
	     model.addAttribute("thisProject", thisProject);
	     Long user_id = (Long) session.getAttribute("user_id");
	     model.addAttribute("user_id", user_id);
   	
	     return "showProject.jsp";
    }
}