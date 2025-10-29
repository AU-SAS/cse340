import com.MyFrame;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args)  throws Exception{

        MyFrame frame1 = new MyFrame();
        frame1.setName("Anant");
        frame1.run();

        for (int i = 0; i < 100; i++) {
            Thread.sleep(5000);
            System.out.println("Where is my food?");
        }

//        new MyThread("hungry1").start();

    }

    private static void main1() {
        MyFrame frame1 = new MyFrame();
        frame1.setName("Anant");
        frame1.run();

        MyFrame frame2 = new MyFrame();
        frame2.setName("Lavina");
        frame2.run();
    }

    private static class MyThread extends Thread {

        public MyThread(String name) {
            super(name);
        }

        @Override
        public void run() {
            try {
                for (int i = 0; i < 100; i++) {
                    Thread.sleep(5000);
                    System.out.println("Where is my food?");
                }
            } catch (InterruptedException e) {
                return;
            }
        }
    }
}