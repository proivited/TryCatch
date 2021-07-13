
public class Principal {
	
	static int numerador =10;
	static int denominador = 10;
	static float division;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		
		System.out.println("Antes de la division");
		try {
			division = numerador / denominador;
		} catch(ArithmeticException ex) {
			division = 0;
			System.out.println("Error: " + ex.getMessage());
		} finally {
			System.out.println("Despues de la division");
		}
		
		//foreach en java
		
		String frutas[] = {"pera", "manzana", "uva", "mango"};
		
		for(String fruta: frutas) {
			System.out.println(fruta);
		}

	}

}
