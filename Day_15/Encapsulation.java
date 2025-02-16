class Example{
    private int x;
    public void setX(int x) {
        this.x = x;
    }
    public int  getX(){
        return x;
    }
}
class Encapsulation{
    public static void main(String[] args) {
        Example e = new Example();
        e.setX(10);
        System.out.println(e.getX());
    }
}
