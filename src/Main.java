import java.util.*;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String args[]){
        ArrayList<Integer> numbers=new ArrayList<>();
        for(int i=0;i<1000;i++){
            numbers.add(i);
        }
        ExecutorService pool= Executors.newFixedThreadPool(4);
        Threads th= new Threads(numbers);
        Thread ths=new Thread(th);
        pool.execute(ths);
        ths.interrupt();

    }
}
