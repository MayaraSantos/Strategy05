package br.ufpb.dce.APSMiniteste05;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
   public class EmpregadorTest {
   

   @Test
   public void teste(){
	   Empregador umEmpregador = new Empregador(1, 2000);
	   assertEquals((int)umEmpregador.getSalarioBase(), 2000);
   }
     
   @Test
   public void teste2(){
	   Empregador umEmpregador2 = new Empregador(2, 1800);
	   assertEquals((int)umEmpregador2.getSalarioBase(), 1800);
		
	
   }
   @Test
   public void teste3(){
	   Empregador umEmpregador3 = new Empregador(3, 3000);
	   assertEquals((int)umEmpregador3.getSalarioBase(), 3000);
		
   
   }
   public void test4(){
	   CalculoImpostoI calculo = new CalculoImpostoI();
	   Empregador empregador = null;
	equals((double)calculo.calculaSalarioComImposto(empregador));
   }
   }
