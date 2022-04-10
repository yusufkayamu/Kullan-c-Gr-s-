import java.util.Scanner;

public class KullanıcıGırıs {

    public static void main(String[] args) {
        String UserName,Password,yenisifre;
        int i;

        Scanner input = new Scanner(System.in);

        System.out.print("Kullanici adinizi giriniz=");
        UserName = input.nextLine();

        System.out.print("Sifre giriniz=");
        Password = input.nextLine();

        if (UserName.equals("yusuf4812") && Password.equals("12345")){
            System.out.println("kullanici girisine izin verildi");
        }else{
            System.out.println("hatali giris!!!!!");
            System.out.println("sifrenizi sifirlamak istiyorsaniz \n1-evet \n2-hayir");
            i =input.nextInt();
            switch(i){
                case 1:
                    System.out.print("yeni sifrenizi giriniz =");
                    yenisifre = input.nextLine();

                    if (yenisifre.equals(Password)){
                        System.out.println("sifre olusturulamadi, lutfen baska sifre giriniz");
                    }else{
                        System.out.println("yeni sifre olusturuldu");
                    }break;
                case 2:
                    System.out.println("iyi günler.");
                    break;


            }



        }
    }
}
