package com.pattern.observer;

import java.util.ArrayList;
import java.util.List;

public class BolsaValores implements Subject {

	private List<Observer> observers;
	private int valor_da_bolsa;

	public BolsaValores() {
		observers = new ArrayList<Observer>();
	}

	@Override
	public void addObserver(Observer o) {
		observers.add(o);
	}

	@Override
	public void removeObserver(Observer o) {
		int index = observers.indexOf(o);
		if (index != -1)
			observers.remove(index);
	}

	@Override
	public void notifyObserver() {
		for (Observer observe : observers)
			observe.update(valor_da_bolsa);
	}

	
	// Getters e Setters
	public List<Observer> getObservers() {
		return observers;
	}

	public void setObservers(List<Observer> observers) {
		this.observers = observers;
	}

	public int getValor_da_bolsa() {
		return valor_da_bolsa;
	}

	public void setValor_da_bolsa(int valor_da_bolsa) {
		this.valor_da_bolsa = valor_da_bolsa;
		/* 
		 * Aqui damos um update em todos os observers ao trocar o 
		 * valor  
		 * */
		notifyObserver();
	}
}
