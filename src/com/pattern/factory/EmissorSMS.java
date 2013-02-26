package com.pattern.factory;

/**
 * Uma implementação SMS do emissor	
 * 
 * @author Rodrigo
 * 
 *
 */

public class EmissorSMS implements Emissor {

	@Override
	public void emitir(String mensagem) {
		System.out.println("Enviando mensagem por sms");
		System.out.println(mensagem);
	}

}
