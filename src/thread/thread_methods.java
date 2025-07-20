package thread;

public class thread_methods {
    public static void main(String[] args) {
    thread_m m=new thread_m();
    m.start();

        thread_m m1=new thread_m();
        m1.start();

        thread_m m2=new thread_m();
        m2.start();
      
    }
}

class thread_m extends Thread{
    public void run(){
        for (int i=1;i<5;i++){
            System.out.println("count " + i  + " " + getName());
           try{
               Thread.sleep(2000);
           }catch (Exception e){
               System.out.println(e.getMessage());
           }

        }
    }
}

