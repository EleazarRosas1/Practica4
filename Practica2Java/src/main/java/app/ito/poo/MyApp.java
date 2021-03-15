package app.ito.poo;
import java.time.LocalDate;

import clases.ito.poo.CuentaBancaria;
public class MyApp {
	static void run() {
		CuentaBancaria c=new CuentaBancaria(565865,"Lucia mendoza", 10000, LocalDate.of(2020, 8, 8));
	System.out.println(c);
	System.out.println("Se retira:  "+c.retiro(1000));
	System.out.println(c);
	System.out.println("Deposito: "+c.deposito(20000));
	System.out.println(c);
	
	}
	public static void main(String []args) {
		run();
		
	}
}
