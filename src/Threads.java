import java.util.*;
public class Threads implements Runnable{
    private ArrayList<Integer> even=new ArrayList<>();
    private ArrayList<Integer> odd=new ArrayList<>();
    private ArrayList<Integer> all;
    public Threads(ArrayList<Integer> all){
        this.all=all;
    }
    @Override
    public void run(){

        try{

            for(int i=0;i<all.size();i++){
                if(i%2==0){
                    this.addOdd(i);
                }
                else{
                    this.addEven(i);
                }
                System.out.println(even.size());
                System.out.println(odd.size());
                Thread.sleep(5);
            }
        }
        catch(InterruptedException e){
            System.out.println("Threads are stopped");
        }



    }
    public synchronized void addOdd(int i){
        odd.add(i);
    }
    public synchronized void addEven(int i){
        even.add(i);
    }
    public void getOdd(){
        System.out.println(odd);
    }
    public void getEven(){
        System.out.println(even);
    }

}
