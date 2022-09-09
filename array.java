public class array{
    public static void main(String[] args){
        int n=2;
        int[][] array = new int[n][n];
        int zahl=2;
        for(int i=0;i<n;i++){
            for(int y=0;y<n;y++){
                array[i][y]=zahl;
                zahl+=2;
            }
        }
        //Ausgabe
        for(int i=0;i<n;i++){
            System.out.println();
            for(int y=0;y<n;y++){
                System.out.print(array[i][y] + " ");
            }
        }
    }
}
