package ControleDeFluxo;

import java.util.Scanner;

public class Contador {
	/**
	 * @param args
	 * @throws ParametrosInvalidosException
	 */
	public static void main(String[] args) throws ParametrosInvalidosException {
		try (Scanner terminal = new Scanner(System.in)) {
			System.out.println("Digite o primeiro parâmetro");
			int parametroUm = terminal.nextInt();
			System.out.println("Digite o segundo parâmetro");
			int parametroDois = terminal.nextInt();
			
			try {
				//chamando o método contendo a lógica de contagem
				contar(parametroUm, parametroDois);
			
			}catch (NumberFormatException e) {
				//imprimir a mensagem: O segundo parâmetro deve ser maior que o primeiro
				
			}
		}
		
	}
	static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
		//validar se parametroUm é MAIOR que parametroDois e lançar a exceção
		int contagem = parametroDois - parametroUm;
		if (parametroUm > parametroDois) {
			throw new ParametrosInvalidosException("O parâmetro 1 é maior que o parâmetro dois!");
		} else {
			for (int x = 1; x <= contagem; x++ ){
				System.out.println("número" + String.valueOf( x ));
			}
		}
		
		
		//realizar o for para imprimir os números com base na variável contagem
	}
}