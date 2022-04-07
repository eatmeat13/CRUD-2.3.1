package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import web.dao.UserDao;

import web.model.User;

import java.util.List;

@Service
@Transactional
public class UserService {

    @Autowired
    private  UserDao userDao;




    public void add(User user) {
        userDao.add(user);

    }


    public void delete(int id) {
        userDao.delete(id);

    }


    public void update(User user) {
        userDao.update(user);

    }


    public List<User> getList() {
        return userDao.getList();
    }


    public User getUser(int id) {
        return userDao.getUser(id);
    }
}
