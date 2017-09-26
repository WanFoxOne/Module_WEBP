import java.util.ArrayList;

public class Trafic
{
    public static void main(String[] args)
    {
        FeuDeSignalisation unFeu = new FeuDeSignalisation(1);
        ArrayList<Voiture> l = new ArrayList<>();

        for (int i=0; i < 3; i++)
        {
            l.add(new Voiture(0));
            unFeu.addObserver(l.get(i));
        }

        for (int i=0; i<4; i++){
            unFeu.changeCouleur();
        }
    }
}