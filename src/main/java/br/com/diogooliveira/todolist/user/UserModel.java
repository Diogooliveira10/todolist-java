package br.com.diogooliveira.todolist.user;

import lombok.Data;

@Data // Definir os getters e setters dos atributos.
// Modelo de usuário.
public class UserModel {
    
    private String username;
    private String name;
    private String password;
}
