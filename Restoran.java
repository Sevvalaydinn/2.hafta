import java.util.Scanner;

public class Restoran {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double toplamTutar = 0;
        int secim;
        
        System.out.println("Restorana Hoş Geldiniz!");
        System.out.println("Menü:");
        System.out.println("1 - Pizza (150 TL)");
        System.out.println("2 - Hamburger (140 TL)");
        System.out.println("3 - Salata (130 TL)");
        System.out.println("0 - Siparişi Tamamla");
        
        do {
            System.out.print("Lütfen bir yemek seçin (Çıkış için 0): ");
            secim = scanner.nextInt();
            
            switch (secim) {
                case 1:
                    toplamTutar += 150;
                    System.out.println("Pizza sepete eklendi.");
                    break;
                case 2:
                    toplamTutar += 140;
                    System.out.println("Hamburger sepete eklendi.");
                    break;
                case 3:
                    toplamTutar += 130;
                    System.out.println("Salata sepete eklendi.");
                    break;
                case 0:
                    System.out.println("Sipariş tamamlandı. Toplam tutar: " + toplamTutar + " TL");
                    break;
                default:
                    System.out.println("Geçersiz seçim! Lütfen tekrar deneyin.");
            }
        } while (secim != 0);
        
        System.out.println("Teşekkür ederiz, afiyet olsun!");
        scanner.close();
    }
}

