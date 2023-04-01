package com.proyectoArgPrograma.backend.service;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import com.proyectoArgPrograma.backend.repository.UsuarioRepository;
import com.proyectoArgPrograma.backend.model.Usuario;

@Service
public class UsuarioService implements IUsuarioService{
    @Autowired
    private UsuarioRepository userRepository;
    
    @Override
    public boolean autenticarUsuario(String nombreUsuario, String contraseña){
        Usuario usuario = userRepository.findByUser(nombreUsuario);
        return usuario != null && usuario.getPassword().equals(contraseña);
    }
}

