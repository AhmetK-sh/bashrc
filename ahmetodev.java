import java.util.Scanner;
import java.util.*;
public class ahmetodev {
    public static void main(String args[]) {
        System.out.print("Sayıları Küçükten Büyüğe Sıralama\n");
        int [] siralanacaklar = new int[5]; for (int i = 0; i < 5; i++) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Sayı Değeri Giriniz: ");
            siralanacaklar[i] = scanner.nextInt();
        }

        for (int sirala = 0; sirala < siralanacaklar.length; sirala++) {
            for (int c = 1; c < siralanacaklar.length ; c++) {
                if (siralanacaklar[c] < siralanacaklar[c - 1]) {
                    int bosdgr = siralanacaklar[c];
                    siralanacaklar[c] = siralanacaklar[c - 1]; siralanacaklar[c - 1] = bosdgr;
                }
            } }
        for (int t = 0; t < siralanacaklar.length; t++) {
            System.out.print(t+1+".Sayı: "+siralanacaklar[t] + "\n");
        }
    }
}