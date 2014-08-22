package webservice.cotadorcombustivel;



public class teste {

	private static final String GASOLINA = "gasolina"; 
	private static final String ETANOL = "etanol"; 
	private static final String DIESEL = "diesel"; 
	
	private static final double GASOLINA$ = 2.79; 
	private static final double ETANOL$ = 1.86; 
	private static final double DIESEL$ = 2.51; 
	 
	
	
	public static void main(String[] args) {
		
	System.out.println("Gasolina R$ " + cotadorDeConbustivel("gaSolina"));	
	System.out.println("Etanol R$ " + cotadorDeConbustivel("Etanol"));	
	System.out.println("Diesel R$ " + cotadorDeConbustivel("Diesel"));	
	System.out.println("Total gasto com combustivel: " + calculoValorGastoCombustivel(12, 27, 2.79));
	System.out.println("Diesel R$ " + cotadorDeConbustivel("Oleo"));	
		
		
	}
	public static double cotadorDeConbustivel(String tipoCombustivel){
		
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
	
	public static double calculoValorGastoCombustivel(double kmPorLitro, double kmPercorrido, double valorCombustivel){
		
		return ((kmPercorrido /kmPorLitro)* valorCombustivel) * 2 ;
	}
	
}
