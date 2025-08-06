package thread;


public class Synchronized_method {
    public static void main(String[] args) throws InterruptedException {
counts c=new counts();
c.start();

        counts c1=new counts();
        c1.start();



    }
}

class counts extends Thread{
    int count=0;
    public int cou() {
        for (int i = 0; i < 1000; i++) {
        count++;
        }
        return count;
    }

    public void run(){
        cou();
        System.out.println("the current thread is " + " " + getName() + "  " +count);
    }



}