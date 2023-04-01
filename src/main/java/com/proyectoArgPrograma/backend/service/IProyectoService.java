/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.proyectoArgPrograma.backend.service;
import com.proyectoArgPrograma.backend.model.Proyecto;
import java.util.List;
/**
 *
 * @author Pablo
 */
public interface IProyectoService {
    public List<Proyecto> getProyectos();
    public void saveProyecto (Proyecto proy);
    public void deleteProyecto(Long id);
    public Proyecto findProyecto(Long id);
}
