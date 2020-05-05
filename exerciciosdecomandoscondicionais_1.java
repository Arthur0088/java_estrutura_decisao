package primeiraaula;

import java.util.Scanner;

public class exerciciosdecomandoscondicionais_1 {

	public static void main(String[] args) {
	
		int x;
		
		Scanner leitor=new Scanner(System.in);
		
		System.out.println("digite o número");
		x= leitor.nextInt();
		
		if(x >= 20) {
			System.out.println(x +" é maior que 20");
		}

	}

}
