interface Bank
{
    int rate_of_intrest();
}
class HDFC implements Bank {
    @Override
    public int rate_of_intrest()
    {
        return 7;
    }
}
class SBI implements Bank{
    @Override
    public int rate_of_intrest(){
        return 8;
    }
}
public class Program02 {
    public static void main(String[] args) {
        Bank hdfc = new HDFC();
        Bank sbi = new SBI();
        System.out.println("HDFC rate of intrest : "+hdfc.rate_of_intrest() + " SBI rate of intrest : "+ sbi.rate_of_intrest());

    }
}
