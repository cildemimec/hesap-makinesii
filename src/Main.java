import java.util.Scanner;

public class Main {
    public static void main(String[]args) {
        int n1,n2,select;


        Scanner input = new Scanner(System.in);
        System.out.print("İlk sayıyı giriniz : " );
        n1 = input.nextInt();
        System.out.print("İlk sayıyı giriniz : " );
        n2 = input.nextInt();
        System.out.println("1-Toplama\n 2-Çıkarma\n 3-Çarpma\n 4-Bölme\n " );
        System.out.print("Seçiminiz : " );
        select = input.nextInt();

        if(select == 1){
            System.out.print("Toplam : "+ (n1 + n2) );
        }else if (select == 2){
            System.out.print("Çıkarma : "+ (n1 - n2) );
        }else if(select == 3){
            System.out.print("Çarpma : "+ (n1 * n2) );
        }else if(select == 4){
            if( n2 != 0){
            System.out.print("Bölme : "+ (n1 / n2) );
            }else {
                System.out.println("Sayı sıfıra bölünemez ! " );
            }
        }else{
            System.out.print("Yanlış seçim yaptınız tekrar deneyiniz !" );

        }

    }
}
