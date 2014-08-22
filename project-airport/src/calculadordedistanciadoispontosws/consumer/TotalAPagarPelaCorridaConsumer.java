package calculadordedistanciadoispontosws.consumer;


import calculadordedistanciadoispontosws.calculador.CalculadorDeDistanciaDoisPontos;
import calculadordedistanciadoispontosws.calculador.CalculadorDeDistanciaDoisPontosService;
import webservice.cotadorcombustivel.CotadorCombustivel;
import webservice.cotadorcombustivel.CotadorCombustivelService;
import webservice.cotadormoeda.CotadorMoedas;
import webservice.cotadormoeda.CotadorMoedasService;
import webservice.validadorcpfcnpj.ValidadorCPFCNPJ;
import webservice.validadorcpfcnpj.ValidadorCPFCNPJService;



public class TotalAPagarPelaCorridaConsumer {

	/*
	 * Possíveis valores adicionais
	 * O calculador não inclui no resultado:
	 * Tempo parado, por hora: R$ 33,00 (comum); R$ 41,25 (especial); R$ 49,50 (luxo)
	 * Adicional de viagens metropolitanas: 50%, se não houver retorno do passageiro.
	 * Bagagem adicional: comum: R$ R$ 2,50; especial: R$ 3,13; luxo: R$ 3,75
	 * Rádio chamada: comum: R$ R$ 4,10; especial: R$ 5,13
	 * Rádio chamada com hora marcada: comum: R$ 8,20; especial: R$ 10,25
	 * A estimativa é válida apenas para viagens dentro do município.
	 * Valores
	 * Os valores utilizados para cálculo são:
	 * Bandeirada: R$ R$ 4,10 (comum); R$ 5,13 (especial); R$ 6,15 (luxo)
	 * Quilômetro rodado: 
	 * comum: R$ 2,50 (bandeira 1) ou R$ 3,25 (bandeira 2); 
	 * especial: R$ 3,13 (b. 1) ou R$ 4,07 (b. 2); 
	 * luxo: R$ 3,75 (b. 1) ou R$ 4,88 (b. 2)
	*/		
	
	
	/*
	 *Pendente 
	 *
	 * 41 (Opcional) Substitua o web service de cotação de moeda implementado anteriormente pelo web service da WebserviceX.NET. O WSDL desse web service pode ser obtido através da 
	 * http:// www.webservicex.net/CurrencyConvertor.asmx?WSDL .

	 * 42 (Opcional) Substitua a lógica fictícia de validação de CPF ou CNPJ pela lógica real. Tentar validar com a Receita Federal - Fazenda

	 * 43 (Opcional) Pesquise algum serviço que calcule a distância entre dois pontos e implemente um cliente.

	 * 
	 */
	
	private static final double VALOR_KM_COMUM_BANDEIRA1 = 2.50; 
	private static final double VALOR_KM_COMUM_BANDEIRA2 = 3.25; 
	private static final double VALOR_KM_ESPECIAL_BANDEIRA1 = 3.13; 
	private static final double VALOR_KM_ESPECIAL_BANDEIRA2 = 4.07; 
	private static final double VALOR_KM_LUXO_BANDEIRA1 = 3.75; 
	private static final double VALOR_KM_LUXO_BANDEIRA2 = 4.88; 
	
	
public static void main(String[] args) {
		
		
		System.out.println("Preparando para consumir o WS ValidadorCPFCNPJ....");
		//service - WS ValidadorCPFCNPJ
		ValidadorCPFCNPJService validadorCPFCNPJService = new ValidadorCPFCNPJService();
			//proxy
			ValidadorCPFCNPJ proxyValidadorCPFCNPJ = validadorCPFCNPJService.getValidadorCPFCNPJPort();
				System.out.println("Proxy proxyValidadorCPFCNPJ criado com sucesso....");
		
						
			System.out.println("Preparando para consumir o WS CotadorMoedas....");
			//service - WS CotadorMoedas
			CotadorMoedasService cotadorMoedasService = new CotadorMoedasService();
				//proxy
				CotadorMoedas proxyCotadorMoedas = cotadorMoedasService.getCotadorMoedasPort();
				System.out.println("Proxy proxyCotadorMoedas criado com sucesso....");
				
						
				System.out.println("Preparando para consumir o WS CotadorCombustivelWS....");
				//service - WS CotadorCombustivel
				CotadorCombustivelService cotadorCombustivelService = new CotadorCombustivelService();
					//proxy
					CotadorCombustivel proxyCotadorCombustivel = cotadorCombustivelService.getCotadorCombustivelPort();
					System.out.println("Proxy proxyCotadorCombustivel criado com sucesso....");
				
							
					System.out.println("Preparando para consumir o WS CalculadorDeDistanciaDoisPontos....");
					//service - WS CalculadorDeDistanciaDoisPontos
					CalculadorDeDistanciaDoisPontosService calculadorDeDistanciaDoisPontosService = new CalculadorDeDistanciaDoisPontosService();
						//proxy
						CalculadorDeDistanciaDoisPontos proxyCalculadorDeDistanciaDoisPontos = calculadorDeDistanciaDoisPontosService.getCalculadorDeDistanciaDoisPontosPort();
						System.out.println("Proxy proxyCalculadorDeDistanciaDoisPontos criado com sucesso....");
						
						
		//operation - 1
		double valorCombustivel = 0;
		valorCombustivel = proxyCotadorCombustivel.cotadorDeConbustivel("gasolina");
		 
		//operation - 2
		
		double distancia = 0;
		double longitude1 = -23.410916;
		double latitude1 = -46.400448;
		double longitude2 = -23.540881;
		double latitude2 = -46.760400;
		
		distancia = proxyCalculadorDeDistanciaDoisPontos.calculador(longitude1, latitude1, longitude2, latitude2);
		
		//operation - 3
		double totalGastoCombustivel = 0;
		totalGastoCombustivel = proxyCotadorCombustivel.calculoValorGastoCombustivel(12, distancia, valorCombustivel);
		
		//operation - 3
		String documento = "CPF";
		//String nDocumento = "297.004.758-66";//invalido
		String nDocumento = "297.004.758-67";//valido
		boolean validacaoDocumento = false;
		validacaoDocumento = proxyValidadorCPFCNPJ.validadorCPFCNPJ(documento, nDocumento);
		//validacaoDocumento = proxyValidadorCPFCNPJ.validadorCPFCNPJ("cnpj", "29.753.152/0001-47");
		
		//operation - 4
		double totalAPagarEmReais = calculoTotal(totalGastoCombustivel, VALOR_KM_COMUM_BANDEIRA1, distancia);
		
		String moeda = "DOLAR";
		
		double totalAPagarEmMoedaEstrangeira = 0;
		totalAPagarEmMoedaEstrangeira = proxyCotadorMoedas.conversorDeRealParaMoeda(moeda, totalAPagarEmReais);
		
		System.out.println("Total a pagar em Reais: " + totalAPagarEmReais);
		System.out.println("Total a pagar em " + moeda + ": " + totalAPagarEmMoedaEstrangeira);
		
		System.out.println(validacaoDocumento != true ? " NAO FOI POSSIVEL EMITIR NOTA FISCAL " + documento + ": " + nDocumento + " INVALIDO." : "NOTA FISCAL  PARA O " + documento + ": " + nDocumento + " EMITIDA COM SUCESSO.");
		 
		
		
		
	}


	private static double calculoTotal(double totalGastoCombustivel, double valorKmComumBandeira1, double distancia) {
		
		return ((totalGastoCombustivel/100)* 10) + (valorKmComumBandeira1 * distancia);
	}


}
