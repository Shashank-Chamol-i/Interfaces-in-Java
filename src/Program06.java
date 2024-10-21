interface Operation{
    default  float op()
    {
        float i = (float) ((5+6)*3)/2;
        return i;
    }
}
class Helper implements Operation{

}
public class Program06 {
    public static void main(String[] args) {
        Helper help = new Helper();
        System.out.println(help.op());
    }
}
