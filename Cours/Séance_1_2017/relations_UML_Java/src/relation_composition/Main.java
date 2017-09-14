//Relation de composition
//Couplage très fort entre deux classes
//La destruction de l'objet composite entraîne celle de l'objet composant
//"new" au sein du constructeur d'une classe et absence de get/set

package relation_composition;

class A {

	private B b ;	
	
	public A() {
		this.b = new B() ;
	}
													
	public void event(int priorite,String message){
		if (this.b instanceof B){
			String priorite_S = String.format("%d",priorite);
			String texte = "Priorite " +""+ priorite_S + " Message " + message ;
			this.b.afficher(texte); 
                // Affichage délégué à la classe B
		}
	}
}


class B {

	public void afficher(String texte){
		System.out.println(texte) ;
	}
}


public class Main {
	
	public static void main(String[] args) { 
		A objetA = new A() ;
		objetA.event(1,"toto") ;
	}
}
