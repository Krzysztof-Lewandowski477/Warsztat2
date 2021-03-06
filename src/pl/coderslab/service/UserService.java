package src.pl.coderslab.service;

import src.pl.coderslab.dao.UserDao;
import src.pl.coderslab.entity.User;

public class UserService {

    private final UserDao userDao;

    public UserService(UserDao userDao) {
        this.userDao = userDao;
    }

    public User create(User user){
        return userDao.create(user);
    }

    public User readById(Integer id){
        return userDao.read(id);
    }

    public void update(User user){
        userDao.update(user);
    }

    public void delete(Integer id){
        userDao.delete(id);
    }

    public User[] findAll(){
        return userDao.findAll();
    }

    public User[] findAllByGroupId(){
        return userDao.findAllByGroupId();
    }
}
