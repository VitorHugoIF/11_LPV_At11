/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lpv.at11.decorator;

import com.lpv.at11.decorator.CarroBasico;
import com.lpv.at11.decorator.ICarro;
import com.lpv.at11.decorator.VidroEletrico;
import com.lpv.at11.decorator.RodaLigaLeve;
import com.lpv.at11.decorator.FreioABS;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author vitor.marcelino
 */
public class CarroTest {
    
    
    @Test
    public void testDeveRetornarPrecoCarro() {
        ICarro carro = new CarroBasico(30000.0f);
        assertEquals(30000.0f, carro.getPreco());
    }
    
    @Test
    public void testDeveRetornarPrecoCarroComFreioABS() {
        ICarro carro = new FreioABS(new CarroBasico(30000.0f));
        assertEquals(33000.0f, carro.getPreco());
    }
    
    @Test
    public void testDeveRetornarPrecoCarroComRodasDeLigaLeve() {
        ICarro carro = new RodaLigaLeve(new CarroBasico(30000.0f));
        assertEquals(36000.0f, carro.getPreco());
    }
    
    @Test
    public void testDeveRetornarPrecoCarroComVidroEletrico() {
        ICarro carro = new VidroEletrico(new CarroBasico(30000.0f));
        assertEquals(39000.0f, carro.getPreco());
    }
    
    @Test
    public void testDeveRetornarPrecoCarroComFreioABSMaisRodasDeLigaLeve() {
        ICarro carro = new RodaLigaLeve(new FreioABS(new CarroBasico(30000.0f)));
        assertEquals(39600.0f, carro.getPreco());
    }
    
    @Test
    public void testDeveRetornarPrecoCarroComFreioABSMaisVidroEletrico() {
        ICarro carro = new VidroEletrico(new FreioABS(new CarroBasico(30000.0f)));
        assertEquals(42900.0f, carro.getPreco());
    }
    
    @Test
    public void testDeveRetornarPrecoCarroComRodasDeLigaLeveMaisVidroEletrico() {
        ICarro carro = new VidroEletrico(new RodaLigaLeve(new CarroBasico(30000.0f)));
        assertEquals(46800.0f, carro.getPreco());
    }
    
    @Test
    public void testDeveRetornarEstruturaCarro() {
        ICarro carro = new CarroBasico(30000.0f);
        assertEquals("B??sico", carro.getEstrutura());
    }
    
    @Test
    public void testDeveRetornarEstruturaCarroComFreioABS() {
        ICarro carro = new FreioABS(new CarroBasico(30000.0f));
        assertEquals("B??sico/ABS", carro.getEstrutura());
    }
    
    @Test
    public void testDeveRetornarEstruturaCarroComRodasDeLigaLeve() {
        ICarro carro = new RodaLigaLeve(new CarroBasico(30000.0f));
        assertEquals("B??sico/Rodas de liga leve", carro.getEstrutura());
    }
    
    @Test
    public void testDeveRetornarEstruturaCarroComVidroEletrico() {
        ICarro carro = new VidroEletrico(new CarroBasico(30000.0f));
        assertEquals("B??sico/Vidro el??trico", carro.getEstrutura());
    }
   
    @Test
    public void testDeveRetornarEstruturaCarroComFreioABSMaisRodasDeLigaLeve() {
        ICarro carro = new RodaLigaLeve(new FreioABS(new CarroBasico(30000.0f)));
        assertEquals("B??sico/ABS/Rodas de liga leve", carro.getEstrutura());
    }
    
    @Test
    public void testDeveRetornarEstruturaCarroComFreioABSMaisVidroEletrico() {
        ICarro carro = new VidroEletrico(new FreioABS(new CarroBasico(30000.0f)));
        assertEquals("B??sico/ABS/Vidro el??trico", carro.getEstrutura());
    }
    
    @Test
    public void testDeveRetornarEstruturaCarroComRodasDeLigaLeveMaisVidroEletrico() {
        ICarro carro = new VidroEletrico(new RodaLigaLeve(new CarroBasico(30000.0f)));
        assertEquals("B??sico/Rodas de liga leve/Vidro el??trico", carro.getEstrutura());
    }
}


