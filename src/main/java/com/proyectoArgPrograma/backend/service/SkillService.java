/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.proyectoArgPrograma.backend.service;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import com.proyectoArgPrograma.backend.repository.SkillRepository;
import com.proyectoArgPrograma.backend.model.Skill;
import java.util.List;

/**
 *
 * @author Pablo
 */
@Service
public class SkillService implements ISkillService{
    @Autowired
    private SkillRepository skRepository;
    
    @Override
    public List<Skill> getSkills(){
        List<Skill> listaSkills = skRepository.findAll();
        return listaSkills;
    }
    
    @Override
    public void saveSkill(Skill sk){
        skRepository.save(sk);
    }
    
    @Override
    public void deleteSkill(Long id){
        skRepository.deleteById(id);
    }
    
    @Override
    public Skill findSkill(Long id){
        Skill sk = skRepository.findById(id).orElse(null);
        return sk;
    }
}
