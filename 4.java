import java.util.Arrays;


public class urut {

    public static void main(String[] args) {

        String[] text = {"2ibu","1ini","3budi"};
        String out;

        Arrays.sort(text);
        out = "Menampilkan elemen larik integer setelah diurutkan :\n";
        for (int x = 0; x < text.length; x++)
            out += text[x] + " ";
        System.out.print(out);

    }
}
