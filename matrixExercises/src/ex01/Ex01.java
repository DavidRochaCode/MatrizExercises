package ex01;
import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		/* Escreva um programa para guardar dados de uma pesquisa feita com uma amostra
		 * de pessoas da avenida mais movimentada da cidade onde você mora.
		 * A pesquisa consiste em perguntar ao cidadão a quantidade de filhos e o
		 * nome de cada filho. Guarde essas informações em uma matriz de forma que 
		 * cada pessoa da entrevista ocupe somente o espaço necessário na memória para guardar
		 * os nomes dos filhos.
		 * Imprima a quantidade de pessoas entrevistadas e os respectivos nomes dos filhos.*/
		
		Scanner scan = new Scanner(System.in);
		

		System.out.println("Entre com o número de pessoas que serão entrevistadas");
		
		int quantidadepessoasEntrevistadas = scan.nextInt();
		String[] nomesPessoasEntrevistadas = new String[quantidadepessoasEntrevistadas];
		String filhos[][] = new String[quantidadepessoasEntrevistadas][];
		
		
		for(int i = 0; i < filhos.length; i++ ) {
			System.out.println("Entre com o seu nome: ");
			nomesPessoasEntrevistadas[i] = scan.next();
			System.out.println("Entre com a quantidade de filhos");
			int quantidadeFilhos = scan.nextInt();
			
			filhos[i] = new String[quantidadeFilhos];
			for(int k = 0; k < filhos[i].length; k++) {
				System.out.println("Entre com o nome do filho " + (k+1));
				filhos[i][k] = scan.next();
			}
		}
		
		System.out.println(quantidadepessoasEntrevistadas+ "pessoas foram entrevistadas");
		for(int i = 0; i < filhos.length; i++) {
			System.out.println(nomesPessoasEntrevistadas[i] + " tem os seguintes filhos: ");
			for(int j = 0; j < filhos[i].length; j++) {
				System.out.println(filhos[i][j]+", ");
			}
		}
		
		
		
		}

	}

