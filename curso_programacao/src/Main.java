import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Ol�, mundo!");
		
		//Variavel:Tipo, valor e endereco;
		int idade = 19;
		double altura = 1.6822;
		char sexo = 'F';
		boolean legal = true;
		byte n1 = 127;
		short n2 = 32767;
		long n3 = 1234567821;
		float n4 = (float)122.2;
		String nome = "Pedro";
		
		//CamelCase
		int _5minutos;
		int salarioFuncionario;
		
		System.out.println(legal);
		System.out.printf("%.2f%n",altura);//Metodo para exibir somente duas casas dec. no printf 
		//f de fomatado
		//Usar . em veez de virgula
		Locale.setDefault(Locale.US);
		System.out.printf("%.3f%n",altura);
		
		//Concatenar
		System.out.println("RESULTADO: " + n1 + " METROS");
		//Concatenar com o printf - como no C
		System.out.printf("Minha idade: %d ",idade);
		
		System.out.println();
		
		//Varios Valores
		System.out.printf("O %s tem %d anos.",nome,idade);
		
		
	}

}
