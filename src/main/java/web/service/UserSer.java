
package web.service;

import web.model.User;

import java.util.List;

public interface UserSer {
    void add(User user);
    void delete(int id);
    void update(User user);
    List<User> getList();
    User getUser(int id);
}