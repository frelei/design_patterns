package com.pattern.factory;

/**
 * Classe ou interface que define a assinatura repons�vel pela cria��o do produto.
 * Possui uma implementa��o padr�o do m�todo de cria��o do produto
 * @author Rodrigo
 *
 */

public class EmissorCreate implements TypeEmissor{
		
	/**
	 * FactoryMethod. M�todo criador de implementa��es da interface Emissor 
	 * @param tipoEmissor Uma constante inteira 
	 * @return Emissor
	 * @see TypeEmissor
	 * @throws IllegalArgumentException
	 */
	
	public Emissor create(int typeEmissor){
	
		switch(typeEmissor){
			case 1 : return new EmissorEmail();
			case 2 : return new EmissorSMS(); 
			case 3 : return new EmissorJMS();	
			default : throw new IllegalArgumentException("Tipo n�o suportado");
		}
	}
}