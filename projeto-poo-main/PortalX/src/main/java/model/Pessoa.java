package model;

import javax.persistence.*;

import java.util.Date;

@MappedSuperclass
public abstract class Pessoa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(length = 100)
    private String nomeCompleto;
    private String email;
    private String telefone;

    public Pessoa(String nomeCompleto, String email, String telefone) {
        this.nomeCompleto = nomeCompleto;
        this.email = email;
        this.telefone = telefone;
    }

    public long getId() {
        return id;
    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
}