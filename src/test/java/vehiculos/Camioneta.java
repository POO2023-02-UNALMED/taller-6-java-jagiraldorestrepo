package vehiculos;

public class Camioneta extends Vehículo {
	private boolean volco;
	private static int camionetas;
	
	public Camioneta(String placa, int puertas, String nombre, int precio, int peso,Fabricante fabricante,Boolean volco) {
		super(placa, puertas,90, nombre, precio, peso, "4X4", fabricante);
		this.volco=volco;
	}
	
	public Boolean getVolco() {
		return volco;
	}

	public void setVolco(Boolean volco) {
		this.volco = volco;
	}

	public static int getCamionetas() {
		return camionetas;
	}
	
	
	
	

}
