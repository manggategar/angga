import java.util.Scanner;
public class HargaBayar18 {
    public static void main(String[] args) {

        Scanner input =new Scanner(System.in);
        String merkBuku;
        int harga, jumblah, jumblahHalamanBuku;
        double dis=0.1, total, bayar, jmlDis;
        input.close();

        System.out.println("Masukan merk buku ");
        merkBuku=input.nextLine();
        System.out.println("Masukan jumblah halaman buku ");
        jumblahHalamanBuku=input.nextInt();
        System.out.println("Masukan harga barang yang dibeli ");
        harga=input.nextInt();
        System.out.println("Masukan Jumblah jumblah barang yang dibeli ");
        jumblah=input.nextInt();

        total=harga*jumblah;
        jmlDis=total*dis;
        bayar=total-jmlDis;

        System.out.println("Diskon yang anda dapatkan adalah " + jmlDis);
        System.out.println("Jumlah yang harus dibayar adalah " +bayar);
    }
}
