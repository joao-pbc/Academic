package Code;

import java.util.Scanner;

public class Operation {
	public static double operacao() {

		double numero1, numero2, result = 0;
		int tipoOperacao = 0;

		Scanner scan = new Scanner(System.in);

		
		for(boolean i=false;i==false;) {
			try {
				
				System.out.println("Escolha uma opção: "
						+ "\n" + "4.Adicionar" 
						+ "\n" + "3.Subtrair"
						+ "\n" + "2.Multiplicar"
						+ "\n" + "1.Dividir");

				tipoOperacao = scan.nextInt();

				if((tipoOperacao > 4) || (tipoOperacao < 1)) {
					throw new Exception();
				}

				System.out.println("Digite o número 1");

				numero1 = scan.nextDouble();

				System.out.println("Digite o número2");

				numero2 = scan.nextDouble();

				switch(tipoOperacao){
				case 1: 
					result = Div.div(numero1, numero2);

					break;

				case 2: 
					result = Mult.mult(numero1, numero2);

					break;

				case 3: 
					result = Sub.sub(numero1, numero2);

					break;

				case 4: 
					result =  Add.add(numero1, numero2);

					break;

				}
				i = true;
			}catch(Exception e) {
				System.out.println("Digite um valor válido");
				scan.next();

			}

		}

		scan.close();
		return result;
	}
}
