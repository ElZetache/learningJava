package awesomeSauce;

public class TesterPrimitive {
	public static void main(String[] args) {
		byte b = 127;
		/*los bytes sirven para optimizar codigo cuando solo necesitamos representar un numerico comprendido 
		 * entre -128 y 127, que es el rango que se puede representar con 8bits
		 */
		short s = 127;
		/* los short son numeros de 16 bits
		 * un poco mas grandes que los byte
		 */
		float f = 127;
		/* los float tienen 32 bits y puede contener decimales pero pierde precision comparado con el double
		 * 
		 */
		char c = 'a';
		/* los char nos sirven por si queremos almacenar solo un caracter, tienen que inicializarse
		 * 
		 */
		System.out.println(++b);
		System.out.println(++s);
	}
}
