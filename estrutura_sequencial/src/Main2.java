import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int x;
		String s1,s2,s3;
		
		x = sc.nextInt();
		sc.nextLine();
		s1 = sc.nextLine();//Quebra de linha e Pega o valor digitado na linha inteira 
		s2 = sc.nextLine();
		s3 = sc.nextLine();
		
		System.out.println("Dados digitados: ");
		System.out.println(x);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
		//se usar o nextline com outro next, � necessario adicionar mais um nextLine entre o anterior e o proximo
	}

}
