package thread;

public class odd_even_2Threads {
    public static void main(String[] args) throws InterruptedException {
        ThreadC tc=new ThreadC();
        tc.start();


        Thread t=new Thread(new ThreadD());
        t.start();

    }
}

class ThreadC extends Thread{
    public void run(){
        System.out.println("These are even numbers");
//        try {
//            Thread.sleep(2000);
//        } catch (InterruptedException e) {
//            System.out.println(e);
//        }
        for(int i=0;i<=10;i++){
           int even=i%2;
           if (even==0){
               System.out.println(i);
           }
       }


    }

}


class ThreadD implements Runnable{
    public void run(){
//        try {
//            Thread.sleep(3000);
//        } catch (InterruptedException e) {
//            System.out.println(e);
//        }
        System.out.println("These are odd numbers");
        for(int i=0;i<=10;i++){
            int even=i%2;
            if (even!=0){
                System.out.println(i);
            }
        }
    }

}