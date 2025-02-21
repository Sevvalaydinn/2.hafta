import java.util.Scanner;

public class Trafik {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int HIZ_SINIRI = 90;
        
        System.out.print("Lütfen aracınızın hızını girin (km/s): ");
        int hiz = scanner.nextInt();
        
        if (hiz > HIZ_SINIRI) {
            int fark = hiz - HIZ_SINIRI;
            
            if (fark <= 20) {
                System.out.println("Hız sınırını aştınız! 1000 TL ceza alındı.");
            } else if (fark <= 40) {
                System.out.println("Hız sınırını çok aştınız! 2000 TL ceza alındı.");
            } else {
                System.out.println("Hız sınırını aşırı aştınız! Ehliyetinize el konuldu!");
            }
        } else {
            System.out.println("Hız sınırı içinde kaldınız, iyi yolculuklar!");
        }
        
        scanner.close();
    }
}
