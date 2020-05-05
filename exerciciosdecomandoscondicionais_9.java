package primeiraaula;

import java.util.Scanner;

public class exerciciosdecomandoscondicionais_9 {

	public static void main(String[] args) {
		 
	float valorcompra;
	
	Scanner leitor=new Scanner(System.in);
	
	System.out.println("digite o valor da compra");
	valorcompra=leitor.nextFloat();
	
	if(valorcompra<20)
		System.out.println(valorcompra*1.45+" reais");
	
	else {
		System.out.println(valorcompra*1.30+" reais");
	}

	}

}
