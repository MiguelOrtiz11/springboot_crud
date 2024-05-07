package co.edu.usco.pw.springboot_crud01.model;

import javax.persistence.*;

@Entity
@Table(name = "roles")
public class Roles {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long rolId;


    private String rolNombre;

    public Roles() {
    }

    public Roles(Long rolId, String rolNombre) {
        super();
        this.rolId = rolId;
        this.rolNombre = rolNombre;
    }

    public Roles(String rolNombre) {
        this.rolNombre = rolNombre;
    }

    public Long getRolId() {
        return rolId;
    }

    public void setRolId(Long rolId) {
        this.rolId = rolId;
    }

    public String getRolNombre() {
        return rolNombre;
    }

    public void setRolNombre(String rolNombre) {
        this.rolNombre = rolNombre;
    }
}
