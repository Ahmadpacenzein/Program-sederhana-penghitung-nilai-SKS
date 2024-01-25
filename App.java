 import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
//while (true){   
    System.out.println("==================================");
    System.out.println("| NAMA = AHMAD ZAINI a.k.a Pacen |");
    System.out.println("| NIM  = 233510008               |");
    System.out.println("| NAPO = SIKABAL(SIKAD ABAL-ABAL)|");
    System.out.println("==================================");
//Kumpulan deklarasi variabel
    int matkul, nilai_absen,nim;
    double nilai_pr, nilai_uts, nilai_uas, nilai_quis, nilai_absen1, nilai_absen2;
    double nilai_bobot= 0;
    String huruf_bobot = "";
    String keterangan_bobot = "";
    String namaMahasiswa;
    String tumbal;
    double nilai_akhir = 0;
    String nama_matkul = "";
    String nama_matkul1 = "Pengenalan Pemrograman";
    String nama_matkul2 = "Basis Data";
    String nama_matkul3 = "Literasi Data dan Teknologi";
    Scanner input = new Scanner(System.in);
    BufferedReader input1 = new BufferedReader(new InputStreamReader(System.in));
//Judul atau header
    System.out.println("\n");
    System.out.println("----( Program Sederhana Penghitung Hasil Studi Mahasiswa )----");
    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    System.out.println("\n");
// User memilih mata Kuiah
    System.out.print("Pilih Mata Kuliah \n [1]. Pengenalan Pemrograman \n [2]. Basis Data \n [3]. Literasi Data dan Teknologi \n Ketik angka (1/2/3) untuk memilih = ");
    matkul = input.nextInt();


//Input nama mahasiswa, nim
    System.out.println("===================");
    System.out.print("| Nama Mahasiswa = ");
    namaMahasiswa = input1.readLine();
    System.out.println("===================");
    System.out.print("| NIM = ");
    nim = input.nextInt();
     System.out.println("===================");
    //cleaner
    
    System.out.print("Masukan Nilai Tugas Mandiri/PR = ");
    nilai_pr = input.nextDouble();

    System.out.print("Masukan Nilai UTS anda = ");
    nilai_uts = input.nextDouble();

    System.out.print("Masukan Nilai UAS anda = ");
    nilai_uas = input.nextDouble();

    System.out.print("Masukan Nilai Quiz anda = ");
    nilai_quis = input.nextDouble();

    System.out.print("Berapa kali anda tidak masuk kelas (*1/2/3) = ");
    nilai_absen = input.nextInt();
    nilai_absen1 = 16 - nilai_absen;
    nilai_absen2 = nilai_absen1 * 6.25 ;
 //Kehadiran absen maksimal 3x tidak masuk
//Switch case Mata Kuliah
if(nilai_absen > 3){
    System.out.println("Anda harus Mengulang Semester");
    if (matkul ==1) {
        nama_matkul=nama_matkul1;
    }else if (matkul==2) {
        nama_matkul=nama_matkul2;
    }else if (matkul==3) {
        nama_matkul=nama_matkul3;
    }
         }
else if (nilai_absen <= 3) {
    switch (matkul){
        case 1 :
            nama_matkul = nama_matkul1;
            nilai_akhir = (0.35 * nilai_pr) + (0.25 * nilai_uts) + (0.25 * nilai_uas) + (0.1 * nilai_quis) + (0.1 * nilai_absen2);
            
        case 2 : 
           nama_matkul = nama_matkul2;
            nilai_akhir = (0.35 * nilai_pr) + (0.25 * nilai_uts) + (0.25 * nilai_uas) + (0.1 * nilai_quis) + (0.1 * nilai_absen2);
             
        case 3 : 
            nama_matkul = nama_matkul3;
            nilai_akhir = (0.35 * nilai_pr) + (0.25 * nilai_uts) + (0.25 * nilai_uas) + (0.1 * nilai_quis) + (0.1 * nilai_absen2);
             
            }
        }
//decision berdasarkan nilai akhir
System.out.println(nilai_akhir);
if (nilai_akhir < 30){
    nilai_bobot = 0;
    huruf_bobot = "E";
    keterangan_bobot = "Gagal";
} else if (nilai_akhir > 30 && nilai_akhir <= 35) {
    nilai_bobot = 1.0;
    huruf_bobot = "D";
    keterangan_bobot = "Kurang Sekali";
}else if (nilai_akhir > 35 && nilai_akhir <= 40) {
    nilai_bobot = 1.75;
    huruf_bobot = "C-";
   keterangan_bobot = "Kurang";
}else if (nilai_akhir > 40 && nilai_akhir <= 50) {
     nilai_bobot = 2.0;
    huruf_bobot = "C";
    keterangan_bobot = "Cukup";
}else if (nilai_akhir > 50 && nilai_akhir <= 55) {
     nilai_bobot = 2.5;
    huruf_bobot = "C+";
    keterangan_bobot = "Cukup";
}else if (nilai_akhir > 55 && nilai_akhir <= 60) {
    nilai_bobot = 2.75;
    huruf_bobot = "B-";
    keterangan_bobot = "Baik";
}else if (nilai_akhir > 60 && nilai_akhir <= 70) {
    nilai_bobot = 3.0;
    huruf_bobot = "B";
    keterangan_bobot = "Baik";
}else if (nilai_akhir > 70 && nilai_akhir <= 75) {
    nilai_bobot = 3.5;
    huruf_bobot = "B+";
    keterangan_bobot = "Amat Baik";
}else if (nilai_akhir > 75 && nilai_akhir <= 80) {
    nilai_bobot = 3.75;
    huruf_bobot = "A-";
    keterangan_bobot = "Baik Sekali";
}else if (nilai_akhir > 80) {
   nilai_bobot = 4.0;
   huruf_bobot = "A";
   keterangan_bobot = "Sangat Baik Sekali";
}

//Hasil Akhir
System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
System.out.println("|   Hasil Studi Mahasiswa 1 Matkul Selama 1 Semester   |");
System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
System.out.println("|                                                      ");
System.out.println("| Nama Mahasiswa = " + namaMahasiswa + "               ");
System.out.println("| NIM            = " + nim + "                         ");
System.out.println("| Kelas/Semester = 1D (Satu)/Ganjil                    ");
System.out.println("|======================================================|");
System.out.println("| Mata Kuliah = " + nama_matkul + "                    ");
System.out.println("| Nilai Bobot = " + nilai_bobot + "                    ");
System.out.println("| Grade       = " + huruf_bobot + "                    ");
System.out.println("| Keterangan  = " + keterangan_bobot + "               ");
System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~|");


//developed by pacen/zainipacen


    }
}

