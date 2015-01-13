import java.util.Hashtable;

public class Main {
	public static void main (String [ ] Args) {
	        Museo museo = new Museo ();
	        museo.setTipo("Museo");
	        museo.setDireccionep("San Telmo plaza");
	        museo.setArea(400);
	        museo.setCapacidad(1000);
	        museo.setPrecio(10);
	        
	        System.out.print("--- Museo: ");
	        System.out.print("\nTipo: " + museo.getTipo());
	        System.out.print("\nDireccion: " + museo.getDireccionep());
	        System.out.print("\nArea: " + museo.getArea() + "m2");
	        System.out.print("\nCapacidad: " + museo.getCapacidad() + "persona");
   	        System.out.print("\nPrecio: " + museo.getPrecio() + "euro");

	        Parque parque = new Parque();
	        parque.setTipo("Parque infantil");
	        parque.setDireccionep("Lanera");
	        parque.setArea(50);
	        parque.setInfantil(true);
	        
	        System.out.print("\n--- Parque: ");
	        System.out.print("\nTipo:" + parque.getTipo());
	        System.out.print("\nDireccion:" + parque.getDireccionep());
	        System.out.print("\nArea:" + parque.getArea() + "m2");
	        System.out.print("\n¿Infantil?:" + parque.getInfantil() + "\n");

	        //Hashtable

	        Hashtable<String,String> otrosEspacios = new Hashtable<String,String>();

	        otrosEspacios.put("Playa", "Zurriola");
			otrosEspacios.put("Plaza", "Zumardi");
			otrosEspacios.put("Biblioteca", "Madalen");
			otrosEspacios.put("Hospital", "Edificio Gipuzkoa");


			System.out.print("\n\n--- Hashtable erabiltzen: \n");
			System.out.println(otrosEspacios.get("Playa"));
			System.out.println(otrosEspacios.get("Hospital"));
	        
	}
}
