
package maximo3numeros;
import java.util.Scanner;
public class Maximo3numeros {
private static Scanner ler;
    public static void main(String[] args) {
  ler = new Scanner (System.in);
double q , w , y;
double max = 0;
System.out.print ("Digite um numero");
q = ler.nextDouble();
System.out.print ("Digite segundo numero");
w = ler.nextDouble();
System.out.print ("Digite terceiro numero");
y = ler.nextDouble();
//variaveis
if (q>w)
 if(q>y)
 max = q;

 if(w>q)
 if(w>y)
 max = w;

 if(y>q)
 if(y>w)
 max = y;
 
 System.out.print ("Máximo" +max);
 
 

    }
    
}
