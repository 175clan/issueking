package issue.king.test.api.controller.user;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import issue.king.test.api.service.UserService;



@Controller
@RequestMapping(value="/user", method=RequestMethod.GET)
public class UserController {
	
	private static final Logger logger = LoggerFactory.getLogger(UserController.class);
	
	@Autowired
	UserService userService;
	
	@RequestMapping(value="/signin", method = RequestMethod.GET)
	public String home(Model model) {
        
        model.addAttribute("user", userService.getUserList());       
         
        return "/user/user";
    }
	
}
