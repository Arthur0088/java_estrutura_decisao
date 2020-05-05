package primeiraaula;

import java.util.Scanner;

public class exerciciosdecomandoscondicionais_3 {

	public static void main(String[] args) {
		
		int x;
		
		Scanner leitor=new Scanner(System.in);
		
		System.out.println("digite o número");
		x=leitor.nextInt();
		
		if(x > 0) {
			System.out.println("positivo");
		}
		else if(x < 0) {
			System.out.println("negativo");
		}
		

	


	}

}
