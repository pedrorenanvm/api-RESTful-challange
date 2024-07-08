package br.com.pedrorenan.api_REST_ful_java.service;

import br.com.pedrorenan.api_REST_ful_java.domain.model.User;

public interface UserService {

    User findById(Long id);

    User create(User userToCreate);
}