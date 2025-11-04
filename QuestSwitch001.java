import java.util.Scanner;

public class QuestSwitch001 {
    public static void main(String[] args) {
        Scanner MeinScan = new Scanner(System.in);

        System.out.print("Masukkan key untuk mengakses:  ");
        String confirm = MeinScan.nextLine();

        if(confirm.toLowerCase().equals("asdos25")) {
            //Keterangan :
            //StrukturData = Struktur Data
            //PBO = Pemrograman Berorientasi Objek
            //Basdat = Basis Data
            //AlgoritmaPemrograman = Algoritma & Pemrograman
            //RPL = Rekayasa Perangkat Lunak
            Double StrukturData, PBO, BasDat, AlgoritmaPemrograman, RPL;
            Double Rerata, Ipk;

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
            System.out.println("Rerata Nilai Anda adalah: " + Rerata);
            Ipk = (Rerata/20) - 1;
            System.out.println("IPK Anda adalah: " + Ipk);
            
            if(Ipk >= 3.75) {
                System.out.println("Predikat Anda = A (Sangat Baik)");
            } else if (Ipk >= 3.50 && Ipk <= 3.74) {
                System.out.println("Predikat Anda = AB (Baik Sekali) ");
            } else if (Ipk >= 3.00 && Ipk <= 3.49) {
                System.out.println("Predikat Anda = B (Baik)");
            } else if (Ipk >= 2.50 && Ipk <= 2.99) {
                System.out.println("Predikat Anda = BC (Cukup)");
            } else if (Ipk < 2.50){
                System.out.println("Predikat Anda = C (Kurang)");
            } else {
                System.out.println("Perdikat mahasiswa tidak memenuhi syarat");
            }
            
                if (Ipk >= 3.75 || Ipk >= 3.50 && Ipk <= 3.74) {
                    System.out.println("Daftar Matkul yang dapat diajukan untuk posisi asisten:");
                    System.out.println("1. Struktur Data");
                    System.out.println("2. Pemrograman Berorientasi Objek");
                    System.out.println("3. Basis Data ");
                    System.out.println("4. Algoritma dan Pemrograman ");
                    System.out.println("4. Rekayasa Perangkat Lunak  ");
                    System.out.print("Masukkan Pilihan Anda: ");
                    int opsi = MeinScan.nextInt();
                    switch (opsi) {
                        case 1:
                            if (StrukturData >= 75) {
                                System.out.println("Selamat!!! Anda dinyatakan eligible untuk menjadi Asisten Dosen Pada Mata Kuliah Struktur Data");
                            } else {
                                System.out.println("Mahasiswa belum memenuhi syarat untuk posisi tersebut");
                            }
                            break;
                        case 2:
                            if (PBO >= 75) {
                                System.out.println("Selamat!!! Anda dinyatakan eligible untuk menjadi Asisten Dosen Pada Mata Kuliah Pemrograman Berorientasi Objek");
                            } else {
                                System.out.println("Mahasiswa belum memenuhi syarat untuk posisi tersebut");
                            }
                            break;
                        
                        case 3:
                            if (BasDat >= 75) {
                                System.out.println("Selamat!!! Anda dinyatakan eligible untuk menjadi Asisten Dosen Pada Mata Kuliah Basis Data");
                            } else {
                                System.out.println("Mahasiswa belum memenuhi syarat untuk posisi tersebut");
                            }
                            break;
                        
                        case 4:
                            if (AlgoritmaPemrograman >= 75) {
                                System.out.println("Selamat!!! Anda dinyatakan eligible untuk menjadi Asisten Dosen Pada Mata Kuliah Algoritma dan Pemrogramana");
                            } else {
                                System.out.println("Mahasiswa belum memenuhi syarat untuk posisi tersebut");
                            }
                            break;
                        
                        case 5:
                            if (RPL >= 75) {
                                System.out.println("Selamat!!! Anda dinyatakan eligible untuk menjadi Asisten Dosen Pada Mata Kuliah Rekayasa Perangkat Lunak");
                            } else {
                                System.out.println("Mahasiswa belum memenuhi syarat untuk posisi tersebut");
                            }
                            break;

                        default:
                            break;
                    }
                }
                else {
                    System.out.println("Mahasiswa belum memenuhi syarat");
                }
        } else {
            System.out.println("Maaf, Anda tidak memiliki akses");
        }
        MeinScan.close();
    }
}
