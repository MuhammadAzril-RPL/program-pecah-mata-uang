import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        int Hasil, Tabungan;
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("|=================================================|");
            System.out.println("|            PROGRAM PECAH MATA UANG              |");
            System.out.println("|=================================================|");
            System.out.println("");
            System.out.print("Masukan Nama anda : ");
            String nama = input.nextLine();
            System.out.print("Masukan Kelas Anda : ");
            String kelas = input.nextLine();
            System.out.print("Masukan Tabungan Kalian : ");
            Tabungan = input.nextInt();

            System.out.println("Halo " +nama+ " Kamu menduduki kelas " + kelas + ", Tabungan Kamu adalah " + Tabungan);
        }   

        System.out.println("");

        System.out.println("|=================================================|");
        System.out.println("|                    PECAHAN                      |");
        System.out.println("|=================================================|");

        Tabungan = Tabungan % 100000 ; 
        Hasil = Tabungan/100000 ;
        System.out.println("|        - Pecahan 100000 sebanyak " +Hasil+"              |");
    
        Tabungan = Tabungan % 100000 ; 
        Hasil = Tabungan/50000 ;
        System.out.println("|        - Pecahan 50000  sebanyak " +Hasil+"              |");
    
        Tabungan = Tabungan % 50000 ; 
        Hasil = Tabungan/20000 ;
        System.out.println("|        - Pecahan 20000  sebanyak " +Hasil+"              |");
        
        Tabungan = Tabungan % 20000 ; 
        Hasil = Tabungan/10000 ;
        System.out.println("|        - Pecahan 10000  sebanyak " +Hasil+"              |");
        
        Tabungan = Tabungan % 10000 ;
        Hasil = Tabungan/5000 ; 
        System.out.println("|        - Pecahan 5000   sebanyak " +Hasil+"              |");
 
        Tabungan = Tabungan % 5000 ;
        Hasil = Tabungan/2000 ; 
        System.out.println("|        - Pecahan 2000   sebanyak " +Hasil+"              | ");

        Tabungan = Tabungan % 2000 ;
        Hasil = Tabungan/1000 ; 
        System.out.println("|        - Pecahan 1000   sebanyak " +Hasil+"              |");
        System.out.println("|=================================================|");
    }
}