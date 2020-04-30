/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nayra Deniz
 */
public class Main {

	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {

		Account miCuenta;
		double saldo;

		miCuenta = new Account("Pepa Santana", "3333-1111-99-123456780");

		try {
			System.out.println("Ingreso en cuenta");
			miCuenta.ingresar(-1695);
		} catch (Exception e) {
			System.err.println(e.getMessage());
			System.out.println("Fallo al ingresar");
		}

		try {
			miCuenta.retirar(-10);
		} catch (Exception e) {
			System.err.println(e.getMessage());
			System.out.println("Fallo al retirar");
		}

		try {
			System.out.println("Ingreso en cuenta");
			miCuenta.ingresar(300);
		} catch (Exception e) {
			System.err.println(e.getMessage());
			System.out.println("Fallo al ingresar");
		}

		saldo = miCuenta.disponible();
		System.out.println("El saldo actual es " + saldo);
	}

}
