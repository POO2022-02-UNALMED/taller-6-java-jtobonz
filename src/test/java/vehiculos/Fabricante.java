package vehiculos;

import java.util.ArrayList;
import java.util.List;

public class Fabricante {
	public String nombre;
	public Pais pais;
	public int cantidadVehiculos;
	public static List<Fabricante> fabricas = new ArrayList<Fabricante>(); 
	
	public Fabricante(){};
	
	public Fabricante(String nombre, Pais pais){
		this.nombre = nombre;
		this.pais = pais;
		fabricas.add(this);
	}

	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Pais getPais() {
		return pais;
	}
	public void setPais(Pais pais) {
		this.pais = pais;
	}
	
	public static Fabricante fabricaMayorVentas() {
		Fabricante f = new Fabricante();
		Fabricante x = f;
		for (Fabricante fabrica : fabricas) {
			if (fabrica.cantidadVehiculos > x.cantidadVehiculos) {
				x = fabrica;
			}
		}
		return x;
		
	}
}
