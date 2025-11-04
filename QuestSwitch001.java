import java.util.Scanner;

public class QuestSwitch001 {
    public static void main(String[] args) {
        Scanner MeinScan = new Scanner(System.in);

        System.out.print("Masukkan key untuk mengakses:  ");
        String confirm = MeinScan.nextLine();

        if(confirm.toLowerCase().equals("asdos25")) {
            //Keterangan :
            //PBO = Pemrograman Berorientasi Objek
            //RPL = Rekayasa Perangkat Lunak
            Double StrukturData, PBO, BasDat, AlgoritmaPemrograman, RPL;
            Double Rerata;

            System.out.println("Masukkan Data Nilai Matkul");
            System.out.println("1. Struktur Data                    :  ");
            StrukturData = MeinScan.nextDouble();
            System.out.println("2. Pemrograman Berorientasi Objek   :  ");
            PBO = MeinScan.nextDouble();
            System.out.println("3. Basis Data                       :  ");
            BasDat = MeinScan.nextDouble();
            System.out.println("4. Algoritma dan Pemrograman        :  ");
            AlgoritmaPemrograman = MeinScan.nextDouble();
            System.out.println("5. Rekayasa Perangkat Lunak         :  ");
            RPL = MeinScan.nextDouble();

            Rerata = (StrukturData + PBO + BasDat + AlgoritmaPemrograman + RPL) / 5;
            System.out.println("Nilai Rerata Matkul Anda adalah: " + Rerata);
        } else {
            System.out.println("Maaf, Anda tidak memiliki akses");
        }
        MeinScan.close();
    }
}
