package primerParcial;

public class Robot {

	private int columna;
	private int fila;
	private char sentidoAlInicio;
	private int columnasTotales;
	private int filasTotales;
	private int grados;

	public Robot(int col, int fila, char sent, int colmax, int filamax) {
		this.columna = col;
		this.fila = fila;
		this.sentidoAlInicio = sent;
		this.columnasTotales = colmax;
		this.filasTotales = filamax;
		setGrados(sent);
	}

	public void setGrados(char s) {
		if (s == 'E')
			this.grados = 0;
		if (s == 'N')
			this.grados = 90;
		if (s == 'O')
			this.grados = 180;
		if (s == 'S')
			this.grados = 270;

	}

	public void sumarGrados(int a) {
		if (a >= 0 && a < 10) {
			int test = ((a + 4) % 4);
			if (test == 0)
				this.grados += 0;
			if (test == 1)
				this.grados += 90;
			if (test == 2)
				this.grados += 180;
			if (test == 3)
				this.grados += 270;
		} else
			System.out.println("El valor tiene que estar entre el rango 0-9");
		
	}
	
	

	public void Orden(char accion, int movimiento) {

	}

}
