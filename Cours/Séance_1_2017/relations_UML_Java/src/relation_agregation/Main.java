//Relation d'agrégation
//Association dans laquelle un objet est encapsulé dans un autre
//avec possibilité d'entrée-sortie. Présence de getters/setters.
//Cette relation est utilisée pour effectuer une délégation de responsabilités.
//Utilisations : propagation des valeurs d'attributs d'une classe vers une autre classe,
//action sur une classe qui implique une action sur une autre classe, subordination des objets, ...
//Différence sémantique entre association et agrégation, pas au niveau du code

package relation_agregation;

class A {

	private B b ;	
	
	public void setB(B b) {
		this.b = b ; 
	}
	
	public void getB(){
		System.out.println("ObjetB " + this.b) ; 
	}
	
	public void event(int priorite,String message){
		if (this.b instanceof B){
			String priorite_S = String.format("%d",priorite);
			String texte = "Priorite " +""+ priorite_S + " Message " + message ;
			this.b.afficher(texte);	// Affichage délégué à la classe B
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
		B objetB = new B() ;
		objetA.setB(objetB) ;
		objetA.getB() ;
		objetA.event(1,"toto") ;
	}
}