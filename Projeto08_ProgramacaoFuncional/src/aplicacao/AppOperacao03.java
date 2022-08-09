package aplicacao;

import interfaces.Operacao03;

public class AppOperacao03 {
	public static void main(String[] args) {
		
		Operacao03<String> op1 = p -> p.replace(" ","").length();		
		Operacao03<Integer> op2 = p -> p;
		
		System.out.println("op1: " + op1.executar("Programação Funcional"));
		System.out.println("op2: " + op2.executar(120));				
		
	}

}
