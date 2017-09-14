package Template_parameter;

public interface Pile<T> {
	void empile(T t);
	void depile();
	T sommet();
	boolean estVide();
}