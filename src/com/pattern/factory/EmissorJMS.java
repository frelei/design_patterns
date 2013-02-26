package com.pattern.factory;

/**
 * Uma Implementa��o JMS do emissor 	
 * @author Rodrigo
 *
 */

public class EmissorJMS implements Emissor {

	@Override
	public void emitir(String mensagem) {
		System.out.println("Emitir mensagem por JMS");
		System.out.println(mensagem);
	}
}
