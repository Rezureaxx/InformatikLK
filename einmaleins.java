public class einmaleins{
    public static void main(String[] args){
        for(int i=1;i<=10;i++){
            System.out.println();
            for(int y=1;y<=10;y++){
                int ergebnis = i*y;
                System.out.println(i + "x" + y + "=" + ergebnis);
            }
        }
    }
}
