package calculadorDeDistanciaDoisPontosWS.entities;

public class Coordenadas {
	
	private double latitude, longitude;
	
	public Coordenadas() {}
	
	public Coordenadas(double longitude, double latitude) {
		this.latitude = latitude;
		this.longitude = longitude;
	}
	

	public double getLatitude() {
		return latitude;
	}

	public void setLatitude(Integer latitude) {
		this.latitude = latitude;
	}

	public double getLongitude() {
		return longitude;
	}

	public void setLongitude(Integer longitude) {
		this.longitude = longitude;
	}
	
}
