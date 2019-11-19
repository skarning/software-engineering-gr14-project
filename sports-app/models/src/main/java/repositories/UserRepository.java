package repositories;

import models.Event;
import models.User;

import java.util.ArrayList;
import java.util.List;

public class UserRepository implements IRepository<User>{

    @Override
    public User getById(int id) {
        for (User user : MockupDatabase.users){
            if (user.getUserId() == id)
                    return user;
        }
        return null;
    }

    @Override
    public ArrayList<User> getAll() {
        return MockupDatabase.users;
    }

    @Override
    public void add(User user) {
        MockupDatabase.users.add(user);
    }

    @Override
    public void delete(User user) {
        MockupDatabase.users.remove(user);
    }

    @Override
    public void removeAll() {
        MockupDatabase.events.clear();
    }

    @Override
    public void generateData() {
        MockupDatabase.getGeneratedUsers();
    }
}
