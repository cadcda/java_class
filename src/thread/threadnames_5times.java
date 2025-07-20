package thread;

public class threadnames_5times {
    public static void main(String[] args) {
        Thread1 t1=new Thread1();
        t1.setName("RAM");
        t1.start();

        Thread2 t2=new Thread2();
        t2.setName("SEETHA");
        t2.start();

        Thread3 t3=new Thread3();
        t3.setName("LAKSHMAN");
    t3.start();

    }
}

class Thread1 extends Thread{
    public void run(){
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("The name of the Thread1 is " + "  " + getName() );
    }

}


class Thread2 extends Thread{
    public void run(){
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("The name of the Thread2 is " + "  " + getName() );
    }
}



class Thread3 extends Thread{
    public void run(){
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("The name of the Thread3 is " + "  " + getName() );
    }
}