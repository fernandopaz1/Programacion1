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
}
