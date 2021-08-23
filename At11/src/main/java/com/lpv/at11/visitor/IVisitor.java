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
public interface IVisitor {
    String exibirDepartamentoFiscal(Fiscal fiscal);
    String exibirDepartamentoFinanceiro(Financeiro financeiro);
    String exibirDepartamentoTecnologia(Tecnologia tecnologia);
}
