/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.proyectoArgPrograma.backend.controller;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import com.proyectoArgPrograma.backend.service.ISkillService;
import org.springframework.web.bind.annotation.GetMapping;
import com.proyectoArgPrograma.backend.model.Skill;
import java.util.List;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.CrossOrigin;


@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
public class SkillController {
    @Autowired
    private ISkillService interSkill;
    
    @GetMapping("/skills/traer")
    public List<Skill> getSkills(){
        return interSkill.getSkills();
    }
    
    @PostMapping("/skills/crear")
    public void createSkill(@RequestBody Skill sk){
        interSkill.saveSkill(sk);
    }
    
    @DeleteMapping("/skills/borrar/{id}")
    public void deleteSkill (@PathVariable Long id){
        interSkill.deleteSkill(id);
    }
    
    @PutMapping("skills/editar")
    public void editSkill (@RequestBody Skill sk){
        interSkill.saveSkill(sk);
    }
}
