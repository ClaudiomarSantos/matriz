package aplicação;

import java.util.Locale;
import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int m = 0;
		int n = 0;

		System.out.println("digite o numero de linhas e colunas respectivamente: ");

		m = sc.nextInt();
		n = sc.nextInt();
		int mat[][] = new int[m][n];

		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				System.out.println("digite a posicao " + i + "," + j);
				mat[i][j] = sc.nextInt();

			}

		}
		System.out.println("sua matriz");

		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(mat[i][j] + " ");

			}

			System.out.println();
		}
		System.out.println("digite um numero existente na matriz:");
		int entrada = sc.nextInt();

		for (int i = 0; i < mat.length; i++) {
			System.out.println();
			for (int j = 0; j < mat[i].length; j++) {
				if (mat[i][j] == entrada) {

					if (j > 0) {
						System.out.print("numero a esquerda: ");
						System.out.println(mat[i][j - 1] + " ");
					}
					if (i > 0) {
						System.out.print("numero acima: ");
						System.out.println(mat[i - 1][j] + " ");
					}
					if (j < mat.length - 1) {
						System.out.print("numero abaixo: ");
						System.out.println(mat[i + 1][j] + " ");
					}
					if (i < mat[i].length - 1) {
						System.out.print("numero a direita: ");
						System.out.println(mat[i][j + 1] + " ");
					}

				}
			}
		}
	sc.close();}
}
