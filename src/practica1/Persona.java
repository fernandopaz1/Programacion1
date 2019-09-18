package practica1;

public class Persona {
	String nombre;
	int edad;
	
	public Persona(String nombre, int edad) {
		this.nombre=nombre;
		this.edad=edad;
	}
	
	public boolean masJovenQue(Persona otro) {
		return this.edad<otro.edad ? true:false;
	}
	
	public boolean tocayo(Persona otro) {
		return this.nombre.contentEquals(otro.nombre);
	}
	
	public boolean mismaPersona(Persona otro) {
		return this.edad==otro.edad && this.tocayo(otro);
	//Si agregamos una instancia mas DNI seria valido deir que son  la misma persona 
	//comparando solo los DNI
	//Esto seria valido solo en el caso de que compartan la nacionalidad
	}
	
	public static Persona masJoven(Persona[] grupo) {
		if(grupo.length==0) {
			return null;
		}
		int masJoven= 0;
		for(int i=1;i<grupo.length;i++) {
			if(grupo[masJoven].edad>grupo[i].edad) {
				masJoven=i;
			}
		}
		return grupo[masJoven];
	}
	
	public static Persona buscar(Persona[] grupo,String nombre) {
		for(int i=0;i<grupo.length;i++) {
			if(grupo[i].nombre.equals(nombre)) {
				return grupo[i];
			}
		}
		return null;
	}
}
