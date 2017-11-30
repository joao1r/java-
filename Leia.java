package Leia;
import java.io.*;

public class Leia {

	public static void main(String[] args) throws IOException {
		System.out.print("Nome\n");
		String C = "";
		InputStreamReader LerS = new InputStreamReader (System.in);
		BufferedReader GuardaS = new BufferedReader (LerS);
		C = GuardaS.readLine();
		System.out.print(C);	
	}
}