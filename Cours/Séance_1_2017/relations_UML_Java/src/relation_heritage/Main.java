//Relation d'héritage : B hérite de A
//Héritage et constructeur :
//La sous-classe confie au constructeur de la superclasse
//le soin d'initialiser les attributs qu'elle hérite de celle-ci
//à l'aide de super()

package relation_heritage;

class A {

	protected String unAttributA ;	
	
	public A(String unAttributA) {
		this.unAttributA = unAttributA ;
	}
}

class B extends A {

	private String unAttributB ;
	
	public B(String unAttributA,String unAttributB){
		super(unAttributA) ;
		this.unAttributB = unAttributB ;
	}

	public void AfficheAttribut(){
		System.out.println("mes attributs sont " + this.unAttributA + " et " + this.unAttributB  ) ; // on peut enlever le this
	}
}

public class Main {
	
	public static void main(String[] args) { 
		B objetB = new B("varA","varB") ;
		objetB.AfficheAttribut() ;
	}	
}