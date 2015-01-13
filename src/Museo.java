public class Museo extends EspacioPublico {

	//propiedades de la subclase
	public int capacidad;
	public int precio;

	//constructor
	Museo(){
	}
	//getter y setter
		public void setCapacidad(int capac){
			this.capacidad=capac;
		}
		public int getCapacidad(){
			return capacidad;
		}

		public void setPrecio(int prezioa){
			this.precio=prezioa;
		}
		public int getPrecio(){
			return precio;
		}
}
