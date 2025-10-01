package model;

import javax.persistence.*;

import java.util.Date;

@Entity
@Table(name = "palestrante")
public class Palestrante extends Pessoa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(length = 100)
    private String biografia;
    private String especialidade;
    private String curriculo;

    public Palestrante(String nomeCompleto, String email, String telefone, String biografia, String especialidade, String curriculo) {
        super(nomeCompleto, email, telefone);
        this.biografia = biografia;
        this.especialidade = especialidade;
        this.curriculo = curriculo;
    }

    public long getId() {
        return id;
    }

    public String getBiografia() {
        return biografia;
    }

    public void setBiografia(String biografia) {
        this.biografia = biografia;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public String getCurriculo() {
        return curriculo;
    }

    public void setCurriculo(String curriculo) {
        this.curriculo = curriculo;
    }
}