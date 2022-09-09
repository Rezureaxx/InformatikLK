import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class quersumme{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int eingabe = scanner.nextInt();
        int speicher=0;
        while(eingabe>0){
            speicher+=eingabe%10;
            eingabe=eingabe/10;
        }
        System.out.println(speicher);
    }
}
