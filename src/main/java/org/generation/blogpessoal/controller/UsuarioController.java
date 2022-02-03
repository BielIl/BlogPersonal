package org.generation.blogpessoal.controller;

import java.util.Optional;

import org.generation.blogpessoal.model.UserLogin;
import org.generation.blogpessoal.model.Usuario;
import org.generation.blogpessoal.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/usuario")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    @PostMapping("/logar")
    public ResponseEntity<UserLogin> auth(@RequestBody Optional<UserLogin> logar) {
        return usuarioService.logar(logar).map(resp -> ResponseEntity.ok(resp))
                .orElse(ResponseEntity.status(401).build());
    }

    /**
     * metedo utilizado pra receber usuario do front-end pra BD
     * 
     * @param usuario
     * @return ResponseEntity<Usuario>
     * @Auto Gabriel
     * @since version mk.1 - 2022-02-02
     */
    @PostMapping("/cadastrar")
    public ResponseEntity<Usuario> save(@RequestBody Usuario usuario) {
        return usuarioService.CadastrarUsuario(usuario);
    }

}