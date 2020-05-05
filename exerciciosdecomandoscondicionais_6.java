package primeiraaula;

import java.util.Scanner;

public class exerciciosdecomandoscondicionais_6 {

	public static void main(String[] args) {
		 
		float notafinal, nota1, nota2, nota3;
		
		Scanner leitor=new Scanner(System.in);
		
		System.out.println("digite a primera nota da avaliação com o valo de 2,0");
		nota1=leitor.nextFloat();
		
		System.out.println("digite a segunda nota da avaliação com valor de 3,0");
		nota2=leitor.nextFloat();
		
		System.out.println("digite a terceira nota da avaliação com o valor de 5,0");
		nota3=leitor.nextFloat();
		
		notafinal=(nota1+nota2+nota3)/3;
		
		if(notafinal >= 7.0) {
			System.out.println("aprovado");
		}
		else {
			System.out.println("reprovado");
			
		}
		
		
		
		
		
	}

}
