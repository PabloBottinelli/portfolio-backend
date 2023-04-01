/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.proyectoArgPrograma.backend.service;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import com.proyectoArgPrograma.backend.repository.PersonaRepository;
import com.proyectoArgPrograma.backend.model.Persona;
import java.util.List;

/**
 *
 * @author Pablo
 */
@Service
public class PersonaService implements IPersonaService{
    @Autowired
    private PersonaRepository persoRepository;
    
    @Override
    public List<Persona> getPersonas(){
        List<Persona> listaPersonas = persoRepository.findAll();
        return listaPersonas;
    }
    
    @Override
    public void savePersona(Persona perso){
        persoRepository.save(perso);
    }
    
    @Override
    public void deletePersona(Long id){
        persoRepository.deleteById(id);
    }
    
    @Override
    public Persona findPersona(Long id){
        Persona perso = persoRepository.findById(id).orElse(null);
        return perso;
    }
    
}