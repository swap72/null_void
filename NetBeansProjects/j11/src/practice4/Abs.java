package practice4;


interface JPA {
    public void persist();
}


class Hibernate implements JPA {
    @Override
    public void persist() {
        System.out.println("Hibernate's persist method");
    }
}

class ibatis implements JPA {
    @Override
    public void persist() {
        System.out.println("ibatis's persist method");
    }
}


public class Abs {
    public static void main(String[] args) {

        JPA obj1=new Hibernate();
        JPA obj2=new ibatis();
        obj1.persist();
        obj2.persist();
    }
}
