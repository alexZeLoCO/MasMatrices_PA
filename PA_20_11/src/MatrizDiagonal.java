import java.util.Scanner;

/**
 * @author UO281827
 * 	EL PROGRAMA CREA UNA MATRIZ CUADRADA DE VALORES DEFINIDOS POR EL USUARIO.
 *  ADEMÁS, COMPRUEBA QUE LA MATRIZ NO SEA CUADRADA - QUE EN ESTE CASO, ES IMPOSIBLE - Y CALCULA LOS VALORES DE LA DIAGONAL PRINCIPAL.
 *  TRAS CALCULARLOS, LOS IMPRIME.
 *
 */
public class MatrizDiagonal {
	/**
	 * 
	 * @param teclado
	 * @return Una matriz cuadrada de valores definidos por el usuario.
	 */
	public static int [] [] creaMatriz (Scanner teclado) {
		System.out.print("Introduzca número de filas: ");		//SOLICITA VALOR
		int filas = teclado.nextInt();			//SOLICITA FILAS DE MATRIZ
		int [] [] matriz = new int [filas] [filas];			//CREA MATRIZ DE TAMAÑO DEFINIDO

		System.out.print("Introduzca los valores de la matriz separados por espacios: ");			//SOLICITA VALORES
		for (int i=0;i<filas;i++) {			//COLUMNAS
			for (int j=0;j<filas;j++) {				//FILAS
				matriz [j] [i] = teclado.nextInt();			//RELLENAR MATRIZ
			}
		}
		return matriz;		//DEVUELVE MATRIZ
	}
	
	/**
	 * 
	 * @param vector
	 * Imprime el vector introducido - lo utilizaremos para el vector diagonal -.
	 */
	public static void leeVector (int [] vector) {
		for (int i=0;i<vector.length;i++) {			//PARA TANTAS VECES COMO ELEMNTOS TENGA EL VECTOR
			System.out.print(vector[i]);		//IMPRIMIR ELEMENTO
			System.out.print(" ");			//SEPARADOR
		}
	}
	
	/**
	 * 
	 * @param matriz
	 * @return vector de enteros diagonal - que contiene los elementos de la diagonal principal de la matriz -
	 * 		   ó un valor nulo si la matriz no es cuadrada.
	 */
	public static int [] diagonal (int [] [] matriz) {
		/*
		 * TIENE POCO SENTIDO LA COMPROBACIÓN DE SI ES O NO CUADRADA EN ESTE CASO YA QUE SÓLO PREGUNTA POR UN VALOR EN LA LÍNEA 5.
		 * SI NO FUESE ASÍ, - SI PREGUNTASE POR FILAS Y COLUMNAS POR SEPARADO- ESTA COMPROBACIÓN SERÍA NECESARIA.
		 */
		if (matriz.length==matriz[1].length) {		//SÓLO SI LA MATRIZ ES CUADRADA (FILAS==COLUMNAS)
			int [] diagonal = new int [matriz.length];			//CREAR VECTOR DIAGONAL
			for (int i=0;i<diagonal.length;i++) {		//PARA TANTAS FILAS Ó COLUMNAS TENGA LA MATRIZ
				diagonal [i] = matriz [i] [i];			//COGER ELEMENTO DE LA DIAGONAL Y GUARDAR EN VECTOR
			}
			return diagonal;		//DEVOLVER VECTOR DIAGONAL
		} else {		//SI NO ES CUADRADA
			System.out.print("La matriz no es cuadrada.");		//OUTPUT
			return null;		//VALOR NULO
		}
		
	}
	
	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);			//CREA TECLADO
		int [] [] matriz = creaMatriz(teclado);			//CREA UNA MATRIZ Y DA VALORES
		int [] diagonal = diagonal (matriz);		//CREA ECTOR DIAGONAL
		
		System.out.print("La diagonal de la matriz es: ");		//OUTPUT
		leeVector (diagonal);		//OUTPUT
	}

}
