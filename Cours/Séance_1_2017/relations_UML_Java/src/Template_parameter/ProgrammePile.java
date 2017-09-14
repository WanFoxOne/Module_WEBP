// Le programme main montre comment on crée une pile 
// en passant un paramètre de type réel (Integer).
// Cela s'appelle la généricité : T est un paramètre de généricité.
// intéressant quand on utilise une classe avec des types différents

package Template_parameter;

public class ProgrammePile {
	public static void main(String[] a) {
		Pile<Integer> p1 = new PileVector<Integer>();
		p1.empile(7);
		p1.empile(5);
		p1.empile(4);
		System.out.println(p1);
		p1.depile();
		System.out.println(p1);
	}
}