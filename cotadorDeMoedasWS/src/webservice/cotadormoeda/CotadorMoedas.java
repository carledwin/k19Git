package webservice.cotadormoeda;

import javax.ejb.Stateless;
import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
@Stateless
public class CotadorMoedas {

	private static final double DOLAR = 2.37;
	private static final double EURO = 3.18;
	private static final double PESO = 0.29;
	private static final double IENE = 0.02;
	private static final double LIBRA = 4.02;

	@WebMethod
	public double conversorDeRealParaMoeda(String tipoMoeda, double valor){
		
		if("dolar".equalsIgnoreCase(tipoMoeda)){
			return 	valor / DOLAR;
		}else if("euro".equalsIgnoreCase(tipoMoeda)){
			return 	valor / EURO;
		}else if("peso".equalsIgnoreCase(tipoMoeda)){
			return 	valor / PESO;
			}else if("iene".equalsIgnoreCase(tipoMoeda)){
				return 	valor / IENE;
			}else{
				throw new RuntimeException("Moeda informada é desconhecida.....");
			}
		}
	
	@WebMethod
	public double conversorDeMoedaParaReal(String tipoMoeda, double valor){
		
		if("dolar".equals(tipoMoeda)){
			return 	DOLAR * valor;
		}else if("euro".equals(tipoMoeda)){
			return 	EURO * valor;
		}else if("peso".equals(tipoMoeda)){
			return 	PESO * valor;
			}else if("iene".equals(tipoMoeda)){
				return 	IENE * valor;
			}else{
				throw new RuntimeException("Moeda informada é desconhecida.....");
			}
		}

}
