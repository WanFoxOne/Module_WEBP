// Ensemble d'objets � r�p�tition (boucle for) 
// pour que le ramasse-miettes soit appel� automatiquement
// et r�cup�re un certain nombre d'objets devenus inutiles
// Pas d'appel explicite au ramasse-miettes : 
// il d�cide seul de son intervention quand la m�moire commence � saturer
// Visualiser la sortie console pour voir les appels de la m�thode finalize

package relation_agregation_composition;

class A {
	//private int unAttributA ;
	private B b ;  // Il ne faut pas que ce lien apparaisse dans un "return"
	private C c ;
	
	public A(C c) {
		b = new B() ;	// un lien de composition est cr��
		this.c = c  ;	// un lien d'agr�gation est cr��
	}
	
	public void JeTravaillePourA() {
		b.JeTravaillePourB() ;	// un message vers B
		c.JeTravaillePourC() ;	// un message vers C
	}
	
	protected void finalize() {	// Appel de cette m�thode quand l'objet est effac� de la m�moire
		System.out.println(" ... un objet A se meurt ... ");
	}
	
}

class B {
	B() {}
	public void JeTravaillePourB() {
		System.out.println("Je suis une instance de B au service de toutes les classes");
	}
	
	protected void finalize() {	// Appel de cette m�thode quand l'objet est effac� de la m�moire
		System.out.println(" ... un objet B se meurt ... ");
	}
}

class C {
	public void JeTravaillePourC() {
		System.out.println("Je suis une instance de C au service de toutes les classes");
	}
	
	protected void finalize() {	// Appel de cette m�thode quand l'objet est effac� de la m�moire
		System.out.println(" ... un objet C se meurt ... ");
	}
}

public class Main {

	public static void main(String[] args) {
		C[] c = new C[1000000] ;
		for (int i=0; i<1000000; i++) {
			c[i] = new C() ;
			A a = new A(c[i]) ;		// On passe le r�f�rent de l'objet C � l'objet A
			a.JeTravaillePourA();
			a = null ;				// On cherche � se d�barasser de l'objet A (instruction pas n�cessaire)
		}
	}
}
