import java.util.Scanner;

public class CheckBit {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a number");
        int number= scanner.nextInt();
        System.out.println("Enter the index:");
        int index= scanner.nextInt();
        System.out.println(checkBit(number, index));
    }
    public static int checkBit(int number, int index){
        return ((number & (1 << index)) == 0) ? 0 : 1;
    }
}
