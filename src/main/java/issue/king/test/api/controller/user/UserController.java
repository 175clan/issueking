package issue.king.test.api.controller.user;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import issue.king.test.api.model.User;
import issue.king.test.api.service.UserService;



@Controller
@RequestMapping(value="/user", method=RequestMethod.GET)
public class UserController {
	
	private static final Logger logger = LoggerFactory.getLogger(UserController.class);
	
	@Autowired
	UserService userService;
	
	@RequestMapping(value="/signin", method = RequestMethod.GET)
	public String userInfo(HttpServletRequest request, ModelMap modelMap) throws Exception{
		User userInfo = userService.userInfo();
		
        modelMap.addAttribute("user", userInfo);       
         
        return "/user/user";
    }
	
}
