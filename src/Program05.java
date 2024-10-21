/*Static method with Body usage */
interface Square{
    public static int sq()
    {
        int a = 5;
       return a*a;
    }
}
public class Program05 {
    public static void main(String[] args) {
        System.out.println(Square.sq());
    }
}
