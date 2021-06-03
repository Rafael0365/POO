package app;

public class Main {

	public static void main(String[] args) {
		Vendedor vendedor1 = new Vendedor("Rafael", 18, "nike", 10);
		Gerente gerente1 = new Gerente("Vitoria", 20, "nike");
		System.out.println(vendedor1.getSalario());
		System.out.println(gerente1.calcularSalario(30));
		
		

	}

}
