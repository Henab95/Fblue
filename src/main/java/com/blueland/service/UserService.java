package com.blueland.service;

import java.util.List;

import com.blueland.model.User;

public interface UserService {
    public void saveUser(User user);
    public List<Object> isUserPresent(User user);
}
