package primeiraaula;

import java.util.Scanner;

public class exerciciosdecomandoscondicionais_5 {

	public static void main(String[] args) {
		
		int x;
		
		Scanner leitor=new Scanner(System.in);
		
		System.out.println("digite o número");
		x=leitor.nextInt();
		
		if(x%2==0) {
			System.out.println("par");
		}
		else {
			
			System.out.println("ímpar");
			
			
		}
		

	}

}
