public class Principale
{
    public static void main(String[] args)
    {
        FeuDeSignalisation unFeu = new FeuDeSignalisation(1,3);
        FeuDeSignalisation unAutreFeu = new FeuDeSignalisation(1, 5);

        unFeu.changeCouleur(3);
        unFeu.changePosition(5);
        unFeu.setHauteur(8.9) ;

        /* Appel de la méthode statique à partir de l'objet */
        FeuDeSignalisation.getHauteur();

        /* Appel de la méthode statique */
        unAutreFeu.setHauteur(10.6);

        /* Tous les feux voient leur hauteur modifiée */
        unFeu.getHauteur();
        unAutreFeu.getHauteur();

        /* appel de la méthode statique à partir de l’objet */
        System.out.println("********** CLIGNOTEMENT **********");

        unFeu.clignote();
        /* première manière de clignoter */

        unFeu.clignote(3);
        /* deuxième manière */

        int b = unFeu.clignote(2,3);
        /* C'est possible au vu du return.*/
    }
}