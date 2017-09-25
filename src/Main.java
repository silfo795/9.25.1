import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner imput=new Scanner(System.in);
        int number1,number2,number3,sum;
        System.out.print("請輸入第一個整數:");
        number1=imput.nextInt();
        System.out.print("請輸入第二個整數:");
        number2=imput.nextInt();
        System.out.print("請輸入第三個整數:");
        number3=imput.nextInt();
        sum=number1+number2-number3;
        System.out.printf("%d+%d-%d=%d",number1,number2,number3,sum);
        imput.close();
    }
}
