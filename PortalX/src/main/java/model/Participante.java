package model;

import javax.persistence.*;

import java.util.Date;

@Entity
@Table(name = "participante")
public class Participante extends Pessoa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(length = 100)
    private String empresa;
    private String cargo;

    public Participante(String nomeCompleto, String email, String telefone, String empresa, String cargo) {
        super(nomeCompleto, email, telefone);
        this.empresa = empresa;
        this.cargo = cargo;
    }

    public long getId() {
        return id;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
}