import java.util.Scanner;
/**
 * @author UO281827
 * 	CON UNA MATRIZ NO NECESARIAMENTE CUADRADA, CREA UNA MATRIZ MÁS PEQUEÑA TAL QUE SU ELEMENTO (1,1) 
 * 	SEA LA SUMA DE LOS (1,1)+(1,2)+(2,1)+(2,2) DE LA MATRIZ ORIGINAL.
 *
 */
public class MásMatrices {

	/**
	 * 
	 * @param teclado
	 * @return Una matriz de valores definidos por el usuario.
	 */
	public static int [] [] creaMatriz (Scanner teclado) {

		System.out.print("Introduzca número de columnas: "); 		//SOLICITA VALOR
		System.out.print("Introduzca número de filas: ");		//SOLICITA VALOR
		int columnas = teclado.nextInt();
		int filas = teclado.nextInt();			//SOLICITA FILAS DE MATRIZ
		int [] [] matriz = new int [columnas] [filas];			//CREA MATRIZ DE TAMAÑO DEFINIDO

		System.out.print("Introduzca los valores de la matriz separados por espacios: ");			//SOLICITA VALORES
		for (int i=0;i<columnas;i++) {			//COLUMNAS
			for (int j=0;j<filas;j++) {				//FILAS
				matriz [j] [i] = teclado.nextInt();			//RELLENAR MATRIZ
			}
		}
		return matriz;		//DEVUELVE MATRIZ
	}

	/**
	 * 
	 * @param matriz
	 * 	IMPRIMIRÁ LA MATRIZ PASADA COMO PARÁMETRO
	 */
	public static void leeMatriz (int [] [] matriz) {

		for (int i=0;i<matriz.length;i++) {		//PARA CADA COLUMNA
			for (int j=0;j<matriz.length;j++) {			//PARA CADA ELEMENTO DE LA FILA
				System.out.print(matriz[i][j]);			//OUTPUT
				System.out.print(" ");		//SEPARADOR
			}
			System.out.println();		//SALTO DE LÍNEA
		}
	}

	/**
	 * 
	 * @param matriz
	 * @return MATRIZ COMPRIMIDA (CALCULADA SEGÚN EL ENUNCIADO AL PRINCIPIO DEL PROGRAMA)
	 */
	public static int [] [] subrutina (int [] [] matriz) {
		int [] [] matrizcomprimida = new int [matriz.length-1][matriz[1].length-1];		//CREA MATRIZ UNA FILA Y UNA COLUMNA MÁS PEQUEÑA

		for (int i=0;i<matriz.length-1;i++) {		//PARA CADA COLUMNA
			for (int j=0;j<matriz[i].length-1;j++) {		//PARA CADA ELEMENTO DE CADA FILA
				matrizcomprimida [i][j] = matriz[i][j]+matriz[i+1][j]+matriz[i][j+1]+matriz[i+1][j+1];		//CALCULA
			}
		}
		return matrizcomprimida;		//RETURN
	}

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);		//CREA TECLADO
		leeMatriz(subrutina(creaMatriz(teclado)));			//LLAMADA SUBRUTINA
	}

}

