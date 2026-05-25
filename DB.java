import javax.swing.JOptionPane;
public class DB{
    String input1=JOptionPane.showInputDialog(null,"Enter 1st number");
    Float num1=Float.parseFloat(input1);
  String input2=JOptionPane.showInputDialog(null,"Enter 2nd number");
    Float num2=Float.parseFloat(input2);  
    float sum=num1+num2;
    float difference=num1-num2;
    float product=num1*num2;
    String divisionResult;
    if(num2!=0){
        divisionResult=String.valueOf(num1/num2);
        
    }
    else{
        divisionResult="Undefined(cannot devide by zero)";
        
    }
    String resultMessage=String.format(
        "First number: %.f\n2"+
        "Second number: %.2f\n\n"+
        "Result:\n"+
        "--------------------\n"+
        "Addition(+):%.2f\n"+
        "Substraction(-):%.2f\n"+
        "Multiplication(*):%.2f\n"+
         "Division(/):s",
         num1,num2,sum,difference,product,divisionResult);
         JOptionPane.showMessageDialog(null,resultMessage,"Calculation results",JOptionPane.INFORMATION_MESSAGE);

}