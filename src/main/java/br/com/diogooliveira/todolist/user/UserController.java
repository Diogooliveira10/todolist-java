package br.com.diogooliveira.todolist.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import at.favre.lib.crypto.bcrypt.BCrypt;

/*
 * Modificador
 * public    -> Qualquer um pode ter acesso à minha classe.
 * private   -> Há uma restrição maior, e somente alguns atributos são permitidos.
 * protected -> Quando está na mesma estrutura do pacote ao qual tem acesso.
 */

@RestController // constrói uma API.
@RequestMapping("/users") // Responsável por estruturar a rota.
// http://localhost:8080/users/
public class UserController {

    @Autowired // Gerencia e instancia todo o ciclo de vida do Spring.
    private IUserRepository userRepository;

    /*
     * String  (texto)
     * Integer (int) números inteiros.
     * Double  (double) números 0.0000.
     * Float   (float) números 0.000.
     * char    (A C)
     * Date    (data)
     * void    sem retorno do método.
     */

    /*
    * UserModel
    * dentro do corpo da requisição -> @RequestBody
    */
    @PostMapping("/")
    public ResponseEntity create(@RequestBody UserModel userModel) {
        var user = this.userRepository.findByUsername(userModel.getUsername());

        if(user != null) {
            // Mensagem de erro
            // Status code
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("User already exists");
        }

        var passwordHashred = BCrypt.withDefaults()
            .hashToString(12, userModel.getPassword().toCharArray());

        userModel.setPassword(passwordHashred);

        var userCreated = this.userRepository.save(userModel);
        return ResponseEntity.status(HttpStatus.CREATED).body(userCreated);
    }
}