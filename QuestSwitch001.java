import java.util.Scanner;

public class QuestSwitch001 {
    public static void main(String[] args) {
        Scanner MeinScan = new Scanner(System.in);

        System.out.print("Masukkan key untuk mengakses:  ");
        String confirm = MeinScan.nextLine();

        if(confirm.toLowerCase().equals("asdos25")) {
            //Keterangan :
            //PBO = Pemrograman Berorientasi Objek
            //Basdat = Basis Data
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
            System.out.println("IPK Anda adalah: " + Rerata);
            
            if(Rerata >= 3.75) {
                System.out.println("Predikat Anda = A (Sangat Baik)");
            } else if (Rerata >= 30.5 && Rerata <= 3.74) {
                System.out.println("Predikat Anda = AB (Baik Sekali) ");
            } else if (Rerata >= 3.00 && Rerata <= 3.49) {
                System.out.println("Predikat Anda = B (Baik)");
            } else if (Rerata >= 2.50 && Rerata <= 2.99) {
                System.out.println("Predikat Anda = BC (Cukup)");
            } else if (Rerata < 2.50) {
                System.out.println("Predikat Anda = C (Kurang)");
            }else {
                System.out.println("Mahasiswa belum memenuhi syarat");
            }
            
                if (Rerata >= 3.75 || Rerata >= 30.5 && Rerata <= 3.74) {
    
                }
                else {
                    System.out.println("Mahasiswa belum memenuhi syarat untuk posisi tersebut");
                }
        } else {
            System.out.println("Maaf, Anda tidak memiliki akses");
        }
        MeinScan.close();
    }
}
