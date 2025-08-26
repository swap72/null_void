
package project72;

public class JobEx {
    boolean Roational_Shift;
    int sal;
    String Location;
    String gender;
    
    JobEx(Boolean rs,int s,String loc){
        Roational_Shift=rs;
        sal=s;
        Location=loc;
    }
    
    JobEx(Boolean rs,int s,String loc,String gen){
        
        Roational_Shift=rs;
        sal=s;
        Location=loc;
        gender=gen;
        
    }
    
    JobEx(Boolean rs,int s){
        Roational_Shift=rs;
        sal=s;
    }
    
}

class Main{
    public static void main(String[] args) {
        JobEx job1=new JobEx(false,500000);
        System.out.println("Rotational Shift = "+job1.Roational_Shift+" "+", Salary = "+job1.sal);
        JobEx job2=new JobEx(false,300000,"WFH","Male");
        System.out.println("Rotational Shift = "+job2.Roational_Shift+" "+", Salary = "+job2.sal+" "+job2.Location+" "+job2.gender);
        JobEx job3=new JobEx(true,700000,"Bengaluru");
        System.out.println("Roational Shift = "+job3.Roational_Shift+" "+", Salary = "+job3.sal+" "+job3.Location);
    }
}