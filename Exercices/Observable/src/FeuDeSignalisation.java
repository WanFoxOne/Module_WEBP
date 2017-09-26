import java.util.Observable;

class FeuDeSignalisation extends Observable
{
    private int couleur;

    public FeuDeSignalisation(int couleur)
    {
        this.couleur = couleur;
    }

    public void changeCouleur ()
    {
        couleur++;
        if (couleur == 4) couleur = 1;
        if (couleur == 1)
        {
            setChanged();
            notifyObservers("vert");
        }
        else
        {
            if (couleur == 3) {
                setChanged();
                notifyObservers("rouge");
            }
        }
    }
}