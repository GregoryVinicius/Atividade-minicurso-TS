package com.minicurso.service;

import com.minicurso.model.Produto;
import java.util.List;

public class PedidoService {
    private final CalculadoraService calculadoraService;
    private final DescontoService descontoService;
    private final FreteService freteService;

    public PedidoService(CalculadoraService calculadoraService, DescontoService descontoService, FreteService freteService) {
        this.calculadoraService = calculadoraService;
        this.descontoService = descontoService;
        this.freteService = freteService;
    }

    public double finalizarPedido(List<Produto> produtos, boolean clienteVip, String cep) {
        double totalProdutos = calculadoraService.calcularTotal(produtos);
        double totalComDesconto = descontoService.aplicarDesconto(totalProdutos, clienteVip);
        double frete = freteService.calcularFrete(cep);
        return totalComDesconto + frete;
    }
}
