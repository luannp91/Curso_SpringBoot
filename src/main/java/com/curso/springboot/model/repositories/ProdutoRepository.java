package com.curso.springboot.model.repositories;

import com.curso.springboot.model.entities.Produto;
import org.springframework.data.repository.CrudRepository;

public interface ProdutoRepository extends CrudRepository<Produto, Integer> {
}
