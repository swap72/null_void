package jsp.test.project72;

public class DebitCard {
    
    String ownername;
    int cvv;
    int year;
    long cardnum;
    
    DebitCard(String n,int c,int y, long cn){
    ownername=n;
    cvv=c;
    year=y;
    cardnum=cn;
    }
    
    void details(){
        System.out.println(ownername);
        System.out.println(cvv);
        System.out.println(year);
        System.out.println(cardnum);
    }
    
}

class main{
    public static void main(String args[]){
    DebitCard dc= new DebitCard("RAM",848,2027,89788978);

    dc.details();
    
    }
}
