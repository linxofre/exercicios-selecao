import java.util.Scanner;

public class Hello {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int numI = 3;
		float numF = 3.14f;
		double numD = 239832.23;
		
		boolean teste = true;
		
		String texto = "meu texto vai aqui";
		char letra = 'r';
		
		System.out.print("informe um texto: ");
		texto = entrada.nextLine();
		
		System.out.print("informe uma letra: ");
		letra = entrada.nextLine().charAt(0);
		
		System.out.print("informe um número: ");
		numI = entrada.nextInt();
		
		System.out.print("informe um número: ");
		numF = entrada.nextFloat();
		
		System.out.print("informe um número: ");
		numD = entrada.nextDouble();
		
		System.out.println("texto: " + texto);
		System.out.println("letrinha: " + letra);
		System.out.println("numero inteiro: " + numI);
		System.out.println("float: " + numF);
		System.out.println("double: " + numD);
	}

}
