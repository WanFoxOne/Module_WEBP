// Le programme main montre comment on cr�e une pile 
// en passant un param�tre de type r�el (Integer).
// Cela s'appelle la g�n�ricit� : T est un param�tre de g�n�ricit�.
// int�ressant quand on utilise une classe avec des types diff�rents

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