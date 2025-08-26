package jsp.test.project72;

public class UserProfile {
    
    String username;
    int followers;
    int following;
    
    UserProfile(String n,int s,int g){
        username=n;
        followers=s;
        following=g;
    }
    
    void showdetails(){
        System.out.println("Username: "+username);
        System.out.println("Followers: "+followers);
        System.out.println("Following: "+following);
    }
}
class main{
   public static void main(String args[]){
       UserProfile u1=new UserProfile("RAM",72,172);
       u1.showdetails();
   }
}