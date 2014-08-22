package calculadorDeDistanciaDoisPontosWS.calculador;


import javax.jws.WebMethod;
import javax.jws.WebService;

import calculadorDeDistanciaDoisPontosWS.entities.Coordenadas;

@WebService
public class CalculadorDeDistanciaDoisPontos {

	public static int EARTH_RADIUS_KM = 6371;
	
	@WebMethod
	public double calculador(double longitude1, double latitude1, double longitude2, double latitude2) {
		
		Coordenadas coord1 = new Coordenadas(longitude1, latitude1);
		Coordenadas coord2 = new Coordenadas(longitude2, latitude2);


		// Conversão de graus para radianos das latitudes
		double firstLatToRad = Math.toRadians(coord1.getLatitude());
		double secondLatToRad = Math.toRadians(coord2.getLatitude());

		// Diferenças das longitudes
		double deltaLongitudeInRad = Math.toRadians(coord2.getLongitude() - coord1.getLongitude());

		// Cálcula da distância entre os pontos
		return Math.acos(Math.cos(firstLatToRad) * Math.cos(secondLatToRad)
				* Math.cos(deltaLongitudeInRad) + Math.sin(firstLatToRad)
				* Math.sin(secondLatToRad))
				* EARTH_RADIUS_KM;

	}
}
