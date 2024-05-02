package com.example.springmvcthymeleaf1.Repository;

import com.example.springmvcthymeleaf1.model.Users;
import org.springframework.data.repository.CrudRepository;

public interface UserRepo extends CrudRepository<Users,Integer> {
}
