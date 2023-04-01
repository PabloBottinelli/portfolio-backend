/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.proyectoArgPrograma.backend.service;
import com.proyectoArgPrograma.backend.model.Experiencia;
import java.util.List;
/**
 *
 * @author Pablo
 */
public interface IExperienciaService {
    public List<Experiencia> getExperiencias();
    public void saveExperiencia (Experiencia exp);
    public void deleteExperiencia(Long id);
    public Experiencia findExperiencia(Long id);
}
