import java.util.Scanner;

public class if_else {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int hora;
		
		System.out.println("Que horas s�o: ");
		hora = sc.nextInt();
		
		if( hora < 12 ) {
			System.out.println("Bom dia");
		}
		else if( hora >= 12 && hora <= 16) {
			System.out.println("Boa tarde");
		}
		else {
			System.out.println("Boa noite");
		}

	}

}
