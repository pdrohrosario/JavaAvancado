import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				
		//Locale.setDefault(Locale.US); para usar o ponto ao inves da virgula
		Scanner sc = new Scanner(System.in);
		/*
		String x;
		x = sc.next();
		System.out.println("Você digitou " + x);	
		
		int y;
		y = sc.nextInt();
		System.out.println("Número digitado " + y);
		
		double z;
		z = sc.nextDouble();
		System.out.println("Número " + z);//Ao escrever com virgula pois estamos no brasil e print o valor com ponto
		
		char c;
		c = sc.next().charAt(0);
		System.out.println("Você digitou " + x);	
		
		*/
		
		//Ler valores um em baixo do outro
		String x;
		int y;
		double z;
		x = sc.next();
		y = sc.nextInt();
		z = sc.nextDouble();
		System.out.printf("Dados digitados: %s, %d e %2f",x,y,z);
		
		
		sc.close();	
	}

}
