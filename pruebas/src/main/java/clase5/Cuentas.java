package clase5;

import java.util.Arrays;

public class Cuentas {

	public static void main(String[] args) {

		
		//esto viene de afuera
		String[] archivo = new String[]{
				"1000; juan lopez; 1500; ca",
				"2000;jose guzman; 115000;ca",
				"3000;juan martinez;-1000;cc",
				"4000;matias perez;100000;cc",
				"5000;elsa moyano;21000;cc"};
		
		//obtener cuentas con saldo negativo con apyn
		//obtener cuentas con saldo mayor a 100000 con apyn
		
		
		Object[][] matriz = new Object[archivo.length][4];
		
		Object[][] resultado = new Object[5][4];
		//separando por ;
		/*
		for(String registro : archivo) {
			String[] cuenta = registro.split(";");
			Integer numCuenta = Integer.parseInt(cuenta[0]);
			String apyn = cuenta[1];
			Double saldo = Double.parseDouble(cuenta[2]);
			String tipo = cuenta[3];
		
			System.out.println("Registro: " + Arrays.toString(cuenta));
			System.out.println("Numero: " + numCuenta);
			System.out.println("Apellido y Nombre: " + apyn);
			System.out.println("Saldo: " + saldo);
			System.out.println("Tipo de Cuenta: " + tipo);
			*/
		
		
		// obteniendo los negativos
		
		for(int i=0; i < archivo.length; i++) {
			String registro = archivo[i];
			
			String[] cuenta = registro.split(";");
			Integer numCuenta = Integer.parseInt(cuenta[0]);
			String apyn = cuenta[1];
			Double saldo = Double.parseDouble(cuenta[2]);
			String tipo = cuenta[3];
		

			if(saldo < 0) {
				resultado[i][0] = saldo;
				resultado[i][1] = apyn;
				resultado[i][2] = numCuenta;
				resultado[i][3] = tipo;
			}	

			
			if(saldo >= 100000) {
				resultado[i][0] = saldo;
				resultado[i][1] = apyn;
				resultado[i][2] = numCuenta;
				resultado[i][3] = tipo;
			}	
				
				
		}
		
		for(int f = 0; f < resultado.length; f++) {
			for(int c = 0; c < resultado[f].length;c++) {
				if(resultado[f][c] != null) {
				System.out.println(resultado[f][c]);
				}
				
			}
		}
		
		
		
	}

}
