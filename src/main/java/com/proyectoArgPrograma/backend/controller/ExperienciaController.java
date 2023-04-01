/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.proyectoArgPrograma.backend.controller;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import com.proyectoArgPrograma.backend.service.IExperienciaService;
import org.springframework.web.bind.annotation.GetMapping;
import com.proyectoArgPrograma.backend.model.Experiencia;
import java.util.List;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.CrossOrigin;


@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
public class ExperienciaController {
    @Autowired
    private IExperienciaService interExperiencia;
    
    @GetMapping("/experiencias/traer")
    public List<Experiencia> getExperiencias(){
        return interExperiencia.getExperiencias();
    }
    
    @PostMapping("/experiencias/crear")
    public void createExperiencia(@RequestBody Experiencia exp){
        interExperiencia.saveExperiencia(exp);
    }
    
    @DeleteMapping("/experiencias/borrar/{id}")
    public void deleteExperiencia (@PathVariable Long id){
        interExperiencia.deleteExperiencia(id);
    }
    
    @PutMapping("experiencias/editar")
    public void editExperiencia (@RequestBody Experiencia exp){
        interExperiencia.saveExperiencia(exp);
    }
}
