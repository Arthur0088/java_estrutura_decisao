package primeiraaula;

import java.util.Scanner;

public class exerciciosdecomandoscondicionais_1 {

	public static void main(String[] args) {
	
		int x;
		
		Scanner leitor=new Scanner(System.in);
		
		System.out.println("digite o n�mero");
		x= leitor.nextInt();
		
		if(x >= 20) {
			System.out.println(x +" � maior que 20");
		}

	}

}
