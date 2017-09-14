//Relation bidirectionnelle : A <---> B
//unidirectionnelle vers B, ponctuelle vers A

package relation_bidirectionnelle_simple;

class A {

	private B b ;	
	
	public A(B b) {
		this.b = b ;
	}
	
	public void JeTravaillePourA(){
		System.out.println("Je travaille pour A") ; 
		this.b.JeTravaillePourB(this) ;	// envoi de message vers B 
	}
	
	public void JeTravailleAussiPourA(){
		System.out.println("Je travaille aussi pour A") ; }
}

class B {

   public B() {}

	public void JeTravaillePourB(A a){  // association ponctuelle vers A
		System.out.println("Je travaille pour B") ;
		a.JeTravailleAussiPourA() ;  // message vers A 
	}
}

public class Main {
	
	public static void main(String[] args) { 
		B objetB = new B() ;
		A objetA = new A(objetB) ;
		objetA.JeTravaillePourA() ;
		objetB.JeTravaillePourB(objetA) ;
	}
}