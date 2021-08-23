/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lpv.at11;

/**
 *
 * @author vitor.marcelino
 */
public class CarroBasico implements ICarro {

    public float preco;
    
    public CarroBasico() {
    }

    public CarroBasico(float preco) {
        this.preco = preco;
    }

    @Override
    public float getPreco() {
        return preco;
    }

    @Override
    public String getEstrutura() {
        return "Básico";
    }
    
}
