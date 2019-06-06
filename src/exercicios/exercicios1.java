package exercicios;

import java.util.Random;
import java.util.Scanner;

public class exercicios1 {
	private static Scanner input;

	/* Crie um sistema para um jogo de adivinhação:
	 * 
       O sistema deve selecionar um número aleatório, de 0 a 50;
       O usuário deve digitar um número na tentativa de adivinhar o número sorteado;
       Caso o usuário acerte, ele ganha e o jogo encerra;
       Caso o usuário erre, ele perde uma vida e deve tentar novamente;
       O usuário tem 10 vidas. Caso sua quantidade de vidas chegue a zero,
       ele perdeu e o jogo é encerrado;
        * */

	public static void main(String[] args) {
		
	 input = new Scanner(System.in);
	 
	 Random random = new Random();
	
	 int numeroOculto = random.nextInt(50);
	 int chute = 0;
	 int tentativas = 10;
	 boolean acertou = false;
	 

	 System.out.println("Nome do jogador:");
	 String nome =input.nextLine();
	 
	 System.out.println("*JOGO DE ADIVINHAÇÃO*"+ "\n");
	 
	
	 while(tentativas>0 && acertou==false) {
		 System.out.println(nome + ", Adivinhe um Numero de 0 á 50?");
		 chute = input.nextInt();
		 
		 if(numeroOculto == chute) {
			 System.out.println("Parabéns! Você Acertou o Numero Secreto" +" é o numero "+ numeroOculto +"!");
			acertou = true;
		 }else if(chute < numeroOculto) {
			 --tentativas;
			 System.out.println("Numero Digitado Pequeno, " + tentativas +
					 " Tentativas Restante" + "\n");
		 }else {
			 --tentativas;
			 System.out.println("Numero Digitado Grande, " + tentativas +
					 " Tentativas Restantes" + "\n" );
		 } 
		 
		 
	 }
	 
	 
	}
}
