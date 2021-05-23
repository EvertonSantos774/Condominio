package br.uniso.condominio.model.entity;

import lombok.Data;
import lombok.experimental.Accessors;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Data
@Entity
@Accessors(chain = true)
@Table(name = "condominio.morador")
public class Morador implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "cpf", nullable = false)
    private Long cpf;

    @Column(name = "nome", nullable = false)
    private String nome;

    @Column(name = "numero_apt", nullable = false)
    private Integer numeroApt;

    @Column(name = "bloco", nullable = false)
    private String bloco;

}
