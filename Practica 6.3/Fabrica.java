import javax.swing.JOptionPane;

public class Fabrica {

	public static void main(String[] args) {
		Coche[] coches = new Coche [4];
		coches[0] = new Coche("1234-DF");
		coches[0].setModelo("Toledo");
		coches[0].setColor("Azul");
		coches[0].avanzar(200.0);
		JOptionPane.showMessageDialog(null,caracteristicas(coches[0]));
		
		coches[1] = new Coche("5678-AG");
		coches[1].setMarca("Fiat");
		coches[1].setModelo("Uno");
		coches[1].setColor("Rojo");
		coches[1].setTechoSolar(true);
		coches[1].avanzar(300.0);
		coches[1].setNumPlazas(2);
		JOptionPane.showMessageDialog(null,caracteristicas(coches[1]));
		
		coches[2] = new Coche("9012-HH");
		coches[2].setMarca("BMW");
		coches[2].setModelo("850");
		coches[2].setColor("Gris");
		coches[2].avanzar(400.0);
		coches[2].setNumPuertas(5);
		coches[2].setNumPlazas(5);
		JOptionPane.showMessageDialog(null,caracteristicas(coches[2]));

		coches[3] = new Coche("3456-XS");
		coches[3].setMarca("VW");
		coches[3].setModelo("Caddy");
		coches[3].setTechoSolar(true);
		coches[3].avanzar(500.0);
		coches[3].setNumPuertas(5);
		coches[3].setNumPlazas(7);
		JOptionPane.showMessageDialog(null,caracteristicas(coches[3]));


	}
	
	public static String caracteristicas(Coche o) {
		String mensaje;
		mensaje ="La matricula es: "+o.getMatricula()+ "\n La marca es: " + o.getMarca() + "\n El modelo es: " + o.getModelo() +"\n El color es: " + o.getColor() + "\n Tiene techo solar? " + o.isTechoSolar() + "\n Sus KM son: " + o.getKilometros() + "\n El nº de puertas es: "+ o.getNumPuertas() + "\n El nº de plazas es: " + o.getNumPlazas();
		return mensaje;
	}
}
