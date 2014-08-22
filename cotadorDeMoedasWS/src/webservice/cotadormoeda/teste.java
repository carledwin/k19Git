package webservice.cotadormoeda;

public class teste {

	private static final double DOLAR = 2.37;
	private static final double EURO = 3.18;
	private static final double PESO = 0.29;
	private static final double IENE = 0.02;
	private static final double LIBRA = 4.02;
	
	public static void main(String[] args) {
		
		double valor = 1.50;
		double valor2 = 5.52;
		
	System.out.println("R$ " + conversorDeMoedaParaReal("dolar", valor));	
	
	System.out.println("Moeda " + conversorDeRealParaMoeda("dolar", valor2));	
		
		
		
	}
	
	
	public static double conversorDeRealParaMoeda(String tipoMoeda, double valor){
		
		if("dolar".equals(tipoMoeda)){
			return 	valor / DOLAR;
		}else if("euro".equals(tipoMoeda)){
			return 	valor / EURO;
		}else if("peso".equals(tipoMoeda)){
			return 	valor / PESO;
			}else if("iene".equals(tipoMoeda)){
				return 	valor / IENE;
			}else{
				throw new RuntimeException("Moeda informada é desconhecida.....");
			}
		}
	
	public static double conversorDeMoedaParaReal(String tipoMoeda, double valor){
		
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
