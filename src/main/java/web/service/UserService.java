package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import web.dao.UserDao;

import web.model.User;

import java.util.List;

@Service
@Transactional
public class UserService implements UserSer {

    @Autowired
    private  UserDao userDao;


    @Override

    public void add(User user) {
        userDao.add(user);

    }

    @Override
    public void delete(int id) {
        userDao.delete(id);

    }

    @Override
    public void update(User user) {
        userDao.update(user);

    }

    @Override
    public List<User> getList() {
        return userDao.getList();
    }

    @Override
    public User getUser(int id) {
        return userDao.getUser(id);
    }
}
