package vehiculos;

import java.util.ArrayList;

public class Fabricante{
	
	private String nombre;
	private País pais;
	int cantidad;
	
	public static ArrayList<Fabricante> fabricantes=new ArrayList<>();

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public País getPais() {
		return pais;
	}

	public void setPais(País pais) {
		this.pais = pais;
	}
	
	public static Fabricante fabricaMayorVentas() {
	    int mayor=0;
	    int def=0;
		for (int i=0;i<fabricantes.size();i++) {
    		if (fabricantes.get(i).cantidad>mayor) {
    			mayor=fabricantes.get(i).cantidad;
    			def=i;
    		}
		}
		return fabricantes.get(def);
   }
	
	
	
	
	
	
	
	
	
	
	
	

}
