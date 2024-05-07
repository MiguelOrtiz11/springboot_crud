package co.edu.usco.pw.springboot_crud01.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "docente")
public class Docente {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @NotNull
    private String nombreProfesor;

    @NotNull
    private String materia;


    // Metodo super
    public Docente() {
        super();
    }

    // Constructor
    public Docente(long id, String nombreProfesor, String materia) {
        this.id = id;
        this.nombreProfesor = nombreProfesor;
        this.materia = materia;
    }


    // Getters y Setters
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNombreProfesor() {
        return nombreProfesor;
    }

    public void setNombreProfesor(String nombreProfesor) {
        this.nombreProfesor = nombreProfesor;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }
}
