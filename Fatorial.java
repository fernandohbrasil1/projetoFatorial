public class Fatorial {

	// Versão iterativa de calculo vetorial
	public int calcularFatorial(int n) throws IllegalArgumentException {		
		int resultado = 1;
		if(n < 0){ 		
			throw new IllegalArgumentException("Não existe fatorial para numeros negativos");
		} else {				
			for (int i = 2; i <= n; i++) {
				resultado*=i;		
			}	
		}		
		return resultado;
	}
}
