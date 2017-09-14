// Relation d'auto-association : A ---> A ou B ---> B
// Appel de méthodes de la classe par une autre méthode de la même classe

package relation_auto_association;

class A {
	private A a ;

	public A() {
		this.a = this ;
	}
	
	public void FaireQuelqueChose(int nombre){
		System.out.println(this.getClass().getName());
		System.out.println("Nombre : " + nombre);
		a.FaireAutreChose(nombre);
	}
	
	public void FaireAutreChose(int nombre){
		nombre++ ;
		System.out.println("Nombre : " + nombre);
	}
}

// Autre variante plus simple :
// Utilisation de l'instance courante de la classe : this

class B {
	
	public void FaireQuelqueChose(int nombre){
		System.out.println(this.getClass().getName());
		System.out.println("Nombre : " + nombre);
		this.FaireAutreChose(nombre);
	}

	public void FaireAutreChose(int nombre){
		nombre++ ;
		System.out.println("Nombre : " + nombre);
	}
}

public class Main {

	public static void main(String[] args) {
		A objetA = new A();
		objetA.FaireQuelqueChose(1);
		B objetB = new B();
		objetB.FaireQuelqueChose(1);
	}
}
