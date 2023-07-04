import java.util.Scanner;

public class KombinasyonHesaplama {
    public static void main(String[] args) {

        int n,r;
        int numerator = 1;
        int denominator = 1;
        Scanner imp = new Scanner(System.in);

        System.out.print("n değerini giriniz : ");
        n = imp.nextInt();
        System.out.print("r değerini giriniz : ");
        r = imp.nextInt();

        for(int i = 1; i <= n; i++){
             numerator *= i;
        }
        for (int i = 1; i <= r; i++){
            denominator *= i;
        }
        for (int i = 1; i <= n - r; i++) {
            denominator *= i;
        }
        int result = numerator / denominator;

        System.out.println("C(" + n + "," + r + ") = " + result);



    }
}
