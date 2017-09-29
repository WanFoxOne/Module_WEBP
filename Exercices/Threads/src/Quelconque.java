public class Quelconque implements Runnable
{
    String name;

    Quelconque(String name) {
        this.name = name;
    }

    public synchronized void run()
    {
        for (int i = 0; i < 1000000; i++) {
            if(i % 100000 == 0) {
                System.out.println(name + " " + i);
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
