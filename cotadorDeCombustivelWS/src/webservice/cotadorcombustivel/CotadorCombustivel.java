package webservice.cotadorcombustivel;

import javax.ejb.Stateless;
import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
@Stateless
public class CotadorCombustivel {

	private static final String GASOLINA = "gasolina"; 
	private static final String ETANOL = "etanol"; 
	private static final String DIESEL = "diesel"; 
	
	private static final double GASOLINA$ = 2.79; 
	private static final double ETANOL$ = 1.86; 
	private static final double DIESEL$ = 2.51; 
	 
	@WebMethod
	public double cotadorDeConbustivel(String tipoCombustivel){
		
		if(GASOLINA.equalsIgnoreCase(tipoCombustivel)){
			return 	GASOLINA$;
		}else if(ETANOL.equalsIgnoreCase(tipoCombustivel)){
			return 	ETANOL$;
		}else if(DIESEL.equalsIgnoreCase(tipoCombustivel)){
			return 	DIESEL$;
			}else{
				throw new RuntimeException("Combustivel informado é desconhecido.....".toUpperCase());
			}
		}
	
	@WebMethod
	public double calculoValorGastoCombustivel(double kmPorLitro, double kmPercorrido, double valorCombustivel){
		
		return ((kmPercorrido /kmPorLitro)* valorCombustivel) * 2 ;
	}
}
