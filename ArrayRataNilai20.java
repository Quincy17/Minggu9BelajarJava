import java.util.Scanner;
public class ArrayRataNilai20{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int jumlahMahasiswa;
        System.out.print("Masukkan Jumlah Mahasiswa : ");
        jumlahMahasiswa = input.nextInt();
        int[] nilaiMhs= new int[jumlahMahasiswa];
        double total=0;
        double rata2;
        int lulus=0;

        for(int i=0;i<nilaiMhs.length;i++){
            System.out.print("Masukkan Nilai Mahasiswa Ke " +(i+1)+ " : ");
            nilaiMhs[i]= input.nextInt();
            if(nilaiMhs[i]>70){
                lulus++;
            }
        }
        for(int i=0;i<nilaiMhs.length;i++){
            total+=nilaiMhs[i];
        }
        rata2=total/nilaiMhs.length;
        System.out.println("Rata-Rata Nilai = " +rata2);
        System.out.println("Banyak Mahasiswa Yang Lulus = " +lulus);
    }
}