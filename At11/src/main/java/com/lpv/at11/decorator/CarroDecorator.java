/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lpv.at11.decorator;

/**
 *
 * @author vitor.marcelino
 */
public abstract class CarroDecorator implements ICarro {
    private ICarro carro;
    public String estrutura;

    public CarroDecorator(ICarro carro) {
        this.carro = carro;
    }

    public ICarro getCarro() {
        return carro;
    }

    public void setCurso(ICarro carro) {
        this.carro = carro;
    }

    public abstract float getPercentualPreco();

    @Override
    public float getPreco() {
        return this.carro.getPreco()* (1 + (this.getPercentualPreco() / 100));
    }

    public abstract String getNomeEstrutura();

    @Override
    public String getEstrutura() {
        return this.carro.getEstrutura() + "/" + this.getNomeEstrutura();
    }

    public void setEstrutura(String estrutura) {
        this.estrutura = estrutura;
    }
}
