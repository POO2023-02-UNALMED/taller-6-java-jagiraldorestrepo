package vehiculos;

public class Automovil extends Vehiculo{
	
	private int puertas;
	private static int automoviles;

	public Automovil(String placa, String nombre, double precio, double peso, Fabricante fabricante,int puertas) {
		super(placa,4, 100, nombre, precio, peso,"FWD", fabricante);
		this.puertas=puertas;
		automoviles++;
	}

	public int getPuertas() {
		return puertas;
	}

	public void setPuertas(int puertas) {
		this.puertas = puertas;
	}

	public static int getAutomoviles() {
		return automoviles;
	}
	
	
	
	

}
