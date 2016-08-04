package issue.king.test.api.dao;

import java.util.List;

import issue.king.test.api.model.User;

public interface UserDao {
    
	List<User> getUserList();
}