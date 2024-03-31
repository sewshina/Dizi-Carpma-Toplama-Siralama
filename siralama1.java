package odev;
import java.util.Arrays;
import java.util.Random;

public class siralama1 {
    public static void main(String[] args) {
        Random random = new Random();
        
       int boyut1 = random.nextInt(6);
       int boyut2 = random.nextInt(6);
        
        int[] dizi1 = new int[boyut1];
        for (int i = 0; i < boyut1; i++) {
            dizi1[i] = random.nextInt(100);
        }
        
        int[] dizi2 = new int[boyut2];
        for (int i = 0; i < boyut2; i++) {
            dizi2[i] = random.nextInt(100);
        }
        
        System.out.println("1.Dizinin Boyutu: " + boyut1);
        System.out.println("\n1.Dizinin Elemanları: ");
        for (int i = 0; i < boyut1; i++) {
        System.out.println("Dizinin " + (i+1) + ". Elemanı : " + dizi1[i]);
        }
        
        System.out.println("\n2. Dizinin Boyutu: " + boyut2);
        System.out.println("\n2. Dizinin Elemanları: ");
        for (int i = 0; i < boyut2; i++) {
        System.out.println("Dizinin " + (i+1) + ". Elemanı : " + dizi2[i]);
        }

        int boyut3 = boyut1 + boyut2;
        int[] dizi3 = new int[boyut3];
        
        for (int i = 0; i < boyut1; i++) {
            dizi3[i] = dizi1[i];
        }
        for (int i = 0; i < boyut2; i++) {
            dizi3[boyut1 + i] = dizi2[i];
        }
        
         Arrays.sort(dizi3);
        
       System.out.println("\n2 Dizinin Küçükten Büyüğe Sıralanmış Hali: ");
        for (int i = 0; i < boyut3; i++) {
            System.out.println(dizi3[i]);
        }
       
        int[][] carpim = diziCarpimi(dizi1, dizi2);
        System.out.println("\n2 Dizinin Çarpımı: ");
        diziYaz(carpim);

      
        int[][] toplam = diziToplami(dizi1, dizi2);
        System.out.println("\n2 Dizinin Toplamı: ");
        diziYaz(toplam);
    }

    public static void diziYaz(int[][] dizi) {
        for (int i = 0; i < dizi.length; i++) {
            for (int j = 0; j < dizi[0].length; j++) {
                System.out.println(dizi[i][j] + " ");
            }
            System.out.println();
            }
    }
    
    public static int[][] diziCarpimi(int[] m, int[] n) {
        int[][] carpimsonuc = new int[m.length][n.length];

        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < n.length; j++) {
                carpimsonuc[i][j] = m[i] * n[j];
            }
   }
           return carpimsonuc;
   }

    public static int[][] diziToplami(int[] m, int[] n) {
       
        int boyut1 = m.length;
        int boyut2 = n.length;
        if (boyut1 > boyut2) {
            int[] temp = new int[boyut1];
            Arrays.fill(temp, 1); 
            n = temp;
        } else if (boyut1 < boyut2) {
            int[] temp = new int[boyut2];
            Arrays.fill(temp, 1); 
            m = temp;
        }

        int[][] toplamsonuc = new int[m.length][1];

        for (int i = 0; i < m.length; i++) {
            toplamsonuc[i][0] = m[i] + n[i];
        }

        return toplamsonuc;
        
    }
}
