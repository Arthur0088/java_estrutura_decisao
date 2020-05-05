package primeiraaula;

import java.util.Scanner;

public class exerciciosdecomandoscondicionais_8 {

	public static void main(String[] args) {
	
		String senha;
		
		Scanner leitor=new Scanner(System.in);
		
		System.out.println("digite a senha");
		senha=leitor.nextLine();
		
		if(senha.equals("AEDB")) {
			System.out.println("acesso permitodo");
		}
		else {
			System.out.println("Você não tem acesso ao sistema");
		}
		
		
		
			
		
			
			
		
	}

}
