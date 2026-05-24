import java.util.*;
public class Even{
    private int num,div;
    public void compute(){
    do{
        /*div=num%2;
        switch(div){
        case 0:
            System.out.println(num+ " :Even");
            break;
        default:
        }
        */
         if(num%2==0){
             System.out.println( num);
             
         }
         num++; 
    
        
    }
    while(num>=0&&num<=20);
    }
    public static void main(String[] args){
        System.out.println("Even numbers from 0 through 20\n");
        Even e= new Even();
        e.compute();
    }
}