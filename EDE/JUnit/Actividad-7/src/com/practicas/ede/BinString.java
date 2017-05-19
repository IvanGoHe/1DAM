// Primer cambio: Iván Gómez

package com.practicas.ede;

// ¿Qué puede hacer esta Clase?
public class BinString {
	public BinString(){}

	// ¿Qué hace este método?
	//convierte el string a binario
	public String convertir(String s){
		return aBinario(sumar(s));
	}
	
	// ¿Qué hace este método?
	//convierte una cadena a su valor asci
	public int sumar(String s){
		String s1 = s.substring(0);
		int sum = 0;
		while(!s1.equals(""))
		{
			sum = sum+(int)(s1.charAt(0));
			s1 = s1.substring(1);
		}
		
		return sum;
	}
	
	// ¿Qué hace este método?
	//convierte un numero a su valor binario
	public String aBinario(int n){
	    String s = "";
	    
	    while (n > 0)
	    {
	    	if(n%2==0)
	    		s = "0"+s;
	    	else
	    		s = "1"+s;
	        n = n / 2;
	    }
	    
	    return s;
	}
	
	
	//4.- testRun: ejecutar el test y comprobar si funciona
	//Failures: Indica los fallos que se han encontrado
	//Errors: indica los errores que se han producido al ejecutar
}
