/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package modul.pkg2;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author giska
 */
class Mahasiswa {
    private String nim;
    private String nama;
    private String alamat;
    private String jurusan;
    private String namaUniversitas;
    
    public Mahasiswa(String nim, String nama, String alamat, String jurusan){
        this.nim=nim;
        this.nama=nama;
        this.alamat=alamat;
        this.jurusan=jurusan;
    }
    
    public String getNim(){
        return nim;
    }
    public String getNama(){
        return nama;
    }
    public String getAlamat(){
        return alamat;
    }
    public String getJurusan(){
        return jurusan;
    }
    public String getNamaUniversitas(){
        return namaUniversitas;
    }
}
class Universitas{
    private static String namaUniversitas;
    
    public static void setnamaUniversitas(String nama){
        namaUniversitas=nama;
    }

    static String getnamaUniversitas() {
        return namaUniversitas;
    }
}
public class main{
    private static ArrayList<Mahasiswa>daftarMahasiswa=new ArrayList<>();
    private static Scanner scanner=new Scanner(System.in);
    
    public static void main(String[] args){
        System.out.println("A. Masukkan Nama Universitas");
        String namaUniversitas=scanner.nextLine();
        Universitas.setnamaUniversitas(namaUniversitas);
        
        char lagi;
        do{
            masukkanDataMahasiswa();
            System.out.println("D. Apakah Anda ingin memasukkan data lagi? (Y/T)");
            lagi=scanner.next().charAt(0);
            scanner.nextLine();
        }while (lagi== 'Y' || lagi== 'y');
        
        tampilkanDaftarMahasiswa();
    }
    private static void masukkanDataMahasiswa(){
        System.out.println("B. Masukkan data mahasiswa: ");
        System.out.print("1. NIM: ");
        String nim=scanner.nextLine();
        System.out.print("2. Nama: ");
        String nama=scanner.nextLine();
        System.out.print("3. Alamat: ");
        String alamat=scanner.nextLine();
        System.out.println("C. Jurusan:");
        System.out.println("1. 41=Teknik Informatika");
        System.out.println("2. 42=Teknik Industri");
        System.out.println("3. 43=Teknik Elektro");
        System.out.println("4. 44=Sistem Informasi");
        System.out.println("5. 48=Teknik Mesin");
        System.out.println("6. 49= Teknik Mekatronika");
        System.out.println("Pilih jurusan (kode): ");
        int kodeJurusan=scanner.nextInt();
        scanner.nextLine();
        String jurusan=getJurusan(kodeJurusan);
        
        Mahasiswa mahasiswa=new Mahasiswa(nim, nama, alamat, jurusan);
        daftarMahasiswa.add(mahasiswa);
    }
    private static String getJurusan(int kodeJurusan){
        switch(kodeJurusan){
            case 41:
                return "TEKNIK INFORMATIKA";
            case 42: 
                return "TEKNIK INDUSTRI";
            case 43:
                return "TEKNIK ELEKTRO";
            case 44:
                return "SISTEM INFORMASI";
            case 48:
                return "TEKNIK MESIN";
            case 49:
                return "TEKNIK MEKATRONIKA";
            default:
                return "Jurusan tidak valid";
        }
    }
    private static void tampilkanDaftarMahasiswa(){
        System.out.println("Daftar Mahasiswa di"+ Universitas.getnamaUniversitas()+":");
        for (Mahasiswa mahasiswa:daftarMahasiswa){
            System.out.println("NIM: " + mahasiswa.getNim());
            System.out.println("Nama: " + mahasiswa.getNama());
            System.out.println("Alamat: " + mahasiswa.getAlamat());
            System.out.println("Jurusan: " + mahasiswa.getJurusan());
            System.out.println();
            System.out.println("Terimakasih");
        }
    }
}
