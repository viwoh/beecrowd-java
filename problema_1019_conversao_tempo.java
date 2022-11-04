import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);
		int segundos = x.nextInt();
		int minutos = segundos/60;
		int segundosResto = segundos%60;
		int horas = 0;
		if (minutos > 59) {
			horas = minutos/60;
			minutos = minutos%60;
		}

		System.out.printf("%d : %d : %d",horas, minutos, segundosResto);




		x.close();
	}

}
