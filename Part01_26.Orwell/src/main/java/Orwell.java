
import java.util.Scanner;
 
public class Orwell {
 
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Give a number:");
        int first = Integer.valueOf(scan.nextLine()); 
        int number = first;
        if (number == 1984) {
            System.out.println("Orwell");
        }
    }
}