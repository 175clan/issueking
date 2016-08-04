package issue.king.test.api.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import issue.king.test.api.dao.UserDao;
import issue.king.test.api.model.User;

@Service("userService")
public class UserServiceImpl implements UserService {
     
    @Resource(name="userDao")
    private UserDao userDao;
 
    @Override
    public List<User> getUserList() {
    	return userDao.getUserList();
    }
 
}

