package vehiculos;

public class Automóvil extends Vehículo{
	
	
	private int puestos;
	private static int automoviles;
	
	public Automóvil(String placa, String nombre, double precio, double peso, Fabricante fabricante,int puertas) {
		super(placa,4, 100, nombre, precio, peso,"FWD", fabricante);
		this.puertas=puertas;
		automoviles++;
	}
	
	
	
	
	
	
	
	
	

}
