import java.util.Scanner;

public class AddNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //!Add two numbers
        System.out.println("Enter two number which you want to add");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        System.out.println(num1+ num2);
        //!divide two numbers
        System.out.println(num1/num2);
        //!multiply two numbers
        System.out.println(num1*num2);
        //!remainder of two number
        System.out.println(num1%num2);
    }
    
}
