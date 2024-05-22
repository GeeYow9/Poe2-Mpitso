
package poe2.mpitso;

import javax.swing.JOptionPane;


public class TaskClass {
     public String taskDescription ;
    public String taskName ;
    public String developerDetails ;
    public String status ;
    public String taskID ;
    public String taskDetails ;
    
    public boolean taskdescription ;
    
    public int taskNumber ;
    public int taskDuration ;
    public int taskStatus ;
    public int total ;
    public int options ;
    public int count = 0 ;
    
    public TaskClass(int taskNumber, int total, int options, String taskDescription, String taskName, String developerDetails, int taskStatus, String status, int count, int taskDuration, String taskID){
        this.taskNumber = taskNumber ;
        this.total = total ;
        this.options = options ;
        this.taskDescription = taskDescription ;
        this.taskName = taskName ;
        this.developerDetails = developerDetails ;
        this.taskStatus = taskStatus ;
        this.status = status ;
        this.count = count ;
        this.taskDuration = taskDuration ;
        this.taskID = taskID ;
        
    }

    TaskClass() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    public boolean checkTaskDescription(){
    //while loop is used to loop if the user has entered too many characters for the task description
        while(taskDescription.length()> 50){
            taskDescription =  JOptionPane.showInputDialog("Enter the task description. May not exceed 50 letters.") ;
        }
        return true ;
        
}
    public String createTaskID(){
        taskID = (taskName.substring(0,2) + ":" + developerDetails.substring(developerDetails.length() - 3)) ;
        taskID = taskID.toUpperCase() ;
        return taskID ;
    }
    
    public String printTaskDetails(){
        if (taskStatus == 1){
            status = ("To Do") ;
        }
        if (taskStatus == 2){
            status = ("Done") ;
        }
        if (taskStatus == 3){
            status = ("Doing") ;
        }
        taskDetails = (status + "," + developerDetails + "," + count + "," +taskName + "," + taskDescription + "," + taskID + "," + taskDuration) ;
        return taskDetails ;
    }
    
    public int returnTotalHours(){
        int total1 = 0 ;
        if(count == 0){
            total1 = taskDuration ;
        }
        else if(count >= 1){
            total = total1 + taskDuration ;
        }
        return total ;
    }
    
    
}
