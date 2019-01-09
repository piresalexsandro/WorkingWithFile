package application;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import br.com.udemy.entities.HourContract;

public class ProgramExercicio {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		private List<Produto> produtos = new ArrayList<>();
		
		System.out.println("Entre com a quantidade de produtos: ");
		int n = sc.nextInt();
		
		for(int i=0; i<n; i++) {
			System.out.print("Nome..: ");
			String nome = sc.next();
			System.out.print("Valor.: ");
			double preco = sc.nextDouble();
			System.out.print("Qtde..: ");
			int qtde = sc.nextInt();
			
			Produto p = new Produto(nome, preco, qtde);
			for (Produto produto : produtos) {
				p
			}
			
		}
		
		sc.close();
	}

}
