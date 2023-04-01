/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.proyectoArgPrograma.backend.service;
import com.proyectoArgPrograma.backend.model.Skill;
import java.util.List;

/**
 *
 * @author Pablo
 */
public interface ISkillService {
    public List<Skill> getSkills();
    public void saveSkill (Skill sk);
    public void deleteSkill(Long id);
    public Skill findSkill(Long id);
}
