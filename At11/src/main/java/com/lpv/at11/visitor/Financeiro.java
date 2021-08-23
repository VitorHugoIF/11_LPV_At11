/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lpv.at11.visitor;

/**
 *
 * @author vitor.marcelino
 */
public class Financeiro extends Departamento implements IDepartamento {

    public Financeiro(int codigo, String nome) {
        super(codigo, nome);
    }

    @Override
    public String aceitar(IVisitor visitor) {
        return visitor.exibirDepartamentoFinanceiro(this);
    }   
}
