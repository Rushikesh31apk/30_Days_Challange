interface Boy{
    public void Behave();
}
class College implements Boy{
    @Override
    public void Behave(){
        System.out.println("In College Its behave like student");
    }
}
class Home implements Boy{
    @Override
    public void Behave(){
        System.out.println("In Home Its behave like Child");
    }
}
class Market implements Boy{
    @Override
    public void Behave(){
        System.out.println("In Market Its behave like Customer");
    }
}
class Polymorphism{
    public static void main(String[] args) {
        College boy = new College();
        boy.Behave();
        Home boy1 = new Home();
        boy1.Behave();
        Market boy2 = new Market();
        boy2.Behave();
    }

}

