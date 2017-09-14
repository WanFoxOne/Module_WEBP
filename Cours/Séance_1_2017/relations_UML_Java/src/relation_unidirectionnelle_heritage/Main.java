//Relation de la classe A vers une sous-classe FilleB qui hérite de B
//Surcharge de la méthode JeTravailleAussiPourA() 
//plutôt que d'utiliser instanceof qui est fortement déconseillé

package relation_unidirectionnelle_heritage;

class A {
	private FilleB filleB ;	
	public A(FilleB filleB) {
		this.filleB = filleB ; }
	public void JeTravaillePourA(){
		this.filleB.JeTravaillePourB() ;
		this.filleB.JeTravaillePourFilleB() ; }
	public void JeTravailleAussiPourA(FilleB b){
			b.JeTravaillePourB() ;
			b.JeTravaillePourFilleB() ; }
	public void JeTravailleAussiPourA(B b){
			b.JeTravaillePourB() ; }
}

class B {
	public B() {}
	public void JeTravaillePourB(){
		System.out.println("Je suis un service rendu par la classe B") ;	 }
}

class FilleB extends B {
	public FilleB(){}
	public void JeTravaillePourFilleB(){
		System.out.println("Je suis un service rendu par la classe FilleB") ; }
}

public class Main {
	public static void main(String[] args) { 
		B objetB = new B() ;
		FilleB filleB = new FilleB() ;
		A objetA = new A(filleB) ;
		objetA.JeTravaillePourA() ;
		objetA.JeTravailleAussiPourA(objetB) ;
		objetA.JeTravailleAussiPourA(filleB) ;	 }
}