public class Main
{
    public static void main(String[] args)
    {
        Runnable quelconque = new Quelconque("Objet 1");
        Runnable quelconque2 = new Quelconque("Objet 2");
        Runnable quelconque3 = new Quelconque("Objet 3");
        Runnable quelconque4 = new Quelconque("Objet 4");

        Thread thread = new Thread(quelconque);
        thread.start();

        Thread thread2 = new Thread(quelconque2);
        thread2.start();

        Thread thread3 = new Thread(quelconque3);
        thread3.start();

        Thread thread4 = new Thread(quelconque4);
        thread4.start();
    }

}
