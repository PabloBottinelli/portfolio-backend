/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.proyectoArgPrograma.backend.service;
import com.proyectoArgPrograma.backend.model.Educacion;
import java.util.List;

/**
 *
 * @author Pablo
 */
public interface IEducacionService {
    public List<Educacion> getEducaciones();
    public void saveEducacion (Educacion educ);
    public void deleteEducacion(Long id);
    public Educacion findEducacion(Long id);
}
