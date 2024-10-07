/**
 * Rubén Bernal Ramos, CSI1
 */

package controladores;

/**
 * Clase controladora de la aplicación
 * rbr - 071024
 */
public class Inicio {

	/**
	 * Método de entrada de la aplicación
	 * rbr - 071024
	 * @param args
	 */
	public static void main(String[] args) {
		
		//Variables
		String mensajePrimero = "Buenas", mensajeSegundo = " tardes";
		
		//Concateno las dos variables con el método concat y lo guardo en una nueva variable
		String mensajeCompleto = mensajePrimero.concat(mensajeSegundo);
		
		//Muestro por consola el mensaje completo (concatenación de los dos mensajes originales)
		System.out.println(mensajeCompleto);

	}

}