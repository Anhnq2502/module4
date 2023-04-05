package com.example.form_register.repository;

import com.example.form_register.model.User;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface IUserRepository extends PagingAndSortingRepository<User,Integer> {
}
