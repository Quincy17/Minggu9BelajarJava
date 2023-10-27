import java.util.Scanner;

public class TugasArray20{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int jumlahElemen;
        System.out.print("Masukkan Banyaknya Elemen : ");
        jumlahElemen = input.nextInt();
        int[] elemen = new int[jumlahElemen];
        double total=0;
        double rata2;
        int highest=0;
        
        //input nilai
        for(int i=0;i<elemen.length;i++){
            System.out.print("Masukkan nilai pada elemen ke " + (i+1) + " : ");
            elemen[i] = input.nextInt();
        }
        int lowest=elemen[0];
        //hitung rata-rata
        for(int i=0;i<elemen.length;i++){
            total+=elemen[i];
        }
        rata2=total/elemen.length;
        //mencari nilai tertinggi
        for(int i=0;i<elemen.length;i++){
            if(elemen[i]>highest){
                highest=elemen[i];
            }
        }
        //mencari nilai terendah
        for(int i=0;i<elemen.length;i++){
            if(elemen[i]<lowest){
                lowest=elemen[i];
            }
        }

        System.out.println("Nilai Tertinggi = " +highest);
        System.out.println("Nilai Terendah = " +lowest);
        System.out.println("Rata-Rata = " +rata2);
    }
}