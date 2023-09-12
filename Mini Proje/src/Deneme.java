
import java.util.Scanner;
public class Deneme {
    public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);
     int a,b;
        System.out.print("Birinci Kenar: ");
        a = scanner.nextInt();
        System.out.print("İkinci Kenar: ");
        b= scanner.nextInt();
        double h = Math.sqrt(a*a+b*b);
        System.out.println("Hipotenüs: "+h);
    }
}
