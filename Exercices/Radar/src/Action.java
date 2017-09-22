
public class Action
{
    public static void main(String[] args)
    {
        Radar radar = new Radar();
        Voiture voiture = new Voiture(0);

        voiture.addObserver(radar);

        for (int i = 0; i < 100; i++) {
            voiture.addVitesse();
        }
    }
}
