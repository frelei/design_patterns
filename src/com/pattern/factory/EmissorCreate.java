package com.pattern.factory;

/**
 * Classe ou interface que define a assinatura reponsável pela criação do produto.
 * Possui uma implementação padrão do método de criação do produto
 * @author Rodrigo
 *
 */

public class EmissorCreate implements TypeEmissor{
		
	/**
	 * FactoryMethod. Método criador de implementações da interface Emissor 
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
			default : throw new IllegalArgumentException("Tipo não suportado");
		}
	}
}