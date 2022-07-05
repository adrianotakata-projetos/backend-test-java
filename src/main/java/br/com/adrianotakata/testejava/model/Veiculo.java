package br.com.adrianotakata.testejava.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@Entity(name = "veiculo")
public class Veiculo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name="marca", length = 50, nullable = false)
    private String marca;
    @Column(name="modelo", length = 50, nullable = false)
    private String modelo;
    @Column(name="cor", length = 25, nullable = false)
    private String cor;
    @Column(name="placa", length = 7, nullable = false)
    private String placa;
    @Column(name="tipo", length = 20, nullable = false)
    private String tipo;

    @ManyToMany
    @JoinTable(
            name = "estabelecimento_veiculo",
            joinColumns = {@JoinColumn(name = "placa_veiculo")},
            inverseJoinColumns = {@JoinColumn(name = "cnpj_estabelecimento")}
    )
    private List<Estabelecimento> estabelecimentos;

}
