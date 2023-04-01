/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.proyectoArgPrograma.backend.repository;
import com.proyectoArgPrograma.backend.model.Skill;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
/**
 *
 * @author Pablo
 */
@Repository
public interface SkillRepository extends JpaRepository <Skill, Long>{
    
}
