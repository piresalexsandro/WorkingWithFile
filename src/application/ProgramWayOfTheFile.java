package application;

import java.io.File;
import java.util.Scanner;

public class ProgramWayOfTheFile {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a file path: ");
		String strPath = sc.nextLine();
		File path = new File(strPath);
		
		System.out.println("getName: " + path.getName()); // pega o nome do arquivo
		System.out.println("getParent: " + path.getParent()); // pega o caminho do arquivo
		System.out.println("getPath: " + path.getPath()); // pega o caminho do arquivo e o nome
		
		sc.close();
	}
}
