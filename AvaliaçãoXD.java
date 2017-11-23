package pacote1;

import java.util.Scanner;

public class AvaliaçãoXD {
private static Scanner ler;
	public static void main(String[] args) {
		Scanner Ler = new Scanner (System.in);
		double Num1, Num2, Num3, Total;
		String Nome;
		System.out.println("Digite o nome do aluno");
		Nome = Ler.next();
		System.out.print("Digite primeiro numero");
				Num1 = Ler.nextInt();
				System.out.print("Digite segundo numero");
						Num2 = Ler.nextInt();
				           
						Total = (Num1 * 0.6 ) + (Num2 * 0.4);
						if(Total <10)
							System.out.print("O aluno " +Nome+ " esta reprovado");
						else
							System.out.println("O aluno " +Nome+ " esta aprovado");
						System.out.print("A nota da sua avaliação é"+Total);
						
						

	}

}
