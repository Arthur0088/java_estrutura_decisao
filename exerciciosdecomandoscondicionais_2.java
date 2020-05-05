package primeiraaula;

import java.util.Scanner;

public class exerciciosdecomandoscondicionais_2 {

	public static void main(String[] args) {
		
		int soma,x,y;

		Scanner leitor=new Scanner(System.in);
		
		System.out.println("digite o primeiro número");
		x=leitor.nextInt();
		
		System.out.println("digite o segundo número");
		y=leitor.nextInt();
		
		soma= x + y;
		
		if(soma >= 10) {
			System.out.println(soma);
		}
		
		else {
			System.out.println("a soma não e maior que 10");
			
		}
		
		

	}

}
