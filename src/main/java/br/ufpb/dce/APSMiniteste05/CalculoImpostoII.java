package br.ufpb.dce.APSMiniteste05;

public class CalculoImpostoII implements CalculaImposto{
	
	public double calculaSalarioComImposto(Empregador umEmpregador) {
	  if (umEmpregador.getSalarioBase() > 3500) {
	return umEmpregador.getSalarioBase() * 0.8;
	  }
	return umEmpregador.getSalarioBase() * 0.85;
	}

}
