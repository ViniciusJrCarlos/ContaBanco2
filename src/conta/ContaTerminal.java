package conta;

import java.util.Scanner;

public class ContaTerminal {

	public static void main(String[] args) {

		
			
			Scanner entrada = new Scanner(System.in);
			float Saldo = 237.48f;

			System.out.println("****** BEM VINDO AO NOSSO BANCO *******");
			System.out.println("---------------------------------------");
			
		    System.out.print("Por Favor digite sua agencia: ");
		    String Agencia = entrada.nextLine();
		    
		    System.out.print("Por Favor digite seu numero de conta: ");
		    int Numero = Integer.parseInt(entrada.nextLine());
		    
		    System.out.print("Por Favor digite seu nome: ");
		    String NomeCliente = entrada.nextLine();
		    
		    
		 
		    System.out.println("Ol� " + NomeCliente + ", obrigado por criar uma conta em nosso banco, sua ag�ncia �: " + Agencia + ", conta: " + Numero + " e seu saldo R$: " + Saldo + " j� est� disponivel para saque...");
		    
		    entrada.close();
	}
	
	

}
