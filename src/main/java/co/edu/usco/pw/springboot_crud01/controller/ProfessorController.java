package co.edu.usco.pw.springboot_crud01.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/professor")
public class ProfessorController {

    @RequestMapping(method = RequestMethod.GET)
    public String showStudentPage() {
        return "professor"; // Devuelve el nombre de la vista que mostrará la página exclusiva para estudiantes
    }
}
