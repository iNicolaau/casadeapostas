package aposta;
import java.util.Scanner;

public class Valor {

	public static void main(String[] args) {
		Scanner ap = new Scanner(System.in);
		float valorBanca = 0,valorAposta = 0;
		String name;
		
		System.out.print("Digite o valor que deseja injetar: R$");
		valorBanca = ap.nextInt();
		
		if(valorBanca <= 0) {
			System.out.print("ERRO: Digite um valor maior que 0!!");
		}
		
		System.out.print("Digite o seu nome: ");
		name = ap.next();
	}
}
