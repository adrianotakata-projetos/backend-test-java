package br.com.adrianotakata.testejava.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@Entity
public class Estabelecimento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false)
    private String nome;
    @Column(length = 14, nullable = false)
    private String cnpj;
    @Column(nullable = false)
    private String endereco;
    @Column(length = 13, nullable = false)
    private String telefone;
    @Column(name = "quantidade_de_motos", nullable = false)
    private Integer quantidadeDeMotos;
    @Column(name = "quantidade_de_carros", nullable = false)
    private Integer quantidadeDeCarros;

    @ManyToMany(mappedBy = "estabelecimentos")
    private List<Veiculo> veiculos;

}
