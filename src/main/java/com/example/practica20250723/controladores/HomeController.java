package com.example.practica20250723.controladores;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String holaMundo(Model model) {
        model.addAttribute("mensaje", "Hola Mundo");
        return "hola"; // Busca la vista hola.html en src/main/resources/templates/
    }
}
