package calculadorDeDistanciaDoisPontosWS.calculador;

import calculadorDeDistanciaDoisPontosWS.entities.Coordenadas;

public class teste {

	public static int EARTH_RADIUS_KM = 6371;

	/*
	 * longitude -23410916,  latitude -46400448 guarulhos
	 * longitude -23540881,  latitude -46760400 osasco
	*/
	
	
	public static void main(String[] args) {
		
		double distancia = 0;
		
		Coordenadas coord1 = new Coordenadas(-23.410916, -46.400448) ;
		Coordenadas coord2 = new Coordenadas(-23.540881, -46.760400) ;
		
		distancia = calculador(coord1, coord2);
		
		System.out.println("Distância : " + distancia);
	}
	
	
	public static double calculador(Coordenadas coord1,	Coordenadas coord2) {

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
