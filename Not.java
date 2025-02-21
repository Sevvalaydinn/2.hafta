import java.util.Scanner;

public class Not {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] notlar = new int[5];
        int toplam = 0;
        int enYuksek = Integer.MIN_VALUE;
        int enDusuk = Integer.MAX_VALUE;
        boolean dusukNotVar = false;
        
        for (int i = 0; i < 5; i++) {
            System.out.print("Lütfen " + (i + 1) + ". ders notunuzu girin: ");
            notlar[i] = scanner.nextInt();
            toplam += notlar[i];
            
            if (notlar[i] < 30) {
                dusukNotVar = true;
            }
            
            if (notlar[i] > enYuksek) {
                enYuksek = notlar[i];
            }
            
            if (notlar[i] < enDusuk) {
                enDusuk = notlar[i];
            }
        }
        
        double ortalama = toplam / 5.0;
        System.out.println("Ortalamanız: " + ortalama);
        
        if (dusukNotVar) {
            System.out.println("Düşük not aldığınız dersler var!");
        }
        
        if (ortalama >= 50) {
            System.out.println("Tebrikler, geçtiniz!");
        } else {
            System.out.println("Maalesef, kaldınız.");
        }
        
        System.out.println("En yüksek not: " + enYuksek);
        System.out.println("En düşük not: " + enDusuk);
        
        scanner.close();
    }
}