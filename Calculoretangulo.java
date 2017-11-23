package pacote1;
import java.io.*;
public class Calculoretangulo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.print("---Programa do Calculo da area do retangulo--\n");
		
		
System.out.print("comprimento");
String c= "";
InputStreamReader LerS = new InputStreamReader (System.in);
BufferedReader GuardaS = new BufferedReader (LerS);
System.out.print("Largura");
String D="";
InputStreamReader LerSD = new InputStreamReader (System.in);
BufferedReader GuardaSD = new BufferedReader (LerSD);
D = ( GuardSD).readline();
System.out.printf("area=%d", Integer.VoLueOF(C)* Integer.VoLueOF(D));
	}

}
