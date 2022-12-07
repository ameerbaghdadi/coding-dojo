package com.codingdojo.projectmanager.services;

import java.util.List;
import java.util.Optional;

import org.mindrot.jbcrypt.BCrypt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.BindingResult;

import com.codingdojo.projectmanager.models.LoginUser;
import com.codingdojo.projectmanager.models.Project;
import com.codingdojo.projectmanager.models.User;
import com.codingdojo.projectmanager.repositories.ProjectRepository;
import com.codingdojo.projectmanager.repositories.UserRepository;

@Service
public class AppService {
    
    @Autowired
    private UserRepository userRepo;
    private ProjectRepository projectRepo;
    
   
    public AppService(UserRepository userRepo, ProjectRepository projectRepo) {
		this.userRepo = userRepo;
		this.projectRepo = projectRepo;
	}

	public User register(User newUser, BindingResult result) {
        if(userRepo.findByEmail(newUser.getEmail()).isPresent()) {
            result.rejectValue("email", "Unique", "This email is already in use!");
        }
        if(!newUser.getPassword().equals(newUser.getConfirm())) {
            result.rejectValue("confirm", "Matches", "The Confirm Password must match Password!");
        }
        if(result.hasErrors()) {
            return null;
        } else {
            String hashed = BCrypt.hashpw(newUser.getPassword(), BCrypt.gensalt());
            newUser.setPassword(hashed);
            return userRepo.save(newUser);
        }
    }
    
    public User login(LoginUser newLogin, BindingResult result) {
        if(result.hasErrors()) {
            return null;
        }
        Optional<User> potentialUser = userRepo.findByEmail(newLogin.getEmail());
        if(!potentialUser.isPresent()) {
            result.rejectValue("email", "Unique", "Unknown email!");
            return null;
        }
        User user = potentialUser.get();
        if(!BCrypt.checkpw(newLogin.getPassword(), user.getPassword())) {
            result.rejectValue("password", "Matches", "Invalid Password!");
        }
        if(result.hasErrors()) {
            return null;
        } else {
            return user;
        }
    }
    
    public User findUserById(Long id) {
        Optional<User> u = userRepo.findById(id);

        if(u.isPresent()) {
            return u.get();
            } else {
            return null;
        }
    }
    
    public Project createProject(Project p) {
    	return projectRepo.save(p);
    }
    
    public Project updateProject(Project p) {
    	return projectRepo.save(p);
    }
    
    public List<Project> allProjects() {
    	return projectRepo.findAll();
    }
    
    public Project findProject(Long id) {
    	return this.projectRepo.findById(id).orElse(null);
 	}  
    
    public List<Project> usersNotContains(User u) {
    	return projectRepo.findByMembersNotContains(u);
    }
}