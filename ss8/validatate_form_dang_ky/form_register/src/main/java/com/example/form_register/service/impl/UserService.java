package com.example.form_register.service.impl;

import com.example.form_register.model.User;
import com.example.form_register.repository.IUserRepository;
import com.example.form_register.service.IUserService;
import org.springframework.stereotype.Service;

@Service
public class UserService implements IUserService {
    private final IUserRepository iUserRepository;

    public UserService(IUserRepository iUserRepository) {
        this.iUserRepository = iUserRepository;
    }

    @Override
    public User save(User user) {
        this.iUserRepository.save(user);
        return user;
    }
}
