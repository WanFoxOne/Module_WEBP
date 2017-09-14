//Relation unidirectionnelle ponctuelle : A ---> B
//Utilisation ponctuelle : 
//la classe A peut ne jamais utiliser la classe B
//Objet de B dans une méthode de A
//ou bien on inclut la classe B dans une méthode de A 

package relation_dependance;

class A {	
	
	public A() {}
	
	public void JeTravaillePourA(B b){
		b.JeTravaillePourB() ;		// envoi vers B }
	}
	
	public void JeTravailleAussiPourA(){
		B autre_b = new B() ;
		autre_b.JeTravaillePourB() ; // envoi vers B }
	}
}

class B {

	// private String unAttribut ;
	
	public B() {}

	public void JeTravaillePourB(){
		System.out.println("Je travaille pour toutes les classes") ; 
	}
}

public class Main {
	
	public static void main(String[] args) { 
		B objetB = new B() ;
		A objetA = new A() ;
		objetA.JeTravaillePourA(objetB) ;
		objetA.JeTravailleAussiPourA() ;
	}
}