/*
Faça um programa em que permita a entrada de um número qualquer e exiba se este número é par ou ímpar. 
Se for par exiba também a raiz quadrada do mesmo; se for ímpar exiba o número elevado ao quadrado.
 */
package Exercises1_04_22;

import java.util.Scanner;

public class Exercise4 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		double n,n1,n2;
		
		System.out.print("Digite um número: ");
		n=ler.nextInt();
		
		if (n%2==0)
		{
			System.out.println("O número é par.");
			n1= Math.sqrt(n);
			System.out.println("A raíz quadrada é: " + n1);
		}
		else if (n%2==1)
		{
			System.out.println("O número é ímpar.");
			n2= Math.pow(n,2);
			System.out.println("O número ao quadrado é: " + n2);
			
		}
	}

}
