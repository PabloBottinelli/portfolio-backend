/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.proyectoArgPrograma.backend.controller;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import com.proyectoArgPrograma.backend.service.IProyectoService;
import org.springframework.web.bind.annotation.GetMapping;
import com.proyectoArgPrograma.backend.model.Proyecto;
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
public class ProyectoController {
    @Autowired
    private IProyectoService interProyecto;
    
    @GetMapping("/proyectos/traer")
    public List<Proyecto> getProyectos(){
        return interProyecto.getProyectos();
    }
    
    @PostMapping("/proyectos/crear")
    public void createProyecto(@RequestBody Proyecto proy){
        interProyecto.saveProyecto(proy);
    }
    
    @DeleteMapping("/proyectos/borrar/{id}")
    public void deleteProyecto (@PathVariable Long id){
        interProyecto.deleteProyecto(id);
    }
    
    @PutMapping("proyectos/editar")
    public void editProyecto (@RequestBody Proyecto proy){
        interProyecto.saveProyecto(proy);
    }
}
