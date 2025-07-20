package thread;

public class thread_task {
    public static void main(String[] args)  {
    ThreadA t1=new ThreadA();
    t1.start();


    Thread t2=new Thread(new ThreadB());
    t2.start();

    }
}

class ThreadA extends Thread{
    public void run(){
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            System.out.println(e);
        }
        System.out.println("This is from Thread class");
    }

}


class ThreadB implements Runnable{
    public void run(){
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            System.out.println(e);
        }
        System.out.println("This is from Runnable interface");
    }

}