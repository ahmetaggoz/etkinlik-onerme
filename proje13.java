package Giris;
import java.util.Scanner;
public class proje13 {
    public static void main(String[] args) {
        int heat;
        Scanner input = new Scanner(System.in);
        System.out.print("Sıcaklık değeri girin : ");
        heat = input.nextInt();
        
        if (heat < 5){
            System.out.println("Kayağa gidebilirsiniz.");
        } else if (heat >= 5 && heat <= 15) {
            System.out.println("Sinemaya gidebilirsiniz.");
        } else if (heat > 15 && heat < 25) {
            System.out.println("Pikniğe gidebilirsiniz.");
        }else {
            System.out.println("Yüzmeye gidebilirsiniz.");
        }
    }
}
