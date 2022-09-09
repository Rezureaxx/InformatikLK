import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class wortausgabe{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String w = scanner.next();
        int n = scanner.nextInt();
        for(int i=0;i<n;i++){
            System.out.println(w);
        }
    }
}
