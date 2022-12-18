import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        int a,toplam=0;
        Scanner inp=new Scanner(System.in);

        do{
            System.out.print("Sayi giriniz : ");
            a= inp.nextInt();
            if(a%4==0){
                toplam+=a;
            }
        }while(a%2==0);

        System.out.print("toplam :" + toplam);


    }

}

