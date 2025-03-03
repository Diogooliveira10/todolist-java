package br.com.diogooliveira.todolist.user;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

// (Interface) representação dos métodos que estão disponíveis dentro dela.
// <> a classe recebe um generator.
public interface IUserRepository extends JpaRepository<UserModel, UUID> {

    UserModel findByUsername(String username);
}