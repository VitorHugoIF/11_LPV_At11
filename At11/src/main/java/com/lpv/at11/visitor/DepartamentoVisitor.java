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
public class DepartamentoVisitor implements IVisitor{

    public String exibir(IDepartamento departamento) {
        return departamento.aceitar(this);
    }
     
    @Override
    public String exibirDepartamentoFiscal(Fiscal fiscal) {
        return "Departamento Fiscal IFET { " + "código = " + fiscal.getCodigo()+ ", nome = " + fiscal.getNome() + " }";
    }

    @Override
    public String exibirDepartamentoFinanceiro(Financeiro financeiro) {
        return "Departamento Financeiro UFJF { " + "código = " + financeiro.getCodigo()+ ", nome = " + financeiro.getNome() + " }";
    }

    @Override
    public String exibirDepartamentoTecnologia(Tecnologia tecnologia) {
        return "Departamento de Tecnologia Federal { " + "código = " + tecnologia.getCodigo()+ ", nome = " + tecnologia.getNome() + " }";
    }
}
