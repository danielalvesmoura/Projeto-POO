package model;

import javax.persistence.*;

import java.util.Date;

@Entity
@Table(name = "inscricao")
public class Inscricao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(length = 100)
    private Date dataCriacao;
    private Enum status;
    private Enum tipoIngresso;

    public long getId() {
        return id;
    }

    public Date getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao(Date dataCriacao) {
        this.dataCriacao = dataCriacao;
    }

    public Enum getStatus() {
        return status;
    }

    public void setStatus(Enum status) {
        this.status = status;
    }

    public Enum getTipoIngresso() {
        return tipoIngresso;
    }

    public void setTipoIngresso(Enum tipoIngresso) {
        this.tipoIngresso = tipoIngresso;
    }
}