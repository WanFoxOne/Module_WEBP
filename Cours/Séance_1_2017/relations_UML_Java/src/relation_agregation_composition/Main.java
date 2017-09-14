// Ensemble d'objets à répétition (boucle for) 
// pour que le ramasse-miettes soit appelé automatiquement
// et récupère un certain nombre d'objets devenus inutiles
// Pas d'appel explicite au ramasse-miettes : 
// il décide seul de son intervention quand la mémoire commence à saturer
// Visualiser la sortie console pour voir les appels de la méthode finalize

package relation_agregation_composition;

class A {
	//private int unAttributA ;
	private B b ;  // Il ne faut pas que ce lien apparaisse dans un "return"
	private C c ;
	
	public A(C c) {
		b = new B() ;	// un lien de composition est créé
		this.c = c  ;	// un lien d'agrégation est créé
	}
	
	public void JeTravaillePourA() {
		b.JeTravaillePourB() ;	// un message vers B
		c.JeTravaillePourC() ;	// un message vers C
	}
	
	protected void finalize() {	// Appel de cette méthode quand l'objet est effacé de la mémoire
		System.out.println(" ... un objet A se meurt ... ");
	}
	
}

class B {
	B() {}
	public void JeTravaillePourB() {
		System.out.println("Je suis une instance de B au service de toutes les classes");
	}
	
	protected void finalize() {	// Appel de cette méthode quand l'objet est effacé de la mémoire
		System.out.println(" ... un objet B se meurt ... ");
	}
}

class C {
	public void JeTravaillePourC() {
		System.out.println("Je suis une instance de C au service de toutes les classes");
	}
	
	protected void finalize() {	// Appel de cette méthode quand l'objet est effacé de la mémoire
		System.out.println(" ... un objet C se meurt ... ");
	}
}

public class Main {

	public static void main(String[] args) {
		C[] c = new C[1000000] ;
		for (int i=0; i<1000000; i++) {
			c[i] = new C() ;
			A a = new A(c[i]) ;		// On passe le référent de l'objet C à l'objet A
			a.JeTravaillePourA();
			a = null ;				// On cherche à se débarasser de l'objet A (instruction pas nécessaire)
		}
	}
}
