import java.util.Scanner;

public class Exercicio_4 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		float n1, n2, n3,n4, resultado;
		
		System.out.println("Digite o primeiro numero:");
		n1 = leia.nextFloat();
		
		System.out.println("Digite o segundo numero:");
		n2 = leia.nextFloat();
		
		System.out.println("Digite o terceiro numero:");
		n3 = leia.nextFloat();
		
		System.out.println("Digite o quarto numero:");
		n4 = leia.nextFloat();
		
		resultado = (n1*n2) - (n3*n4);
		
		System.out.println(" O resultado desta operação é: " + resultado);

	}

}
