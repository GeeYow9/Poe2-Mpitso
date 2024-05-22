
package poe2.mpitso;

import java.util.regex.Pattern;
import javax.swing.JOptionPane;


public class PoE2Mpitso {

  public PoE2Mpitso (String username, String password, String firstName, String lastName) {
    }

   public String username;
   public String password;
   public String firstName;
   public String lastName; 
   public static String taskDescription;
   public static String taskName;
   public static String developerDetails;
   public static String status;
   public static String taskID;
   
   public static int taskNumber;
   public static int taskDuration;
   public static int taskStatus;
   public static int options;
   public static int count = 0;
   public static int totalTasks;
        
    public static void main(String[] args) {
        
        String firstName = JOptionPane.showInputDialog("Enter first name:");
        String lastName = JOptionPane.showInputDialog("Enter last name:");
        String username ;
        String password ;

       

       do{
        username = JOptionPane.showInputDialog(null, "Enter a valid username");
       }while (!checkUserName(username));{
            JOptionPane.showMessageDialog(null, "Username successfully captured");
        }
       do{
        password = JOptionPane.showInputDialog(null, "Enter a password that has:\n- 8 characters\n- A capital letter\n- A number\n- A special character");
       }while (!checkPasswordComplexity(password));{
        JOptionPane.showMessageDialog(null, "Password succefully captured");
        }
       
        JOptionPane.showMessageDialog(null, "Account successfully created");
        
        String Uname = JOptionPane.showInputDialog("Enter username for login");
        String Pword = JOptionPane.showInputDialog("Enter password for login");
            
        if(Uname.equals(username)&& Pword.equals(password)){
            JOptionPane.showMessageDialog(null, " Welcome " + firstName+", "+ lastName + " it is great to see you again. ");
        }else{
            JOptionPane.showMessageDialog(null, "Username or password incorrect, please try again");  
        do{
           JOptionPane.showInputDialog(null, "Enter correct username");
        }while(!checkUserName(username));{
          JOptionPane.showMessageDialog(null, "Username correct");
        }
        
        }
        
        JOptionPane.showMessageDialog(null, "Welcome to EasyKanban");
        options = Integer.parseInt(JOptionPane.showInputDialog("Please select one of the following features you'd like to do:\n"
                + "Option 1) Add Tasks:\n"
                + "Option 2) Show report:\n"
                + "Option 3) Quit:\n"));
        switch (options)
        {
            case 1:
                taskNumber = Integer.parseInt(JOptionPane.showInputDialog("Please enter the number of tasks no more than 5"));
                for (int i =0 ; i < taskNumber; i++)
                {
                taskName = (JOptionPane.showInputDialog("Please enter the name of the task"));
                taskDescription = (JOptionPane.showInputDialog("Please enter a brief description about the task")); 
                developerDetails = (JOptionPane.showInputDialog("Please enter the first and last name of the developer working on the task"));
                taskDuration =  Integer.parseInt(JOptionPane.showInputDialog("Please enter the duration of the task"));
                
                }
                 case 2 :
                    JOptionPane.showMessageDialog(null, "Coming soon");
                    break ;
            case 3 :
                    JOptionPane.showMessageDialog(null, "Goodbye");
                    break ;
                    
            default:
                    JOptionPane.showMessageDialog(null, "Please restart the program, you can only choose one of the three options given");
                    
                
    }
        

   

   





}
    private static boolean checkUserName(String username) {
        return username != null && username.length() <= 5 && username.contains("_");
    
    }

    private static boolean checkPasswordComplexity(String password) {
        if (password == null || password.length() < 8) {
            return false;
        }
        boolean hasCapital = Pattern.compile("[A-Z]").matcher(password).find();
        boolean hasNumber = Pattern.compile("[0-9]").matcher(password).find();
        boolean hasSpecialChar = Pattern.compile("[_!@#$%^&*()]").matcher(password).find();

        if (!hasCapital) {
            return false;
        }
        if (!hasNumber) {
            return false;
        }
        if (!hasSpecialChar) {
            return false;
        }

        return true;
    }
    }

   
   
      
    
    

