/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lpv.at11.visitor;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author vitor.marcelino
 */
public class DepartamentoVisitorTest {
    
    @Test
    public void testDeveExibirDepartamentoFiscal() {
        Fiscal fiscal = new Fiscal(1, "Dep. Fical 01");
        DepartamentoVisitor visitor = new DepartamentoVisitor();
        assertEquals("Departamento Fiscal IFET { código = " + fiscal.getCodigo()+ ", nome = " + fiscal.getNome() + " }", visitor.exibir(fiscal));
    }
    
    @Test
    public void testDeveExibirDepartamentoFinanceiro() {
        Financeiro financeiro = new Financeiro(1, "Dep. Financeiro 01");
        DepartamentoVisitor visitor = new DepartamentoVisitor();
        assertEquals("Departamento Financeiro UFJF { " + "código = " + financeiro.getCodigo()+ ", nome = " + financeiro.getNome() + " }", visitor.exibir(financeiro));
    }
    
    @Test
    public void testDeveExibirDepartamentoDeTecnologia() {
        Tecnologia tecnologia = new Tecnologia(1, "Dep. de Tecnologia 01");
        DepartamentoVisitor visitor = new DepartamentoVisitor();
        assertEquals("Departamento de Tecnologia Federal { " + "código = " + tecnologia.getCodigo()+ ", nome = " + tecnologia.getNome() + " }", visitor.exibir(tecnologia));
    }
}
