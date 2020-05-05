package primeiraaula;

import java.util.Scanner;

public class exerciciosdecomandoscondicionais_7 {

	public static void main(String[] args) {
		
		String nome1, nome2;
		int idade1, idade2;
		
		Scanner leitor=new Scanner(System.in);
		
		System.out.println("digite o primeiro nome");
		nome1=leitor.nextLine();
		
		System.out.println("digite a idade");
		idade1=leitor.nextInt();
		
		System.out.println("digite o segundo nome");
		nome2=leitor.next();
		
		System.out.println("digite a idade");
		idade2=leitor.nextInt();
		
		if(idade1 > idade2) {
			System.out.println("a pessoa mais velha é " +nome1 + " com " +  idade1 + " anos");
		}
		if(idade2 >idade1) {
			System.out.println("a pessoa mais velha é " +nome2 + " com " +  idade2 + " anos");
		}
		
		
	}

}
