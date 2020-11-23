/*2 -  As Organizações Tabajara resolveram dar um aumento de salário aos seus 
colaboradores e lhe contrataram para desenvolver o programa que calculará os reajustes. 

 ◦ Faça um programa que recebe o salário de um colaborador e calcule 
    o reajuste segundo o seguinte critério, baseado no salário atual: 

 ◦ salários até R$ 280,00 (incluindo) : aumento de 20% 
 ◦ salários entre R$ 280,00 e R$ 700,00 : aumento de 15% 
 ◦ salários entre R$ 700,00 e R$ 1500,00 : aumento de 10% 
 ◦ salários de R$ 1500,00 em diante : aumento de 5% Após
    o aumento ser realizado, informe na tela: 

        ◦ o salário antes do reajuste; 
        ◦ o percentual de aumento aplicado; 
        ◦ o valor do aumento; 
        ◦ o novo salário, após o aumento. */

import java.util.Scanner;

public class Tabajara_orgs {

		public static void main(String[] args) {
			
			Scanner entrada = new Scanner(System.in);
			
			double salario;
			double aumento;
			
			
			System.out.print("informe o salario: ");
			salario = entrada.nextDouble();
			
			System.out.println("informe o aumento: ");
			aumento = entrada.nextDouble();
			
			if (salario < 280 && aumento == 20 && salario > 0) {
				System.out.println("o salario era de: " + salario);
				System.out.println("o valor do aumento é de: 20%");
				System.out.println("o valor do aumento é de: " + (aumento = (salario * 0.2)));
				System.out.println("o salario com aumento é de:  " + (salario = salario + aumento));
			}else if (salario > 280.0 && salario < 700.0 && aumento == 15) { 
					System.out.println("o salario era de: " + salario);
					System.out.println("o valor do aumento é de: 15%");
					System.out.println("o valor do aumento é de: " + (aumento = (salario * 0.15)));
					System.out.println("o salario com aumento é de:  " + (salario = salario + aumento));
			}else if (salario > 700.0 && salario < 1500.0 && aumento == 10) { 
				System.out.println("o salario era de: " + salario);
				System.out.println("o valor do aumento é de: 10%");
				System.out.println("o valor do aumento é de: " + (aumento = (salario * 0.10)));
				System.out.println("o salario com aumento é de:  " + (salario = salario + aumento));
			}else if (salario > 1500.0) { 
				System.out.println("o salario era de: " + salario);
				System.out.println("o valor do aumento é de: 5%");
				System.out.println("o valor do aumento é de: " + (aumento = (salario * 0.05)));
				System.out.println("o salario com aumento é de:  " + (salario = salario + aumento));
			
	
		}
	}
}
