package com.clientdaw.clientdaw.controller;

import com.clientdaw.clientdaw.entities.Alumne;
import com.clientdaw.clientdaw.service.AlumneService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class ClientController {


    private final AlumneService as;

    public ClientController(AlumneService as) {
        this.as = as;
    }


    @RequestMapping("/")
    public String llistarAlumnes(Model model){
        //aqui buscaré alumnes i quan els tingui..
        List<Alumne> llista = as.getAlumnes();
        model.addAttribute("llistaAlumnes",llista);
        return "llistaAlumnes";  //aquesta pàgina ha de ser un template a través de Tymeleaf
    }

    @RequestMapping("/hola")
    public String saluda(){
        //aqui buscaré alumnes i quan els tingui..
        //List<Alumne> llista = as.getAlumnes();
        //model.addAttribute("llistaAlumnes",llista);
        return "hola";  //aquesta pàgina ha de ser un template a través de Tymeleaf
    }



}
