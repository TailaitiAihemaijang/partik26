import java.util.Scanner;

/**
 * ClassName: Main
 * Package: PACKAGE_NAME
 * Description:
 *
 * @Author Musteqqim
 * @Create 5/12/2023 5:28 PM
 * @Version 1.0
 */
public class Main {
    public static void main(String[] args) {
        String userName,password;
        Scanner input = new Scanner(System.in);
        int blance = 1500;
        int righat = 3;
        int select;
        while (righat > 0){
            System.out.print("Kullanci adi giriniz : ");
            userName = input.nextLine();
            System.out.print("parollu giriniz : ");
            password = input.nextLine();
            if (userName.equals("uygur") && password.equals("abcd123")){
                System.out.println("XXX bakasina hosgeldeniz");

                do {
                    System.out.println("1-para yatirma\n"+"2-para cekme\n"+"3-bakiye sorgulama\n"+"4-cikis yap");
                    System.out.println("lutfen yapmak oldugun islemi seceniz :");
                    select = input.nextInt();
                    if (select==1){
                        System.out.print("para miktari : ");
                        int price = input.nextInt();
                        blance += price;
                    } else if (select==2) {
                        System.out.print("para miktari : ");
                        int price = input.nextInt();
                        if (price > blance){
                            System.out.println("bakiye yetersi ");
                        }else {
                            blance -= price;
                        }
                    } else if (select == 3) {
                        System.out.println("bakiye : "+blance);
                    }
                }while (select!=4 );

                break;
            }else {
                righat--;
                if (righat==0){
                    System.out.println("kartaniz blok olmush");
                }else {
                    System.out.println("kalan hakkiniz : " +  righat);
                }


            }
        }
    }
}
