package br.com.diogooliveira.todolist.user;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
    public void create(@RequestBody UserModel userModel) {
        System.out.println(userModel.username);
        System.out.println(userModel.name);
        System.out.println(userModel.username);
    }
}
