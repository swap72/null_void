package j11;

public class DynPoly {
    public static void main(String[] args) {
      Animal a1=new Animal();
      a1.animalSound();
      Animal a2=new Dog();
      a2.animalSound();
    }
}

class Animal{
    void animalSound(){
        System.out.println("Generic animal sound");
    }
}
class Dog extends Animal{
    @Override
    void animalSound(){
        System.out.println("Bhaw! Bhaw!");
    }
}