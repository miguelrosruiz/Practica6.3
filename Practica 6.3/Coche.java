import javax.swing.JOptionPane;

public class Coche {
	private String matricula;
	private String marca;
	private String modelo;
	private String color;
	private boolean techoSolar;
	private double kilometros;
	private int numPuertas;
	private int numPlazas;
	
	public Coche() {
		matricula = "Sin valor por defecto";
		marca = "SEAT";
		modelo = "ALTEA";
		color = "Blanco";
		techoSolar = false;
		kilometros = 0.0;
		numPuertas = 3;
		numPlazas = 5;
	}
	
	public Coche(String matricula) {
		this();
		this.matricula = matricula;
	}
	
	public Coche(int numPuertas, int numPlazas) {
		this();
		this.numPuertas = numPuertas;
		this.numPlazas = numPlazas;
	}
	
	public Coche(String marca,String modelo, String color) {
		this();
		this.marca=marca;
		this.color=color;
		this.modelo=modelo;
	}
	
	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public boolean isTechoSolar() {
		return techoSolar;
	}

	public void setTechoSolar(boolean techoSolar) {
		this.techoSolar = techoSolar;
	}

	public double getKilometros() {
		return kilometros;
	}

	public void setKilometros(double kilometros) {
		this.kilometros = kilometros;
	}

	public int getNumPuertas() {
		return numPuertas;
	}

	public void setNumPuertas(int numPuertas) {
		if (numPuertas<5 && numPuertas>0) {
			this.numPuertas = numPuertas;
		}else {
			JOptionPane.showMessageDialog(null,"No es un valor valido.");
		}
	}

	public int getNumPlazas() {
		return numPlazas;
	}

	public void setNumPlazas(int numPlazas) {
		if (numPlazas<7 && numPlazas>0) {
			this.numPlazas = numPlazas;
		}else {
			JOptionPane.showMessageDialog(null,"No es un valor valido.");
		}
	}
	
	public void avanzar(Double kilometros) {
		double cuentakm  = kilometros;
		this.kilometros = this.kilometros + cuentakm;
		setKilometros(this.kilometros);
	}
	
	public String tunear() {
		double cuentakm = 0.0;
		String mensaje = null;
		do {
			if(this.techoSolar==false) {
				mensaje = "No";
				
			}else{
				mensaje="Si";
			}
		}while(this.techoSolar==true);
		return mensaje;
	}
	
	public String tunear(String color) {
		double cuentakm  = 0.0;
		String mensaje = null;
		do {
			if(techoSolar==false) {
				this.color=color;
				setColor(this.color);
				mensaje = "No"+ getColor();
				techoSolar=true;
			}else {
				this.color=color;
				setColor(this.color);
				mensaje = "Si"+ getColor();
			}
		}while(techoSolar==true);
		return mensaje;
		
	}
	public String matricular(String matricula) {
		this.matricula=matricula;
		return matricula;
	}
}
