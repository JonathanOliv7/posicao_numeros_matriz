package Aplication;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite o numero de linhas e colunas:");
		int linhas = sc.nextInt();
		int colunas = sc.nextInt();

		int[][] mat = new int[linhas][colunas];
		System.out.println("Digite os numeros da matriz:");
		for (int i = 0; i < linhas; i++) {
			for (int j = 0; j < colunas; j++) {
				mat[i][j] = sc.nextInt();
			}
		}
		System.out.print("Qual numero voce quer conferir na matriz?");
		int x = sc.nextInt();
		for (int i = 0; i < linhas; i++) {
			for (int j = 0; j < colunas; j++) {
				if (mat[i][j] == x) {
					System.out.println("Posição: " + i + " ," + j);
					if(i > 0) {
					System.out.println("Acima: " + mat[i - 1][j]);	
					}
					if(j < colunas - 1) {
						System.out.println("Direita: " + mat[i][j + 1]);	
						}
					if(j > 0) {
						System.out.println("Esquerda: " + mat[i][j - 1]);	
						}
					if(i < linhas - 1) {
						System.out.println("Abaixo: " + mat[i + 1][j]);	
						}
					}
				}
		}
			

		sc.close();
	}
}
