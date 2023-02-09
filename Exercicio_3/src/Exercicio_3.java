import java.util.Scanner;
public class Exercicio_3 {

	public static void main(String[] args) {


				Scanner leia = new Scanner(System.in);
				
				float salarioBruto, adicionalNoturno, horasExtra, descontos;
				
				System.out.println("Digite o salaário Bruto:");
				salarioBruto = leia.nextFloat();
				
				System.out.println("Digite o Adicional noturno:");
				adicionalNoturno = leia.nextFloat();
				
				System.out.println("Digite horas extras:");
				horasExtra = leia.nextFloat();
				
				System.out.println("Digite o desconto:");
				descontos = leia.nextFloat();
				

				
				System.out.println(" O seu salário líquido é: " + (salarioBruto + adicionalNoturno + (horasExtra*5)-descontos));

	}

}
