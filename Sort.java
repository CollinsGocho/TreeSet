import java.util.*;
public class Sort {
  private String name;
  private int num;
  TreeSet<String> student=new TreeSet<>();
  Scanner scan=new Scanner(System.in);
    public void getName(){
        try{
       System.out.println("How many students are they: "); 
       num=scan.nextInt();
       scan.nextLine();
       if(num<0){
           throw new InputMismatchException("Students cannot be -ve");
       }
    
       for(int i=0;i<num;i++){
           System.out.println("Student"+(i+1)+" name : ");
           name=scan.nextLine();
           student.add(name);
           
       }
       System.out.println("Student in ascending order: " +student);
    }
    catch(InputMismatchException e){
        System.out.println("Students cannot be -ve");
        scan.nextLine();
        getName();
        
    }
    catch(Exception e){
        System.out.println("An error occurred" +e.getMessage());
    }
    finally{
        System.out.println("Continue with execution");
    }
    
        
    }
  public static void main(String[] args) {
    Sort s=new Sort();
    s.getName();
  }
}
