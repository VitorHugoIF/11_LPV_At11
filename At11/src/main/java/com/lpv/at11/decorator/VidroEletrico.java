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
public class VidroEletrico extends CarroDecorator {

    public VidroEletrico(ICarro carro) {
        super(carro);
    }

    @Override
    public float getPercentualPreco() {
        return 30.0f;
    }

    @Override
    public String getNomeEstrutura() {
        return "Vidro elétrico";
    }
    
}
