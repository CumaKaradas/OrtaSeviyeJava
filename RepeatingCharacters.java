import java.util.HashMap;
import java.util.Scanner;

public class RepeatingCharacters { // Sınıfı public yapıyoruz
    public static void main(String[] args) {
        // Kullanıcıdan string (metin) alma
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir metin girin: ");
        String input = scanner.nextLine();

        // Karakterlerin kaç kez tekrar ettiğini tutmak için HashMap kullanıyoruz
        HashMap<Character, Integer> charCountMap = new HashMap<>();

        // Her karakteri kontrol et
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            // Eğer karakter zaten map'te varsa, sayısını arttır
            if (charCountMap.containsKey(c)) {
                charCountMap.put(c, charCountMap.get(c) + 1);
            } else {
                // Eğer yoksa, sayısını 1 olarak başlat
                charCountMap.put(c, 1);
            }
        }

        // Tekrar eden karakterleri yazdırma
        System.out.println("Tekrar eden karakterler:");
        boolean hasRepeating = false;
        for (char c : charCountMap.keySet()) {
            if (charCountMap.get(c) > 1) {
                System.out.println(c + " - " + charCountMap.get(c) + " kez");
                hasRepeating = true;
            }
        }

        // Eğer tekrar eden karakter yoksa
        if (!hasRepeating) {
            System.out.println("Tekrar eden karakter yok.");
        }

        // Scanner'ı kapat
        scanner.close();
    }
}
