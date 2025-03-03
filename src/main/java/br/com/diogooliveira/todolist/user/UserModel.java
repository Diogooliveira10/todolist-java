package br.com.diogooliveira.todolist.user;

import java.time.LocalDateTime;
import java.util.UUID;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

@Data // Definir os getters e setters dos atributos.
@Entity(name = "tb_users") // Um objeto que representa uma tabela.
// Modelo de usuário.
public class UserModel {

    @Id // Informa ao banco de dados que esse ID é a chave primária.
    @GeneratedValue(generator = "UUID") // Gerando ID de forma automática.
    private UUID id;
    
    private String username;
    private String name;
    private String password;

    @CreationTimestamp // Quando o dado for gerado de forma automática, o banco de dados já terá essa informação no CreationTimestamp.
    private LocalDateTime createdAt;
}
