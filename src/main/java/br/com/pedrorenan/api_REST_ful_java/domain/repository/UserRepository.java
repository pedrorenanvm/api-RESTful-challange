package br.com.pedrorenan.api_REST_ful_java.domain.repository;

import br.com.pedrorenan.api_REST_ful_java.domain.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    boolean existsByAccountNumber(String accountNumber);
}