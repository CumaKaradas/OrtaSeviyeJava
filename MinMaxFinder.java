import java.util.Scanner;

public class MinMaxFinder {
    public static void main(String[] args) {
        // Kullanıcıdan sayı dizisini almak için Scanner sınıfını kullanıyoruz
        Scanner scanner = new Scanner(System.in);

        // Kullanıcıdan kaç tane sayı gireceğini soruyoruz
        System.out.print("Kaç tane sayı gireceksiniz? ");
        int n = scanner.nextInt();

        // Kullanıcıdan diziyi oluşturmak için bir dizi tanımlıyoruz
        int[] numbers = new int[n];

        // Diziyi kullanıcıdan alıyoruz
        System.out.println("Lütfen " + n + " adet sayı girin:");
        for (int i = 0; i < n; i++) {
            System.out.print((i + 1) + ". sayıyı girin: ");
            numbers[i] = scanner.nextInt();
        }

        // İlk elemanı hem en küçük hem de en büyük olarak atıyoruz
        int min = numbers[0];
        int max = numbers[0];

        // Diziyi tarayıp en küçük ve en büyük değerleri buluyoruz
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }

        // Sonuçları ekrana yazdırıyoruz
        System.out.println("En küçük sayı: " + min);
        System.out.println("En büyük sayı: " + max);

        // Scanner'ı kapatıyoruz
        scanner.close();
    }
}
