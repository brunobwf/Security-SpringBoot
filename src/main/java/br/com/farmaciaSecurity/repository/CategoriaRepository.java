package br.com.farmaciaSecurity.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.farmaciaSecurity.model.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria,Long> {

}
