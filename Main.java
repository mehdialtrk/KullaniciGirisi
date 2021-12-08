import java.util.Scanner;

public class Main {
    public static void main(String []argh) {

    String password, userName,secim,newPassword=null;

    Scanner scan =new Scanner(System.in);
    System.out.print("Lutfen Kullanıcı Adınızı Giriniz: ");
    userName=scan.nextLine();
    System.out.print("Lutfen Sifrenizi Giriniz: ");
    password=scan.nextLine();

    if (userName.equals("Mehdi")&& password.equals("138173")){

        System.out.println("Giriş Başarılı...");

    }
    else if(userName.equals("Mehdi")&& !password.equals("138173")){
        System.out.println("Giris Başarısız...\nGirmiş olduğunuz şifre Hatalidir...");

        System.out.print("\n\nŞifrenizi Sıfırlamak ister misiniz.\n" +
                "Evet için 1'e\n"+
                "Hayir icin 2'ye Basınız:");
        secim=scan.nextLine();

        if (secim.equals("1")){
            System.out.println("Yeni Şifre Oluşturunuz:");
            newPassword=scan.nextLine();
            if (newPassword.equals("138173")){

                System.out.println("Şifreniz Oluşturulamadı. Lütfen Başka bi şifre giriniz:");
                newPassword=scan.nextLine();
                System.out.println("Şifreniz oluşturldu.Yeni Şifreniz:"+newPassword);
            }
            else {
                System.out.println("Yeni Şifreniz: "+newPassword);
            }


        }
        else if(secim.equals("2")){
            System.out.println("Guncel Şifreniz: 138173");
        }
        else
            System.out.println("Geçersiz giriş yaptınız..");

    }
    else if (!userName.equals("Mehdi")&& password.equals("138173")){
        System.out.println("Giris Başarısız...\nGirmiş olduğunuz Kullanıcı Adı Hatalidir...");

    }








    }
}