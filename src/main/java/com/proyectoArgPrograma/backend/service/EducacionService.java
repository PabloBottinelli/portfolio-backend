/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.proyectoArgPrograma.backend.service;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import com.proyectoArgPrograma.backend.repository.EducacionRepository;
import com.proyectoArgPrograma.backend.model.Educacion;
import java.util.List;
/**
 *
 * @author Pablo
 */
@Service
public class EducacionService implements IEducacionService{
    @Autowired
    private EducacionRepository educRepository;
    
    @Override
    public List<Educacion> getEducaciones(){
        List<Educacion> listaEducaciones = educRepository.findAll();
        return listaEducaciones;
    }
    
    @Override
    public void saveEducacion(Educacion educ){
        educRepository.save(educ);
    }
    
    @Override
    public void deleteEducacion(Long id){
        educRepository.deleteById(id);
    }
    
    @Override
    public Educacion findEducacion(Long id){
        Educacion educ = educRepository.findById(id).orElse(null);
        return educ;
    }
}
