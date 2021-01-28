
public class operador_ternario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 *	Operador ternario:
		 *	(condicao) ? valor_se_verdadeiro : valor_falso
		 * 
		 */
		
		//Exemplo
		double preco = 34.5;
		double desconto = (preco < 20.0) ? preco * 0.1 : preco * 0.05;
		
		System.out.println(desconto);
		
		

	}

}
