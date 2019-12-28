import java.util.Scanner;

public class hs {
    public static void main(String[] args){
        int x;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Count handshake : ");
        x = scanner.nextInt();
        handshake(x);
    }
    public static void handshake (int jumlah){
        int x=1;
        int y=1;
        int z=1;
        int a,b,w,o;
        for (w=jumlah;w>=1;w--){
            x*=w;
        }
        a=(jumlah-2);
        for (o=a;o>=1;o--){
            y*=o;
        }
        for (b=2;b>=1;b--){
            z*=b;
        }
        System.out.println((x/(y*z)));
    }
}
