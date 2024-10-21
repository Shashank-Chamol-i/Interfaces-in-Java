interface Prey{
    void rabbit();
}
interface Predetor{
    void hawk();
}
class Grass implements Prey,Predetor{
    @Override
    public void rabbit(){
        System.out.println("Prey Rabbit prey on Grass : ");
    }
    @Override
    public void hawk(){
        System.out.println("Hawk Predetor pery on Rabbit :");
    }
}
public class Program03 {
    public static void main(String[] args) {
        Grass obj = new Grass();
        obj.rabbit();
        obj.hawk();
    }
}
