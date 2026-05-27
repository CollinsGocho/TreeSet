import java.util.*;
public class Login{
    private String name,password;
    private String choice;
    Scanner sc=new Scanner(System.in);
    public void getCredentials(){
     System.out.println("Enter your Username: ");
     name=sc.nextLine();
     System.out.println("Enter your Password: ");
     password=sc.nextLine();
     if(name.equalsIgnoreCase("Collins")&&password.equals("Ck123")){
       System.out.println("Login succesful");
     }
     else{
           System.out.println("Wrong password or Usename");
           for(int i=3;i>=0;i--){
            System.out.println("You have "+(i-1)+"attempts remaining");
            System.out.println("Do you want to change ur details y/n?");
            choice=sc.nextLine();
            if(choice.equalsIgnoreCase("y")){
                setDetails();
            }
            else if(choice.equalsIgnoreCase("n")){
             getCredentials();   
            }
            else{
                System.out.println("Enter a valid choice y/n?");
                choice=sc.nextLine();
            }
            
            
     }}
     
    }
    public void setDetails(){
        System.out.println("Enter your preferred Username: ");
        name=sc.nextLine();
        this.name=name;
        System.out.println("Enter your new password: ");
        password=sc.nextLine();
        this.password=password;
        System.out.println("Ur new Username is"+name+"and password is"+password+"save them");
    }
  public static void main(String[] args) {
    System.out.println("REALITY COMPANY");
    Login L=new Login();
    L.getCredentials();
      
  }
}
