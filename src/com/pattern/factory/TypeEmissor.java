package com.pattern.factory;

/**
 * Tipos de Emissores
 * @author Rodrigo
 *
 */


public interface TypeEmissor {

	/**
	 * EMISSOR_EMAIL, value = 1
	 */
	int EMISSOR_EMAIL = 1;
	
	/**
	 * EMISSOR_SMS, value = 2
	 */
	int EMISSOR_SMS = 2; 
	
	/**
	 * EMISSOR_JMS, value = 3
	 */
	int EMISSOR_JMS = 3;
	
}
