package br.com.k19.managedbeans;

import java.util.ArrayList;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.enterprise.inject.Produces;
import javax.faces.bean.ManagedBean;
import javax.inject.Named;

@ManagedBean
public class GeradorDeNumeros {

	@Named
	@Produces
	@RequestScoped
	public List<Double> getNumeros(){
		
		System.out.println("GERANDO NÚMEROS...");
		
		List<Double> numeros = new ArrayList<Double>();
		for (int i = 0; i < 5; i++) {
			numeros.add(Math.random());
		}
		return numeros;
	}
}
