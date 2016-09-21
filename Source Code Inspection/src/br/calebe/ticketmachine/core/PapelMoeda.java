package br.calebe.ticketmachine.core;

/**
 *
 * @author Calebe de Paula Bianchini
 */
public class PapelMoeda {

    private double valor;
    private double quantidade;

    public void setValor(double valor) {
        this.valor = valor;
    }

    public void setQuantidade(double quantidade) {
        this.quantidade = quantidade;
    }

    public PapelMoeda(double valor, double quantidade) {
        this.valor = valor;
        this.quantidade = quantidade;
    }

    public double getValor() {
        return valor;
    }

    public double getQuantidade() {
        return quantidade;
    }
}
