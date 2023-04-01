/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.proyectoArgPrograma.backend.service;
import com.proyectoArgPrograma.backend.model.Persona;
import java.util.List;

/**
 *
 * @author Pablo
 */
public interface IPersonaService {
    public List<Persona> getPersonas();
    public void savePersona (Persona perso);
    public void deletePersona(Long id);
    public Persona findPersona(Long id);
}

