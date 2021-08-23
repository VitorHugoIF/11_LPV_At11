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
public class FreioABS extends CarroDecorator{

    public FreioABS(ICarro carro) {
        super(carro);
    }

    @Override
    public float getPercentualPreco() {
        return 10.0f;
    }
    
    @Override
    public String getNomeEstrutura() {
        return "ABS";
    }   
}
