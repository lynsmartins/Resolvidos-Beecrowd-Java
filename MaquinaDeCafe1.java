package condicional;

import java.util.Scanner;

public class MaquinaDeCafe1 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		int qntFun1, qntFun2, qntFun3;
		int andar1, andar2, andar3;

		qntFun1 = leitor.nextInt();
		qntFun2 = leitor.nextInt();
		qntFun3 = leitor.nextInt();

		andar1 = (qntFun2 * 2) + (qntFun3 * 4);
		andar2 = (qntFun1 * 2) + (qntFun3 * 2);
		andar3 = (qntFun1 * 4) + (qntFun2 * 2);
		
		if(andar1<=andar2 && andar1<=andar3) {
			System.out.println(andar1);
		}else {
			if(andar2<=andar1 && andar2<=andar3) {
				System.out.println(andar2);
			}else {
				System.out.println(andar3);
			}
		}

	}

}
