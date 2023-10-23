import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        System.out.println("ededin cut veya tek olmasini yoxlamaq ucun qiymet daxil edin:");

        Scanner scanner =new Scanner(System.in);
        int number=scanner.nextInt();

        String ev=(number%2==0)? "  Cutdur":"  Tekdir!!!!";
        System.out.println("eded"+ev);



    }
}