interface Printable{
    void print();
}
interface Showable extends Printable{
    void show();
}
class Doable implements Showable{
    @Override
    public void print(){
        System.out.println("Printing the Drawing : ");
    }
    @Override
    public void show(){
        System.out.println("Showing the Drawing : ");
    }
}
public class Program04 {
    public static void main(String[] args) {
        Doable obj = new Doable();
        obj.print();
        obj.show();
    }
}
