package repositories;

import models.User;

import java.util.ArrayList;

public class UserRepository implements IRepository<User>{
    ArrayList<User> users;

    public UserRepository() {
        this.users = new ArrayList<User>();
    }

    @Override
    public User getById(int id) {
        return null;
    }

    @Override
    public ArrayList<User> getAll() {
        return users;
    }

    @Override
    public void add(User user) {
        users.add(user);
    }

    @Override
    public void delete(User user) {
        users.remove(user);
    }
}
