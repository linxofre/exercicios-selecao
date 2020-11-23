/*3 - Faça um Programa para um caixa eletrônico. O programa deverá perguntar ao 
usuário a valor do saque e depois informar quantas notas de cada valor serão 
fornecidas. As notas disponíveis serão as de 1, 5, 10, 50 e 100 reais. O valor 
mínimo é de 10 reais e o máximo de 600 reais. O programa não deve se preocupar 
com a quantidade de notas existentes na máquina. 
Exemplo 1: Para sacar a quantia de 256 reais, o programa fornece duas notas de 
100, uma nota de 50, uma nota de 5 e uma nota de 1; 
Exemplo 2: Para sacar a quantia de 399 reais, o programa fornece três notas de 
100, uma nota de 50, quatro notas de 10, uma nota de 5 e quatro notas de 1.  */

import java.util.Scanner;

public class Caixa_eletronico {

	public static void main(String[] args) {
		
	Scanner entrada = new Scanner(System.in);
	
	int nota_100 = 100;
	int nota_50 = 50;
	int nota_10 = 10;
	int nota_5 = 5;
	int nota_1 = 1;	
	
	System.out.println("Digite o valor que você deseja sacar. Valor mínimo: R$10,00. Valor máximo: R$600,00");
	int valor = entrada.nextInt();
	
	

	if(valor >= 10 && valor <= 600) {
		if (valor >= nota_100) {
			nota_100 = valor / 100; 
			valor = valor % 100;   
			System.out.println(nota_100 + " notas de 100");
		} 
		if(valor >= nota_50){
			nota_50 = valor / 50;
			valor = valor % 50;
			System.out.println(nota_50 + " notas de 50");
		}
		if(valor >= nota_100) {
			nota_10 = valor / 10;
			valor = valor % 10;
			System.out.println(nota_10 + " notas de 10");
		}if(valor >= nota_5) {
			nota_5 = valor / 5;
			valor = valor % 5;
			System.out.println(nota_5 + " notas de 5");
		}if(valor >= nota_1) {
			nota_1 = valor / 1;
			valor = valor % 1;
			System.out.println(nota_1 + " notas de 1");
		}
	}else {
		System.out.println("Não é possível realizar o saque");
	}	
			}





}
