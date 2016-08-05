package issue.king.test.api.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import issue.king.test.api.model.User;

@Repository("userDao")
public class UserDaoImpl implements UserDao{
     
    @Autowired
    private SqlSession sqlSession;
 
    public void setSqlSession(SqlSession sqlSession){
        this.sqlSession = sqlSession;
    }
 
    public User userInfo() {
        
        return sqlSession.selectOne("getUserList");
    }
}