package com.pattern.observer;

public class Main {

	public static void main(String[] args) {
		// criamos o subject
		BolsaValores bolsa = new BolsaValores();
		
		// Criamos os observer e registramos ele no subject
		Observer corretoraA = new CorretoraA(bolsa);
		Observer corretoraB = new CorretoraB(bolsa);
		
		//bolsa manda valores de ações
		bolsa.setValor_da_bolsa(1000);
		bolsa.setValor_da_bolsa(50);
		bolsa.setValor_da_bolsa(5000);
		
		

	}

}
