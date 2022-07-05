package br.com.adrianotakata.testejava.repository;

import br.com.adrianotakata.testejava.model.Estabelecimento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EstabelecimentoRepository extends JpaRepository<Estabelecimento, String> {
}
