/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.proyectoArgPrograma.backend.controller;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import com.proyectoArgPrograma.backend.service.IEducacionService;
import org.springframework.web.bind.annotation.GetMapping;
import com.proyectoArgPrograma.backend.model.Educacion;
import java.util.List;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.CrossOrigin;


@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
public class EducacionController {
    @Autowired
    private IEducacionService interEducacion;
    
    @GetMapping("/educaciones/traer")
    public List<Educacion> getEducaciones(){
        return interEducacion.getEducaciones();
    }
    
    @PostMapping("/educaciones/crear")
    public void createEducacion(@RequestBody Educacion educ){        
        interEducacion.saveEducacion(educ);
    }
    
    @DeleteMapping("/educaciones/borrar/{id}")
    public void deleteEducacion (@PathVariable Long id){
        interEducacion.deleteEducacion(id);
    }
    
    @PutMapping("educaciones/editar")
    public void editEducacion (@RequestBody Educacion ed){
        interEducacion.saveEducacion(ed);
    }
}
