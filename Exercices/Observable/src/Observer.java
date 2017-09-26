import java.util.Observable;
import java.util.Observer;

class Voiture implements Observer
{
    private int vitesse;

    public Voiture(int vitesse)
    {
        this.vitesse = vitesse;
    }

    public void demarre()
    {
        vitesse = 50;
        System.out.println("je demarre");
    }

    public void update(Observable o, Object arg)
    {
        System.out.println(o + " " + arg);
        if (arg == "vert") {
            demarre();
        }
    }
}