package intro;

public class pajaro {
	//*** atributos o propiedades ****		
	
	private char color; //propiedad o atributo color
	private int edad; //propiedad o atributo edad
	
	//constructor?????? Por defecto: sin parametros 
	
	//*** métodos de la clase ****, seters metodos para dar cambio  valor al atributo
	public void setedad(int e)
	{edad = e;
	}
	
	public void printedad(){
		System.out.println("la edad del pajaro es " + edad);
		}
	
	public void setcolor(char c){
		color=c;
	}
 

	public void printcolor() {
	switch(color) { /// elemento de seleccionar entre una o varias opciones
	//Los pájaros son verdes, amarillos, grises, negros o blancos
	//No existen pájaros de otros colores
	case 'v':
		System.out.println("verde");
		break;
	case 'a':
		System.out.println("amarillo");
		break;
	case 'g':
		System.out.println("gris");
		break;
	case 'n':
		System.out.println("negro");
		break;
	case 'b':
		System.out.println("blanco");
		break;
	default:
		System.out.println("color no establecido");
	
	
	}
}
}