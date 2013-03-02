package com.pattern.decorator;

public class Main {

	public static void main(String[] args) {
	
		Sorvete sundae = new Morango(new Chocolate(new Sundae()));
		System.out.println(sundae.descricao());
		System.out.println(sundae.custo());
		
		Sorvete casquinha = new Baunilha(new Morango(new Casquinha()));
		System.out.println(casquinha.descricao());
		System.out.println(casquinha.custo());
	}

}
