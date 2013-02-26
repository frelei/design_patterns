package com.pattern.factory;

/**
 * Uma implementa��o Email do Emissor 
 * 
 * @author Rodrigo
 * 
 */

public class EmissorEmail implements Emissor {

	@Override
	public void emitir(String mensagem) {
		System.out.println("Enviando por email");
		System.out.println(mensagem);
	}
}
