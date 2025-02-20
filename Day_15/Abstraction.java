abstract class Vechicle{
    public abstract String  name();
    public abstract String price();
    public abstract String wheels();

}
class Car extends Vechicle{
    @Override
    public String name(){
       return "Verna 5x";
    }
    @Override
    public String price(){
        return "14.5 lacs!";
    }
    @Override
    public String wheels(){
        return "Car has 4 wheels and 1 spare";
    }
}

class Abstraction{
   public static void main(String[] args) {
    Car car = new Car();
   
    System.err.println("Car Name: "+car.name()); 
    System.err.println("Car Price: "+car.price());
    System.err.println("Car Wheels: "+car.wheels());
    
       
   }

}