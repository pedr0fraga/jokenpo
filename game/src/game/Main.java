package game;
import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		int opponent = (int)(Math.random() * 3);
		
		System.out.println("-----------");
		System.out.println("JoKenPo");
		System.out.println("-----------");
		System.out.println("0 - Pedra");
		System.out.println("1 - Papel");
		System.out.println("2 - Tesoura");
		System.out.print("Qual sua escolha? ");
		int player = sc.nextInt();
		System.out.println();
		
		if(player == opponent ) {
			System.out.println("O jogo empatou!");
		}else if (player == 0 && opponent == 1) {
			System.out.println("O oponente escolheu Papel.");
			System.out.println("O oponente venceu!");
		}else if (player == 0 && opponent == 2) {
			System.out.println("O oponente escolheu Tesoura.");
			System.out.println("Você venceu!");
		}else if (player == 1 && opponent == 0) {
			System.out.println("O oponente escolheu Pedra.");
			System.out.println("Você venceu!");
		}else if (player == 1 && opponent == 2) {
			System.out.println("O oponente escolheu Tesoura.");
			System.out.println("O oponente venceu!");
		}else if (player == 2 && opponent == 0) {
			System.out.println("O oponente escolheu Pedra.");
			System.out.println("O oponente venceu!");
		}else {
			System.out.println("O oponente escolheu Papel.");
			System.out.println("Você venceu!");
		}
		
		sc.close();
	}

}
