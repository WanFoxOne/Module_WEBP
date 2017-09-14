// Voici une classe impl�mentant l'interface Pile 
// � l'aide d'un vecteur pour stocker les �l�ments.

package Template_parameter;

import java.util.Vector;

public class PileVector<T> implements Pile<T>
{
	Vector<T> v=new Vector<T>();
	public PileVector(){}
	public void empile(T t){
		v.add(t);
	}
	public void depile(){
		v.remove(v.size()-1);
	}
	public T sommet(){
		return v.get(v.size()-1);
	}
	public boolean estVide(){
		return v.isEmpty();
	}
	public String toString(){
		return "Pile "+v.toString();
	}
}