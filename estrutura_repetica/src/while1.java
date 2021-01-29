import java.util.Scanner;

public class while1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um numero: ");
		int x = sc.nextInt();
		int soma = 0;
		
		while (x != 0) {//ler numero enquanto nao aparecer um 0
			soma += x;
			x = sc.nextInt();			
		}
		
		System.out.println(soma);
		sc.close();
		
	}

}
