import java.util.Arrays;


public class urut {

    public static void main(String[] args) {

        String[] nilaiInteger = {"2ibu","1ini","3budi"};
        String tampilan;

        Arrays.sort(nilaiInteger);
        tampilan = "\nMenampilkan elemen larik integer setelah diurutkan :\n";
        for (int x = 0; x < nilaiInteger.length; x++)
            tampilan += nilaiInteger[x] + " ";
        System.out.print(tampilan);

    }
}