import java.util.Scanner;

public class Market {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double toplamFiyat = 0;
        boolean kuponKullanildi = false;

        System.out.println("Market Kasasına Hoş Geldiniz!");
        System.out.println("Ürünler:");
        System.out.println("1 - Ekmek (15 TL)");
        System.out.println("2 - Süt (40 TL)");
        System.out.println("3 - Yumurta (90 TL)");
        System.out.println("0 - Alışverişi Tamamla");

        while (true) {
            System.out.print("Lütfen bir ürün seçin (Çıkış için 0): ");
            int secim = scanner.nextInt();

            switch (secim) {
                case 1:
                    toplamFiyat += 15;
                    System.out.println("Ekmek sepete eklendi.");
                    break;
                case 2:
                    toplamFiyat += 40;
                    System.out.println("Süt sepete eklendi.");
                    break;
                case 3:
                    toplamFiyat += 90;
                    System.out.println("Yumurta sepete eklendi.");
                    break;
                case 0:
                    System.out.print("İndirim kuponunuz var mı? (Evet: 1 / Hayır: 0): ");
                    int kupon = scanner.nextInt();
                    if (kupon == 1 && !kuponKullanildi) {
                        toplamFiyat *= 0.9;
                        kuponKullanildi = true;
                        System.out.println("%10 indirim uygulandı.");
                    }
                    System.out.println("Toplam Tutar: " + toplamFiyat + " TL");
                    System.out.println("Teşekkür ederiz, iyi günler!");
                    scanner.close();
                    return;
                default:
                    System.out.println("Geçersiz seçim! Lütfen tekrar deneyin.");
            }
        }
    }
}
