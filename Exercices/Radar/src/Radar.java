import java.util.Observable;
import java.util.Observer;

public class Radar implements Observer
{

    public void update(Observable o, Object arg)
    {
        if((int)arg > 90)
        {
            System.out.println("FLASH");
        }
    }
}
