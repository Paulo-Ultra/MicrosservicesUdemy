package br.com.paulo.userapi.services;

import br.com.paulo.userapi.domain.User;

import java.util.List;

public interface UserService {

    User findById(Long id);
    List<User> findAll();
}
