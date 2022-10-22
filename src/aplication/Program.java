package aplication;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos elementos vai ter o vetor? ");
		int n = sc.nextInt();
		
		int[] vect = new int [n];
		
		for(int i=0;i<vect.length;i++) {
			System.out.print("Digite um numero: ");
			vect[i] = sc.nextInt();
		}
		
		double media = 0.0;
		double soma = 0.0;
		int pares = 0;
		
		for (int i=0;i<vect.length;i++) {
			if(vect[i]%2 == 0) {
				soma+=vect[i];
				pares ++;
			}	
		}
		
		media = soma/pares;
		
		if(pares == 0) {
			System.out.println("NENHUM NUMERO PAR ");
		}
		else System.out.printf("MEDIA DOS PARES = %.1f%n", media);
		
		sc.close();

	}

}
