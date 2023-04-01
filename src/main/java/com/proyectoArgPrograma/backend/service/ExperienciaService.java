/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.proyectoArgPrograma.backend.service;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import com.proyectoArgPrograma.backend.repository.ExperienciaRepository;
import com.proyectoArgPrograma.backend.model.Experiencia;
import java.util.List;
/**
 *
 * @author Pablo
 */
@Service
public class ExperienciaService implements IExperienciaService{
    @Autowired
    private ExperienciaRepository expRepository;
    
    @Override
    public List<Experiencia> getExperiencias(){
        List<Experiencia> listaExperiencias = expRepository.findAll();
        return listaExperiencias;
    }
    
    @Override
    public void saveExperiencia(Experiencia exp){
        expRepository.save(exp);
    }
    
    @Override
    public void deleteExperiencia(Long id){
        expRepository.deleteById(id);
    }
    
    @Override
    public Experiencia findExperiencia(Long id){
        Experiencia exp = expRepository.findById(id).orElse(null);
        return exp;
    }
}
