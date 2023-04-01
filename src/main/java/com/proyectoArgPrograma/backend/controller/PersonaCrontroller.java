/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.proyectoArgPrograma.backend.controller;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import com.proyectoArgPrograma.backend.service.IPersonaService;
import org.springframework.web.bind.annotation.GetMapping;
import com.proyectoArgPrograma.backend.model.Persona;
import java.util.List;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.CrossOrigin;


@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
public class PersonaCrontroller {
    @Autowired
    private IPersonaService interPersona;
    
    @GetMapping("/personas/traer")
    public List<Persona> getPersonas(){
        return interPersona.getPersonas();
    }
    
    @PostMapping("/personas/crear")
    public void createStudent(@RequestBody Persona perso){
        interPersona.savePersona(perso);
    }
    
    @DeleteMapping("/personas/borrar/{id}")
    public void deletePersona (@PathVariable Long id){
        interPersona.deletePersona(id);
    }
    
    @PutMapping("personas/editar")
    public void editPersona (@RequestBody Persona perso){
        interPersona.savePersona(perso);
    }
}
