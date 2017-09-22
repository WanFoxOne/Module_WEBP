import java.util.Observable;

public class Voiture extends Observable {
    private int vitesse;

    public Voiture(int vitesse)
    {
        this.vitesse = vitesse;
    }

    public void addVitesse()
    {
        this.vitesse++;

        setChanged();
        notifyObservers(vitesse);

        System.out.println("Vitesse " + vitesse);
    }
}
