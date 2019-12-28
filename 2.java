import java.util.Scanner;

public class acak {
    public static void main(String[]args){
        int x;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukan jumlah baris yang akan dicetak : ");
        x = scanner.nextInt();
        acak a = new acak();
        a.print(x);
    }
    public static char huruf(){
        return (char) ('a' + Math.random()*('z'-'a'));
    }
    public static char angka(){
        return (char) ('0' + Math.random()*('9'-'0'));
    }
    public void print(int x){
        for (int i = 0; i< x; i++){
            for (int j = 0; j<14;j++){
                char hrf = huruf();
                char angk = angka();
                System.out.print(hrf);
                System.out.print(angk);
            }
            System.out.println("");
        }
    }
}
