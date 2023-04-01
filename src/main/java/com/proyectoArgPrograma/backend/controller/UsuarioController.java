package com.proyectoArgPrograma.backend.controller;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import com.proyectoArgPrograma.backend.service.IUsuarioService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.CrossOrigin;
import com.proyectoArgPrograma.backend.model.UsuarioDTO;


@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
public class UsuarioController {
    @Autowired
    private IUsuarioService interUser;
    
    @PostMapping("/user/login")
    public boolean autenticarUsuario(@RequestBody UsuarioDTO userdto){
        boolean autenticado = interUser.autenticarUsuario(userdto.getUser(), userdto.getPassword());
        return autenticado;
    }
}
