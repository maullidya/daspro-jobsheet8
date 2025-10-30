import java.util.Scanner;
public class Tugas3_15 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int terjual = 0;
       int jmlPelanggan = 0;
       int itemTerjual = 0;
       System.out.print("Jumlah Cabang : ");
       int cabang = sc.nextInt();
       System.out.println("\n=== Input Penjualan Per Cabang ===");
       for (int i = 1; i <= cabang; i++) {
        System.out.println("\n--- Cabang " +i+ " ---");
        System.out.print("Jumlah Pelanggan : ");
        int pelanggan = sc.nextInt();
        for (int j = 1; j <= pelanggan; j++) {
            System.out.print("Pelanggan " +j+ " memesan berapa item? ");
            int pesanan = sc.nextInt();
            terjual += pesanan;
        }
        System.out.println("Cabang " +i+ " :");
        System.out.println("- Pelanggan: " +pelanggan+ " orang");
        System.out.println("- Item terjual : " +terjual);
        jmlPelanggan += pelanggan; 
        itemTerjual += terjual;
       }
         System.out.println("\nTotal seluruh cabang: \nPelanggan: " +jmlPelanggan+ "orang \nItem terjual : " +itemTerjual+ "item" );
    }
}
