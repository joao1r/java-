package pacote1;

import java.util.Scanner;

public class Pitagoras {

	public static void main(String[] args) {
		Scanner dados = new Scanner (System.in);
		double C1,C2,H;
		System.out.print("C1?");
		Scanner LerS=new Scanner(System.in);
c1=LerS.nextDouble();
System.out.print("c2?");
c2=LerS.nextDouble();

h=Math.sqrt(c1*c1+c2*c2);
System.out.printf("H=%.0f", h);
	}

}
