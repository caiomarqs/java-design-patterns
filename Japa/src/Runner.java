
public class Runner {
	
	public boolean verificaTriangulo(int a, int b, int c) {
		boolean isTriangulo = false;
		
		if(Math.abs(b-c) < a && a < b+c) { //--> Verifica 1
			if(Math.abs(a-c) < b && b < a+c) { //--> Verifica 2
				if(Math.abs(a-b) < c && c < a+c) { //--> Verifica 3
					isTriangulo = true; //-> Se for triangulo
				}
			}
		}
		else {
			isTriangulo = false; //-> Se NÃO for triangulo
		}

		return isTriangulo; //--> retorna o que o if determina
	}
	
	
	public String verificaTipoTriangulo(int a, int b, int c) {
		String tipoTriangulo = null;
		
		if(verificaTriangulo(a, b, c)) {
			if(a != b && b != c && c != a) {
				tipoTriangulo = "escaleno";
			}
			else if((a == b && a != c) || (b == c && c !=a) || (c == a && a != b)) {
				tipoTriangulo = "isosceles";
			}
			else if(a == b && b == c && c == a) {
				tipoTriangulo = "equilatero";
				
				if(Math.pow(a, 2) == (Math.pow(b, 2) + Math.pow(c, 2))) { //--> exercicio 2
					tipoTriangulo = "equilatero e retangulo"; 
				}
			}	
		}
		
		return tipoTriangulo;
	}
}
