package com.proyectoArgPrograma.backend.repository;
import com.proyectoArgPrograma.backend.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends JpaRepository <Usuario, Long>{
    Usuario findByUser(String nombreUsuario);
}