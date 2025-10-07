package com.minicurso.service;

import java.util.List;
import com.minicurso.model.Produto;

public class CalculadoraService {
    public double calcularTotal(List<Produto> produtos){
        return produtos.stream().mapToDouble(Produto::getPreco).sum();
    }
}
