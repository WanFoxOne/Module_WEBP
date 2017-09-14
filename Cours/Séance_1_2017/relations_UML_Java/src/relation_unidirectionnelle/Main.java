//Relation unidirectionnelle permanente : A ---> B
//Utilisation permanente : 
//l'inclusion de la classe utilisée est obligatoire
//Objet de B dans le constructeur de A

package relation_unidirectionnelle;

class A {

	private B b ;	
	
	public A(B b) {
		this.b = b ;
	}
	
	public void JeTravaillePourA(){
		this.b.JeTravaillePourB() ;
	}
	
	public void JeTravailleAussiPourA(){
		System.out.println("Je travaille aussi pour A") ; 
	}	
}

class B {

	// private String unAttribut ;
	
	public B(){}

	public void JeTravaillePourB(){
		System.out.println("Je travaille pour toutes les classes") ; 
	}
}

public class Main {
	
	public static void main(String[] args) { 
		B objetB = new B() ;
		A objetA = new A(objetB) ;
		objetA.JeTravaillePourA() ;
	}	
}