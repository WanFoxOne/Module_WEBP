package relation_association_implemantation;

public class A {

	private B b ;
	
	public void lier_b(B objetB){
		if(objetB !=null && b != objetB){
			this.liberer_b();
			b = objetB ;
			b.lier_a(this);
		}
	}
	public void liberer_b(){
		if (b !=null){
			B objetB = b ;
			b = null ;
			objetB.liberer_a();
		}
	}
	public void get_lien_b(){
		System.out.println("ObjetB " + this.b) ; }
}
