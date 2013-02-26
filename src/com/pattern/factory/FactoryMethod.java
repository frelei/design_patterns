package com.pattern.factory;

/** 
 * Factory Method: Encapsulara escolhada classe concreta
 *  a ser utilizadana criação de objetos de um determinado tipo.
 *   
 */   

public class FactoryMethod {

	public static void main(String[] args){
	
		EmissorCreate emissorCreate = new EmissorCreate();
		
		Emissor email = emissorCreate.create(EmissorCreate.EMISSOR_EMAIL);
		Emissor sms = emissorCreate.create(EmissorCreate.EMISSOR_SMS);
		Emissor jms = emissorCreate.create(EmissorCreate.EMISSOR_JMS);
		
		email.emitir("--Nome do cliente no email--");	
		sms.emitir("--Enviando para o celular do cliente tal--");
		jms.emitir("--Enviando por jms uma mensagem personalisada--");
		
		
	}
	
}
