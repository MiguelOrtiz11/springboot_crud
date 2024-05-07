package co.edu.usco.pw.springboot_crud01.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity

// Por motivos de tiempo y no desajustar los controladores
// no le cambio el nombre de la tabla
@Table(name = "todos")
public class Todo {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @NotNull
    private String userName;

    @NotNull
    @Size(min = 10, max = 30)
    private String nombre;

    @Size(max = 100)
    private String descripcion;

    @NotNull
    private int salon;

    @NotNull
    private String horarioInicio;

    @NotNull
    private String horarioFin;

    @NotNull
    private String docenteEncargado;


    // Metodo super
    public Todo() {
        super();
    }

    // Constructor
    public Todo(long id, String docenteEncargado, String user, String nombre, String descripcion, String horarioInicio, int salon, String horarioFin) {
        this.id = id;
        this.docenteEncargado = docenteEncargado; //String
        this.userName = user;
        this.nombre = nombre; //String
        this.descripcion = descripcion; //String
        this.horarioInicio = horarioInicio; //String
        this.salon = salon; //Int
        this.horarioFin = horarioFin; //String
    }

    // Setters y Getters
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public @NotNull @Size(min = 10, max = 30) String getNombre() {
        return nombre;
    }

    public void setNombre(@NotNull @Size(min = 10, max = 30) String nombre) {
        this.nombre = nombre;
    }

    public @Size(max = 100) String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(@Size(max = 100) String descripcion) {
        this.descripcion = descripcion;
    }

    @NotNull
    public int getSalon() {
        return salon;
    }

    public void setSalon(@NotNull int salon) {
        this.salon = salon;
    }

    public @NotNull String getHorarioInicio() {
        return horarioInicio;
    }

    public void setHorarioInicio(@NotNull String horarioInicio) {
        this.horarioInicio = horarioInicio;
    }

    public @NotNull String getHorarioFin() {
        return horarioFin;
    }

    public void setHorarioFin(@NotNull String horarioFin) {
        this.horarioFin = horarioFin;
    }

    public @NotNull String getDocenteEncargado() {
        return docenteEncargado;
    }

    public void setDocenteEncargado(@NotNull String docenteEncargado) {
        this.docenteEncargado = docenteEncargado;
    }
}