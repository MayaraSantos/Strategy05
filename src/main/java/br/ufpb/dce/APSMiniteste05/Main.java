package br.ufpb.dce.APSMiniteste05;


public class Main {
    public static void main( String[] args ){
    	Empregador umEmpregador = new Empregador(Empregador.VENDEDOR,
    			2100);
    			System.out.println(umEmpregador.calcularSalarioComImposto());
    			Empregador outroFuncionario = new Empregador(Empregador.VENDEDOR,
    			1700);
    			System.out.println(outroFuncionario.calcularSalarioComImposto());
    			}
}
