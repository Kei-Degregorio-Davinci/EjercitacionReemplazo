import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		//JOptionPane.showMessageDialog(null, "Bienvenido al programa");
		
		
		Editorial planeta = new Editorial("Planeta", "11251236", "Avenida corrientes 2037", "EditorialPlaneta@gmail.com", "20-21058251-2");
				
		Autor cortazar = new Autor("Julio", "Cortazar", "1914", "Masculino", "julio.cortazaro@davinci.edu.ar"); 
			
		Libro rayuela = new Libro("Rayuela", "1968", 2, 2000, planeta, cortazar); 
		
		Libro bestiario = new Libro ("Bestiario", "1951", 3, 3000, planeta, cortazar);
		
		Libro casaTomada = new Libro ("Casa Tomada", "1988", 4, 5000, planeta, cortazar); 
		
		JOptionPane.showMessageDialog(null, rayuela);
		JOptionPane.showMessageDialog(null, bestiario);
		JOptionPane.showMessageDialog(null, casaTomada);

	}
		
	

}