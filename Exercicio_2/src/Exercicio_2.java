import java.util.Scanner;

public class Exercicio_2 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		float nota1, nota2, nota3, nota4 ,mediaFinal;
		
		System.out.println("Digite a nota 1:");
		nota1 = leia.nextFloat();
		
		System.out.println("Digite a nota 2:");
		nota2 = leia.nextFloat();
		
		System.out.println("Digite a nota 3:");
		nota3 = leia.nextFloat();
		
		System.out.println("Digite a nota 4:");
		nota4 = leia.nextFloat();

		
		System.out.println(" A sua média final é: " + (nota1+nota2+nota3+nota4)/4);
		

	}

}
