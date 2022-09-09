import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class primzahlen{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        boolean run=true;
        int counter=1;
        System.out.println("Test");
        int ausgaben=0;
        while(run){
            int teilercounter=0;
            for(int i=1;i<=counter;i++){
                if(counter%i==0){
                    teilercounter++;
                }
            }
            if(teilercounter==2){
                System.out.println(counter);
                ausgaben++;
                if(ausgaben==n){
                    run=false;
                }
            }
            counter++;
        }
    }
}
