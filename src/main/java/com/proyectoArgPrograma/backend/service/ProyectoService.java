/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.proyectoArgPrograma.backend.service;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import com.proyectoArgPrograma.backend.repository.ProyectoRepository;
import com.proyectoArgPrograma.backend.model.Proyecto;
import java.util.List;
/**
 *
 * @author Pablo
 */
@Service
public class ProyectoService implements IProyectoService{
    @Autowired
    private ProyectoRepository proyRepository;
    
    @Override
    public List<Proyecto> getProyectos(){
        List<Proyecto> listaProyectos = proyRepository.findAll();
        return listaProyectos;
    }
    
    @Override
    public void saveProyecto(Proyecto perso){
        proyRepository.save(perso);
    }
    
    @Override
    public void deleteProyecto(Long id){
        proyRepository.deleteById(id);
    }
    
    @Override
    public Proyecto findProyecto(Long id){
        Proyecto perso = proyRepository.findById(id).orElse(null);
        return perso;
    }
}
