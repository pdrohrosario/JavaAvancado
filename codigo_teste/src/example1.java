import java.util.Scanner;

public class example1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		double comprimento = sc.nextDouble();
		double largura = sc.nextDouble();
		
		
		double area = largura * comprimento;
		double metroQuadrado = sc.nextDouble();
		double precoMetroQuadrado = area * metroQuadrado;
		
		System.out.println("A area do terreno: "+area + "m².");
		System.out.println("Preço do terreno: R$"+precoMetroQuadrado);
		
	}

}
