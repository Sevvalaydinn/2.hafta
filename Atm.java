import java.util.Scanner;

public class Atm  {
    private static final String PIN_KODU = "1234";
    private static double bakiye = 2000;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int girisHakki = 3;
        
        while (girisHakki > 0) {
            System.out.print("Lütfen PIN kodunuzu girin: ");
            String pin = scanner.nextLine();
            
            if (pin.equals(PIN_KODU)) {
                System.out.println("Giriş başarılı!\n");
                atmMenu(scanner);
                break;
            } else {
                girisHakki--;
                System.out.println("Hatalı PIN! Kalan giriş hakkı: " + girisHakki + "\n");
            }
        }
        
        if (girisHakki == 0) {
            System.out.println("Kartınız bloke olmuştur. Lütfen banka ile iletişime geçin.");
        }
    }

    private static void atmMenu(Scanner scanner) {
        while (true) {
            System.out.println("\n--- Menü ---");
            System.out.println("1. Bakiye Görüntüleme");
            System.out.println("2. Para Yatırma");
            System.out.println("3. Para Çekme");
            System.out.println("4. Çıkış");
            System.out.print("Lütfen yapmak istediğiniz işlemi seçin: ");
            
            int secim = scanner.nextInt();
            
            switch (secim) {
                case 1:
                    System.out.println("Hesap Bakiyeniz: " + bakiye + " TL\n");
                    break;
                case 2:
                    System.out.print("Yatırmak istediğiniz tutarı girin: ");
                    double yatirilan = scanner.nextDouble();
                    if (yatirilan > 0) {
                        bakiye += yatirilan;
                        System.out.println("Yeni bakiyeniz: " + bakiye + " TL\n");
                    } else {
                        System.out.println("Geçersiz tutar!\n");
                    }
                    break;
                case 3:
                    System.out.print("Çekmek istediğiniz tutarı girin: ");
                    double cekilen = scanner.nextDouble();
                    if (cekilen > 0 && cekilen <= bakiye) {
                        bakiye -= cekilen;
                        System.out.println("Yeni bakiyeniz: " + bakiye + " TL\n");
                    } else {
                        System.out.println("Yetersiz bakiye veya geçersiz tutar!\n");
                    }
                    break;
                case 4:
                    System.out.println("Çıkış yapılıyor. İyi günler dileriz!");
                    return;
                default:
                    System.out.println("Geçersiz seçim! Lütfen tekrar deneyin.\n");
            }
        }
    }
}
