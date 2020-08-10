package br.com.farmaciaSecurity.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.farmaciaSecurity.model.Produto;

public interface ProdutoRepository extends JpaRepository<Produto,Long>{

}
