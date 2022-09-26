package com.curso.springboot.model.repositories;

import com.curso.springboot.model.entities.Produto;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface ProdutoRepository extends PagingAndSortingRepository<Produto, Integer> {
}
