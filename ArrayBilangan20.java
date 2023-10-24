import java.util.Scanner;

public class ArrayBilangan20{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] bil= new int[4];
        for(int i=0;i<=4;i++){
            System.out.print("Masukkan Array indeks " +i + " : ");
            bil[i]= input.nextInt();
        }
        for(int i=0;i<=4;i++){
            System.out.println(bil[i]);
        }
        

    }
}