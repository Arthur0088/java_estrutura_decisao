package primeiraaula;

import java.util.Scanner;

public class exerciciosdecomandoscondicionais_4 {

	public static void main(String[] args) {
		
		int x,y;
		
		Scanner leitor=new Scanner(System.in);
		
		System.out.println("digite o primeiro n�mero");
		x=leitor.nextInt();
		
		System.out.println("digite o segundo n�mero");
		y=leitor.nextInt();
		
		if(x > y) {
			System.out.println(x+ " - " + y);
		}
		else if(y > x) {
			System.out.println(y+ " - " + x);
		}
		
		

	}

}
