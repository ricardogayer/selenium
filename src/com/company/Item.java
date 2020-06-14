package com.company;

public class Item {

    private String chaveDeAcesso;
    private String produto;
    private String codigo;
    private String unidade;
    private String valorUnitário;
    private String quantidade;
    private String valorTotal;

    public Item() {
    }

    public String getChaveDeAcesso() {
        return chaveDeAcesso;
    }

    public void setChaveDeAcesso(String chaveDeAcesso) {
        this.chaveDeAcesso = chaveDeAcesso;
    }

    public String getProduto() {
        return produto;
    }

    public void setProduto(String produto) {
        this.produto = produto;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getUnidade() {
        return unidade;
    }

    public void setUnidade(String unidade) {
        this.unidade = unidade;
    }

    public String getValorUnitário() {
        return valorUnitário;
    }

    public void setValorUnitário(String valorUnitário) {
        this.valorUnitário = valorUnitário;
    }

    public String getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(String quantidade) {
        this.quantidade = quantidade;
    }

    public String getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(String valorTotal) {
        this.valorTotal = valorTotal;
    }

    @Override
    public String toString() {

        String resultado;

        resultado = "Chave: " + getChaveDeAcesso() + "\n";
        resultado = resultado + "Código: " + getCodigo() + "\n";
        resultado = resultado + "Produto: " + getProduto() + "\n";
        resultado = resultado +"Unidade: " + getUnidade()+ "\n";
        resultado = resultado +"Valor Unitário: " + getValorUnitário() + "\n";
        resultado = resultado +"Quantidade: " + getQuantidade() + "\n";
        resultado = resultado +"Valor Total: " + getValorTotal() + "\n";

        return resultado;

    }
}
