package com.minicurso.service;

public class FreteService {

    /**
     * Calcula o valor do frete com base no CEP.
     * Simula uma regra simples sem precisar de API externa.
     */
    public double calcularFrete(String cep) {
        if (cep.startsWith("1")) {
            return 10.0; // Região Sudeste
        } else if (cep.startsWith("2")) {
            return 20.0; // Região Sul
        } else if (cep.startsWith("3")) {
            return 30.0; // Região Nordeste
        } else {
            return 50.0; // Outras regiões
        }
    }
}
