package relation_association_implemantation;

public class B {

	private A a ;
	
	public void lier_a(A objetA){
		if(objetA !=null && a != objetA){
			this.liberer_a();
			a = objetA ;
			a.lier_b(this);
		}
	}
	public void liberer_a(){
		if (a !=null){
			A objetA = a ;
			a = null ;
			objetA.liberer_b();
		}
	}
	public void get_lien_a(){
		System.out.println("ObjetA " + this.a) ; }
}
