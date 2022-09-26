package com.curso.springboot.controllers;

import com.curso.springboot.model.entities.Produto;
import com.curso.springboot.model.repositories.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/produtos")
public class ProdutoController {

    @Autowired
    private ProdutoRepository produtoRepository;

    public Produto novoProduto(Produto produto) {
        produtoRepository.save(produto);
        return produto;
    }
}
