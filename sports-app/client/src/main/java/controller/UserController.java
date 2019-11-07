package controller;

import models.User;
import repositories.UserRepository;

import java.util.ArrayList;
import java.util.List;

public class UserController {
    private UserRepository repository;

    public UserController() {
        this.repository = new UserRepository();
    }
}