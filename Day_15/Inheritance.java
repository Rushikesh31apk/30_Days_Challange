class Animal{
    void sound(){
        System.err.println("Animal makes a sound");
    }
}
class  Dog extends Animal{
    void bark(){
        System.err.println("Dog barks");
    }
    @Override
    void sound(){
        
        System.err.println("Its override method Dog barks");
    }
}

class Inheritance{
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.sound();
        dog.bark(); 
    }
}