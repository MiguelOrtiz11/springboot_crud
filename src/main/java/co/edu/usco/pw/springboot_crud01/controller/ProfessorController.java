package co.edu.usco.pw.springboot_crud01.controller;

import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ProfessorController {


    @RequestMapping(value = "/professor", method = RequestMethod.GET)
    public String showProfessorPage(ModelMap model) {
        if (isUserProfessor()) {
            // Obtener información específica para profesores
            String professorInfo = "Información para profesores...";
            model.addAttribute("professorInfo", professorInfo);
            return "professor";
        } else {
            // Manejar caso en el que el usuario no tiene el rol de profesor
            return "access-denied"; // Página de acceso denegado o redirección a otro lugar
        }
    }

    private String getLoggedinUserName() {
        Object principal = SecurityContextHolder.getContext()
                .getAuthentication().getPrincipal();

        if (principal instanceof UserDetails) {
            return ((UserDetails) principal).getUsername();
        }

        return principal.toString();
    }
    private boolean isUserProfessor() {
        Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();

        if (principal instanceof UserDetails) {
            UserDetails userDetails = (UserDetails) principal;
            return userDetails.getAuthorities().stream().anyMatch(a -> a.getAuthority().equals("PROFESSOR"));
        }

        return false;
    }
}
