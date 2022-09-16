public class Main
{
    public static void main(String[] args)
    {
        double balance = 5000;

        balance = (balance * 0.17) + balance;

        System.out.println("The balance on the card after one month is " + balance);

        balance = (balance *0.17) + balance;
        System.out.println("The balance on the card after two months is " + balance);
    }
}