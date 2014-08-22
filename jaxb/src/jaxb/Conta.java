package jaxb;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement //anotação para maperar esta classe como passível e conversão para XML
public class Conta {
	
	private double saldo;
	private double limite;
	private Cliente cliente;
	
	public Conta() {}
	
	public Conta(double saldo, double limite, Cliente cliente) {
		this.saldo = saldo;
		this.limite = limite;
		this.cliente = cliente;
	}
	
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public double getLimite() {
		return limite;
	}
	public void setLimite(double limite) {
		this.limite = limite;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
}
