package com.minicurso.service;

public class DescontoService {
    public double aplicarDesconto(double total, boolean clienteVip) {
        if (clienteVip) {
            return total * 0.9; // 10% de desconto
        }
        return total;
    }
}
