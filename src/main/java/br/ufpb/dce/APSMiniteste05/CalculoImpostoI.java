package br.ufpb.dce.APSMiniteste05;

public class CalculoImpostoI implements CalculaImposto {
	
	public double calculaSalarioComImposto(Empregador umEmpregador) {
	if (umEmpregador.getSalarioBase() > 2000) {
	return umEmpregador.getSalarioBase() * 0.85;
	}
	return umEmpregador.getSalarioBase() * 0.9;
	}
	}

	
	


