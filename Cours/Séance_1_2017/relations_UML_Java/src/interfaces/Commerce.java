//Implémentation d'interfaces :
//Lien fort qui nécessite l'inclusion du code de l'interface
//dans le code de la classe
//Obligatoirement un fichier pour chaque interface

package interfaces;

public class Commerce implements A, B{
	
	public void acheter(String param) {
		System.out.println("Acheter " + param + " stylos") ;
	}
	
	public void vendre() {
		System.out.println("Vendre du papier") ;
	}

	public static void main(String[] args) { 
		Commerce objetCommerce = new Commerce() ;
		objetCommerce.acheter("10") ;
		objetCommerce.vendre() ;
	}
}