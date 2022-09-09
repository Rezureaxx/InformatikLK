import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class geradezahlen{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print(">>:");
        int n = scanner.nextInt();
        System.out.println();
        for(int i=1;i<=n;i++){
            if(i%2==0){
                System.out.println(i);
            }
        }
    }
}
