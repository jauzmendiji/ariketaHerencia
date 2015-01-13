public class Parque extends EspacioPublico {

	//propiedades de la subclase
	public boolean infantil;
	
	//constructor
	Parque(){
	}
	//getter y setter
		public void setInfantil(boolean txiki){
			this.infantil=txiki;
		}
		public boolean getInfantil(){
			return infantil;
		}
}
