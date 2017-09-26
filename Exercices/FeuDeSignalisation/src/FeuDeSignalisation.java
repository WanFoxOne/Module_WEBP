public class FeuDeSignalisation {
    private int couleur;
    private int position;
    private static double hauteur = 12.0;

    public FeuDeSignalisation(int couleurInit, int positionInit)
    {
        couleur = couleurInit;
        position = positionInit;
    }

    public void setHauteur(double nouvelleHauteur)
    {
        hauteur = nouvelleHauteur;
    }

    public void changeCouleur(int nouvelleCouleur)
    {
        couleur = nouvelleCouleur;
        System.out.println("Ma couleur est: " + couleur);
    }

    public void changePosition(int nouvelleCPosition)
    {
        position = nouvelleCPosition;
        System.out.println("Ma position est: " + position);
    }

    public static void getHauteur()
    {
        System.out.println("La hauteur des feux est " + hauteur);
    }

    public void clignote() {
        System.out.println("premiere maniere de clignoter");
        for(int i=0; i<2; i++) {
            for (int j=0; j<2; j++)
                System.out.println("je suis eteint");
            for (int j=0; j<2; j++)
                System.out.println("je suis allume");
        }
    }

    public void clignote(int a) {
        // première surcharge de la méthode
        System.out.println("deuxieme maniere de clignoter");
        for(int i=0; i<2; i++) {
            for (int j=0; j<a; j++)
                System.out.println("je suis eteint");
            for (int j=0; j<a; j++)
                System.out.println("je suis allume");
        }
    }

    public int clignote(int a, int b) {
        /* deuxième surcharge. Le return aussi est changé */
        System.out.println("troisieme maniere de clignoter");
        for(int i=0; i<2; i++) {
            for (int j=0; j<a; j++)
                System.out.println("je suis eteint");
            for (int j=0; j<b; j++)
                System.out.println("je suis allume");
        }
        return b;
    }

}
