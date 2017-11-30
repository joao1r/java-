import java.util.Scanner;

public class cog_ati {

	public static void main(String[] args) {
		Scanner dados = new Scanner (System.in);
		int cog, ati;
		String nome;
		double fimnota;

		System.out.println("Qual o nome do Aluno?");
		nome = dados.next();
		System.out.println("Qual o valor do dominio cognitivo?");
		cog = dados.nextInt();
		System.out.println("Qual o valor das atitudes?");
		ati = dados.nextInt();
		fimnota = (cog*0.6+ati*0.4);
		if (fimnota<10)
			System.out.print(nome + " têm " + fimnota + " valores e está reprovada!");
		else 
			System.out.print(nome + " têm " + fimnota + " valores e está aprovada!");
		
		
		
		
		
		
		

	}

}
