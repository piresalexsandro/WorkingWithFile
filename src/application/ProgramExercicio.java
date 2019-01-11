package application;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;


public class ProgramExercicio {

	public static void main(String[] args) {
	
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<Produto> produtos = new ArrayList<>();
		FileReader fr = null;
		BufferedReader br = null;
	
		System.out.print("Entre com a quantidade de produtos: ");
		int n = sc.nextInt();
		int countLine = 0;
		
		// ************************************   colocando em lista o que foi digitado
		for(int i=0; i<n; i++) {
			System.out.print("Nome..: ");
			String nome = sc.next();
			System.out.print("Valor.: ");
			double preco = sc.nextDouble();
			System.out.print("Qtde..: ");
			int qtde = sc.nextInt();
			
			Produto p = new Produto(nome, preco, qtde);
			produtos.add(p);
	    }
		
		//************************************   Criando e gravando arquivo
		String pathIn = "C:\\Users\\2102254255\\eclipse-workspace\\temp\\ArquivoDeProdutos.txt";
		File fileIn = new File(pathIn);
		try {
			fileIn.createNewFile();
		} catch (IOException e) {
			e.printStackTrace();
		}
		// gravando arquivo
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(fileIn))) {
			//int countLine = 0;
			for (Produto produto : produtos) {
				bw.write(produto.toString());
				
				countLine++;
				if (countLine < n)
				   bw.newLine();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		//lendo e sumarizando e gerando arquivo conforme regra
		try {
			fr = new FileReader(pathIn);
			br = new BufferedReader(fr);
			
			String line = br.readLine();
			String pathOut = "C:\\Users\\2102254255\\eclipse-workspace\\temp\\ArquivoConsolidadoDeProdutos.txt";
			File fileOut = new File(pathOut);
			try {
				fileOut.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}	
			
			countLine = 0;		
			
			while(line  != null) {
				try (BufferedWriter bw = new BufferedWriter(new FileWriter(fileOut))) {
					String[] retornoSplit = line.split(Produto.SEPARATOR);
					double tot = totais(Double.valueOf(retornoSplit[1]), Integer.valueOf(retornoSplit[2]));
					String[] lines = new String[] {retornoSplit[0], Produto.SEPARATOR, String.valueOf(tot)};
					
					for (String line1 : lines) {
						bw.write(line1);
					}
					
					bw.write('\n');
					
					countLine++;
					if (countLine < n) {
						bw.newLine();
					}
				} catch (IOException e) {
					e.printStackTrace();
				}
								
				line = br.readLine();
			}
		}
		catch (IOException e) {
			System.out.println("Error:" + e.getMessage());
		}
		finally {
			try {
				if (br != null) {
					br.close();
				}
				if (fr != null) {
					fr.close();
				}
			}
			catch (IOException e) {
				System.out.println("Error:" + e.getMessage());
			}
		}
		sc.close();
	}
	public static double  totais(double preco, int qtde) {
		return preco * qtde;
	}
}
