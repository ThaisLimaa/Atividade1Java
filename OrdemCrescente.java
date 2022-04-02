package Laco.Desisao;

import java.util.Scanner;

public class OrdemCrescente {
	public static void main(String[] args) {

		/*
		 	Menor	Meio	Maior
			A		B		C
			A		C		B
			B		A		C
			B		C		A
			C		A		B
			C		B		A

		 */
		int a,b,c;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nEntre com o primeiro número: ");
		a = leia.nextInt();
		System.out.println("\nEntre com o segundo número: ");
		b = leia.nextInt();
		System.out.println("\nEntre com o terceiro número: ");
		c = leia.nextInt();
		
		if(a<=b && b<=c)
		{
			System.out.println("\nOrdem crescente:"+a+" , "+b+" , "+c);
		}
		else if(a<=c && c<=b)
		{
			System.out.println("\nOrdem crescente:"+a+" , "+c+" , "+b);
		}
		else if(b<=a && a<=c)
		{
			System.out.println("\nOrdem crescente:"+b+" , "+a+" , "+c);
		}
		else if(b<=c && c<=a)
		{
			System.out.println("\nOrdem crescente:"+b+" , "+c+" , "+a);
		}
		else if(c<=a && a<=b)
		{
			System.out.println("\nOrdem crescente:"+c+" , "+a+" , "+b);
		}
		else
		{
			System.out.println("\nOrdem crescente:"+c+" , "+b+" , "+a);
		}
	}

}
