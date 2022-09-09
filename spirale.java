public class spirale{
    public static void main(String[] args){
        int n = 3;
        int[][] array = new int[n][n];
        int y;
        int x;
        boolean run = true;
        boolean right=true;
        int counter=1;
        y=3/2;
        x=3/2;
        while(x<n-1&& y<n*n-1){
            array[x][y]=1;
            counter++;
            if(right){
                y++;
                array[x][y]=counter;
                right=false;
            }

            if(right==false){
                x++;
                array[x][y]=counter;
                right=true;
            }
        }
        for(int i=0;i<n;i++){
            System.out.println();
            for(int z=0;z<n;z++){
                System.out.print(array[i][z] + " ");
            }
        }
    }
}
