package exercicios;

import java.util.Arrays;

public class Estruturados {

	public static void main(String[] args) {
		
		//Exercicio 7
			System.out.println("EX7---------------------------------------------");
			double r = 12, pi = 3.1415, area;
			
			area = pi*Math.pow(r, 2);
			
			int a_area = (int) area;
			
			System.out.println(a_area);
			System.out.println();
			
		//Exercicio 8
			System.out.println("EX8---------------------------------------------");
			double rest = 99 % 4;
			System.out.println(rest);
			System.out.println();
			
		//Exercicio 9
			System.out.println("EX9---------------------------------------------");
			double divisao = 50 * 0.5;
			int a_divisao = (int) divisao;
			System.out.println(a_divisao);
			System.out.println();
			
		//Exercicio 10
			System.out.println("EX10--------------------------------------------");
			double multiplic = Math.pow(8, 2);
			int a_multiplic = (int) multiplic;
			System.out.println(a_multiplic);
			System.out.println();
			
		//Exercicio 11
			System.out.println("EX11--------------------------------------------");
			int v_int = 20;
			
			if(v_int >= 15 && v_int <=100){System.out.println("O valor da váriavel está dentro do range de 15 a 100");}
			else{System.out.println("O valor da váriavel não está dentro do range de 15 a 100");}
			System.out.println();
			
		//Exercicio 12
			System.out.println("EX12--------------------------------------------");
			double v_doub = 2.76;
			
			if(v_doub >= 1.99 && v_doub <= 5.99){System.out.println("O valor da váriavel está dentro do range de 1.99 a 5.99");}
			else{System.out.println("O valor da váriavel não está dentro do range de 1.99 a 5.99");}
			System.out.println();

		//Exercicio 13
			System.out.println("EX13--------------------------------------------");
			if(v_int == v_doub){System.out.println("Os valores são iguais");}
			else{System.out.println("Os valores não são iguais");}
			System.out.println();

		//Exercicio 14
			System.out.println("EX14--------------------------------------------");
			double val1 = 2.76;
			int val2 = 7, res;
			
			res = (int) (val2 * val1);
			
			System.out.println(res);
			System.out.println();
		
		//Exercicio 15
			System.out.println("EX15--------------------------------------------");
			String [] o_array = {"Wagner", "Antonio", "Cláudia", "Fernanda", "Sarah"};
			Arrays.sort(o_array);
			 
	        System.out.printf("Em ordem alfabética: %s\n",Arrays.toString(o_array));
	        System.out.println();
			
		//Exercicio 16 & 17
	        System.out.println("EX16&17------------------------------------------");
			double valA = 27, valB = 12, valArea;
			
			valArea = valA * valB;
			
			if(valA == valB){System.out.println("Lado a = "+ valA +"\nLado a = "+valB+"\nA área é = "+valArea+"\nA figura é um quadrado");}
			else{System.out.println("Lado a = "+ valA +"\nLado a = "+valB+"\nA área é = "+valArea+"\nA figura é um retângulo");}
			System.out.println();
			
		//Exercicio 18
			System.out.println("EX18--------------------------------------------");
			int x = 412, y = 588, result;
			
			result = x-(-y);
			
			System.out.println(result);
			System.out.println();

		//Exercicio 19
			System.out.println("EX19--------------------------------------------");
			int x1 = 4;
			
			while(x1 < 10)
			{
				System.out.println("X é menor que 10");
				x1=21;
			}
			while(x1 >= 11 && x1 < 20)
			{
				System.out.println("X é maior que 10");
				x1=21;
			}
			System.out.println();

		//Exercicio 20
			System.out.println("20--------------------------------------------");
			int fm;
			
			fm = v_int+val2+result+a_area+a_divisao+a_multiplic;
			
			System.out.println("A soma dos valores é = "+fm);
			System.out.println();
	}

}
