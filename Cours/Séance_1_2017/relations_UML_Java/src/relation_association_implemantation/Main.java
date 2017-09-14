package relation_association_implemantation;

public class Main {
	
	public static void main(String[] args) { 
		A objetA = new A() ;
		A objetAA = new A();
		B objetB = new B() ;
		objetA.lier_b(objetB) ;
		objetB.lier_a(objetA) ;
		System.out.println("ObjetA " + objetA) ;
		System.out.println("ObjetB " + objetB) ;
		objetB.get_lien_a();
		objetB.lier_a(objetAA) ;
		objetB.get_lien_a();
	}
}