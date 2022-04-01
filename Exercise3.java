/*
Faça um programa que receba a idade de uma pessoa e mostre na saída em qual categoria ela se encontra:
10-14 infantil
15-17 juvenil
18-25 adulto
 */
package Exercises1_04_22;

import java.util.Scanner;

public class Exercise3 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int n;
		
		System.out.print("Digite a idade: ");
		n=ler.nextInt();
		
		if (n>=10 && n<=14)
			{
				System.out.println("Categoria Infantil");
			}
		
		else if(n>=15 && n<=17)
			{
				System.out.println("Categoria Juvenil");
			}
		
		else if (n>=18 && n<=25)
			{
				System.out.println("Categoria Adulto");
			}
	}

}
