import java.util.Scanner;
public class app1{
    public static void main(String[]args){
        Scanner Scanner=new Scanner( Systeme.in){
        int nl,nc;
        do{
            Systeme.out.print("donner un entier nl");
            nl=Scanner.nextInt();

        } 
        while(nl<=0||nl>=50);
         do{
            Systeme.out.println("donner un entier nc");
            nc=Scanner.nextInt();

        } 
        while(nc<=0||nc>=50);
        int[][] m=new int[50][50];
        
        Systeme.out.print("remplir le matrice ");
        for (i=0;i<nl;i++){
            for (j=0;j<nc;j++){
                do{
                  Systeme.out.println("m["+i+","+j+"]");
                  m[i][j]=Scanner.nextInt();
            }
            while(m[i][j]%2!=0)
        }


        }
        do {
             Systeme.out.println("donner un entier pair x");
             x=Scanner.nextInt();

        }
        while (x%2!=0);
        i=0;
        j=0;
        while(!valid && i<=nl && j<=nc)

    }}
}