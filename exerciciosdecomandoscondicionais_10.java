package primeiraaula;

import java.util.Scanner;

public class exerciciosdecomandoscondicionais_10 {

	public static void main(String[] args) {
		 
			String  nome, masculino, feminino, sexo;
			float altura,pesoM,pesoF;
			
			Scanner leitor=new Scanner(System.in);
			
			System.out.println("digite seu nome");
			nome=leitor.next();
			
			System.out.println("digite o sexo m/f");
			sexo=leitor.next();
			
			System.out.println("digite a altura");
			altura=leitor.nextFloat();
			
			pesoM= (float)  ((72.7*altura)-58);
			pesoF=  (float) ((62.1*altura)-44.7);
			
			if(sexo=="masculino")
			System.out.println(pesoM);
			
			else if(sexo=="feminino") {
				System.out.println(pesoF);
			
			}

	}

}
