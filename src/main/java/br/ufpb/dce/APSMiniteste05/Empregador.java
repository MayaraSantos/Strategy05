package br.ufpb.dce.APSMiniteste05;

public class Empregador {
	
		public static final int VENDEDOR = 1;
		public static final int GERENTE = 2;
		public static final int SUPERVISOR = 3;
		protected double salarioBase;
		protected int cargo;
		protected CalculaImposto estrategiaDeCalculo;
		
		public Empregador(int cargo, double salarioBase) {
		this.salarioBase = salarioBase;
		switch (cargo) {
		case VENDEDOR:
		estrategiaDeCalculo = new CalculoImpostoI();
		cargo = VENDEDOR;
		break;
		case SUPERVISOR:
		estrategiaDeCalculo = new CalculoImpostoI();
		cargo = SUPERVISOR;
		break;
		case GERENTE:
		estrategiaDeCalculo = new CalculoImpostoII();
		cargo = GERENTE;
		break;
		default:
		throw new RuntimeException("Cargo não encontrado :/");
		}
		}
		public double calcularSalarioComImposto() {
		return estrategiaDeCalculo.calculaSalarioComImposto(this);
		}
		public double getSalarioBase() {
		return salarioBase;
		}
		}


