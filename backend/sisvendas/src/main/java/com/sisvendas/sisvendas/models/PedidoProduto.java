package com.sisvendas.sisvendas.models;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "PEDIDOPRODUTO")
public class PedidoProduto extends BaseModel {
    
    private long qantidade;
    private double totalItem;

    @ManyToOne
    @JoinColumn(name = "pedido_id")
    private Pedido pedido;

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "produto_id")
    private Produto produto;

    public long getQantidade() {
        return qantidade;
    }

    public void setQantidade(long qantidade) {
        this.qantidade = qantidade;
    }

    public double getTotalItem() {
        return totalItem;
    }

    public void setTotalItem(double totalItem) {
        this.totalItem = totalItem;
    }

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }
}
