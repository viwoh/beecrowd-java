import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double c = sc.nextDouble();
		double areaTrianguloRetangulo = a * c / 2;
		double areaCirculoRaio = 3.14159 * c * c;
		double areaTrapezio = (a + b) * c / 2;
		double areaQuadrado = b * b;
		double areaRetangulo = a * b;

		System.out.printf("TRIANGULO: %.3f%n",areaTrianguloRetangulo);
		System.out.printf("CIRCULO: %.3f%n",areaCirculoRaio);
		System.out.printf("TRAPEZIO: %.3f%n",areaTrapezio);
		System.out.printf("QUADRADO: %.3f%n",areaQuadrado);
		System.out.printf("RETANGULO: %.3f%n",areaRetangulo);

		sc.close();
	}

}
