package handlers;

import models.User;

public class ProfileHandler {
    private static User profile;

    public static void setUser(User user) {
        profile = user;
    }

    public static User getUser() {
        return profile;
    }
}
