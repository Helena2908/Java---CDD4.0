package aula2;

public class exercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 1; i <= 100; i = i + 1) {
			if (i > 50 && i < 70) {
				continue;
			}
			System.out.println(i);	
		}
}
}	