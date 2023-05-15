package com.codingdojo.loginregistration.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import com.codingdojo.loginregistration.models.LoginUser;
import com.codingdojo.loginregistration.models.Project;
import com.codingdojo.loginregistration.models.User;
import com.codingdojo.loginregistration.services.ProjectService;
import com.codingdojo.loginregistration.services.UserService;

import jakarta.servlet.http.HttpSession;
import jakarta.validation.Valid;

@Controller
public class HomeController {    
    @Autowired
    private UserService userServ;
    
    @Autowired
    private ProjectService projectService;
    
    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("newUser", new User());
        model.addAttribute("newLogin", new LoginUser());
        return "index.jsp";
    }
    
    @PostMapping("/register")
    public String register(
    		@Valid 
    		@ModelAttribute("newUser") User newUser, 
            BindingResult result, 
            HttpSession session,
            Model model) {
    	User user = userServ.register(newUser, result);        
        if(result.hasErrors()) {
            model.addAttribute("newLogin", new LoginUser());
            return "index.jsp";
        }
        session.setAttribute("userId", user.getId());
        session.setAttribute("userName", user.getFirstName());
        return "redirect:/dashboard";
    }
    
    @PostMapping("/login")
    public String login(
    		@Valid @ModelAttribute("newLogin") LoginUser newLogin, 
            BindingResult result, 
            HttpSession session,
            Model model) {
        User user = userServ.login(newLogin, result);
        if(result.hasErrors() || user == null) {
            model.addAttribute("newUser", new User());
            return "index.jsp";
        }
        session.setAttribute("userId", user.getId());
        session.setAttribute("userName", user.getFirstName());
        return "redirect:/dashboard";
    }
	 
	@GetMapping("/logout")
	public String logout(HttpSession session) { 
	        session.invalidate();
	        return "redirect:/";       
	}    	 
    
	@GetMapping("/dashboard")
	public String dashBoard(HttpSession session,
			Model model) {
		if (session.getAttribute("userId") != null) {
			Long userId = (Long) session.getAttribute("userId");
			User user = userServ.findUserById(userId);
			model.addAttribute("user", user);
			model.addAttribute("unassignedProjects", projectService.getUnassignedProjects(user));
			model.addAttribute("assignedProjects", projectService.getAssignedProjects(user));
			return "dashboard.jsp";
		} else {
			return "redirect:/";
		}		
	}
	
	@GetMapping("/projects/new")
	public String newProject(
			@ModelAttribute("project") Project project, 
			HttpSession session, 
			Model model) {
		if (session.getAttribute("userId") != null) {
			Long userId = (Long) session.getAttribute("userId");
			model.addAttribute("userId", userId);		
			return "ProjectForm.jsp";
		} else {
			return "redirect:/";
		}	
	}
	
	@PostMapping("/projects/new")
	public String createProject(
			@Valid 
			@ModelAttribute("project") Project project, 
			BindingResult result, 
			HttpSession session, 
			Model model) {
		if (session.getAttribute("userId") != null) {
			if (result.hasErrors()) {
				return "ProjectForm.jsp";
			} else {
				projectService.addProject(project);
				Long userId = (Long) session.getAttribute("userId");
				User user = userServ.findUserById(userId);
				user.getProjects().add(project);
				userServ.updateUser(user);
				return "redirect:/dashboard";
			}
		} else {
			return "redirect:/";
		}		
	}
	
	@GetMapping("/projects/edit/{id}")
	public String editForm(
			@PathVariable("id") Long id, 
			HttpSession session, 
			Model model) {
		Project thisProject = projectService.findById(id);
		if ((Long)session.getAttribute("userId") == thisProject.getLead().getId()) {
			model.addAttribute("user", session.getAttribute("userId"));
			model.addAttribute("project", thisProject);
			return "EditProject.jsp";
		} else {
			return "redirect:/";
		}
		
	}
	
	@PutMapping("/projects/edit/{id}")
    public String editProject (
    		@Valid 
    		@ModelAttribute("project") Project project, 
    		BindingResult result,
    		@PathVariable("id") Long id,
    		Model model,
    		HttpSession session) {
		Project thisProject = projectService.findById(id);
        if ((Long)session.getAttribute("userId") == thisProject.getLead().getId()) {
            if (result.hasErrors()) {
                model.addAttribute("user", session.getAttribute("userId"));
                return "EditProject.jsp";
            } else {
            	project.setUsers(thisProject.getUsers());
            	projectService.updateProject(project);
                return "redirect:/dashboard";
            }
        } else {
            return "redirect:/";
        }
	
	}
	
	@GetMapping("/projects/{id}")
	public String displayProject(
			@PathVariable("id") Long id,
			HttpSession session,
			Model model) {
		if (session.getAttribute("userId") != null) {
			model.addAttribute("user", session.getAttribute("userId"));
			Project thisProject = projectService.findById(id);
			model.addAttribute("project", thisProject);
			return "DisplayProject.jsp";
		} else {
			return "redirect:/";
		}
	}
	
	@GetMapping("/projects/{id}/join")
	public String joinTeam(
			@PathVariable("id") Long id,
			HttpSession session,
			Model model) {
		if (session.getAttribute("userId") != null) {
			Project thisProject = projectService.findById(id);
			Long userId = (Long) session.getAttribute("userId");
			User user = userServ.findUserById(userId);
			thisProject.getUsers().add(user);
			projectService.updateProject(thisProject);
		}
		return "redirect:/dashboard";
	}
	
	@GetMapping("/projects/{id}/leave")
	public String leaveTeam(
			@PathVariable("id") Long id,
			HttpSession session,
			Model model) {
		if (session.getAttribute("userId") != null) {
			Project thisProject = projectService.findById(id);
			Long userId = (Long) session.getAttribute("userId");
			User user = userServ.findUserById(userId);
			thisProject.getUsers().remove(user);
			projectService.updateProject(thisProject);
		}
		return "redirect:/dashboard";
	}
	
	@DeleteMapping("/projects/{id}/delete")
	public String deleteProject(
			@PathVariable("id") Long id, 
			HttpSession session) {
		Project thisProject = projectService.findById(id);
		if (!session.getAttribute("userId").equals(thisProject.getLead().getId())) {
			return "redirect:/projects/{id}";
		} else {
			projectService.deleteProject(id);
			return "redirect:/dashboard";
		}		
	}
	
	
}