import java.util.Scanner;

/**
 * @author UO281827
 * 	CON UN VECTOR DE TAMA�O DESIGNADO POR EL USUARIO Y DE ELEMENTOS DESIGNADOS POR EL USUARIO, CREA UNA MATRIZ FORMADA
 * 	POR UNOS EXCEPTO EN LA DIAGONAL PRINCIPAL, DONDE COLOCAR� LOS ELEMENTOS DEL VECTOR EN ORDEN.
 *
 */
public class matDiagonal {

	/**
	 * 
	 * @param vector
	 * 	DEVUELVE LA MATRIZ CUYA DIAGONAL SON LOS ELEMENTOS DEL VECTOR
	 */
	public static void leeMatriz (int [] vector) {
		int [] [] matriz = creaMatriz(vector.length, vector);		//CREA MATRIZ DE LONGITUD IGUAL AL VECTOR
		for (int i=0;i<matriz.length;i++) {		//PARA CADA COLUMNA
			for (int j=0;j<matriz.length;j++) {		//PARA CADA ELEMENTO DE LA FILA
				System.out.print(matriz[i][j]);		//IMPRIMIR
				System.out.print(" ");			//SEPARADOR
			}
			System.out.println();		//SALTO DE L�NEA
		}
	}
	
	/**
	 * 
	 * @param tama�o
	 * @param vector
	 * @return	LA MATRIZ FORMADA POR LOS ELEMENTOS DEL VECTOR EN SU DIAGONAL PRINCIPAL, EL RESTO, UNOS.
	 */
	public static int [] [] creaMatriz (int tama�o,int [] vector) {
		
		int [] [] matriz = new int [tama�o] [tama�o];			//CREA MATRIZ DE TAMA�O DEFINIDO

		for (int i=0;i<matriz.length;i++) {		//PARA CADA COLUMNA
			for (int j=0;j<matriz[1].length;j++) {		//PARA CADA ELEMENTO DE LA FILA
				if (i!=j) {				//SI NO ES EN LA DIAGONAL
					matriz [i][j]=1;			//ELEMENTO 1
				} else {		//SI NO (DIAGONAL PRINCIPAL)
					matriz [i][i] = vector[i];		//ELEMENTO SIGUIENTE DEL VECTOR
				}
			}
		}
		
		return matriz;		//DEVUELVE MATRIZ
	}
	
	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);		//CREA TECLADO
		System.out.print("Introduzca el n�mero de elementos de la diagonal principal: ");		//SOLICITA TAMA�O
		int elem = teclado.nextInt();		//CREA CANTIDAD DE ELEMENTOS
		int [] vector = new int [elem];			//CREA VECTOR CON LA CANTIDAD DESIGNADA
		System.out.print("Introduzca los elementos de la matriz separados por espacios: ");		//SOLICITA VALORES VECTOR
		for (int i=0;i<elem;i++) {		//PARA CADA ELEMENTO DEL VECTOR
			vector [i] = teclado.nextInt();			//ALMACENAR VALOR
		}
		leeMatriz (vector);			//LLAMADA SUBRUTINA
	}

}
