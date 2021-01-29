import java.util.Scanner;

public class for1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o numero de repetições do programa: ");
		int N = sc.nextInt();
		int soma = 0;
		
		for(int i=0;i<N;i++) {
			System.out.println("Digite um numero: ");
			int x = sc.nextInt();
			soma += x;
			
		}
		
		System.out.println("Valor da soma: " + soma);
		sc.close();
		
	}

}
