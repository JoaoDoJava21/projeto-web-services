package com.joaodojava21.meuprojeto.Resources;

// Recurso Web conrrespondente a entidade User

import com.joaodojava21.meuprojeto.Entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users") // Caminho do recurso relacionado a entidade User
public class UserResource {

    // Endpoint para acessar os usuários
    // ResponseEntity retorna respostas , sendo ele um Generics
    // Controlador Rest que responde no caminho /users
    @GetMapping
    public ResponseEntity<User> findAll(){
        User u = new User(1L , "João" , "joao@gmail.com" , "777777" , "12345");
        return ResponseEntity.ok().body(u);
    }
}
