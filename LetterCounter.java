import java.util.HashMap;
import java.util.Scanner;

public class LetterCounter {
    public static void main(String[] args) {
        // Kullanıcıdan bir cümle alıyoruz
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir cümle girin: ");
        String input = scanner.nextLine().toLowerCase(); // Harfleri küçük harfe çeviriyoruz

        // Harfleri ve sayılarını saklamak için bir HashMap kullanıyoruz
        HashMap<Character, Integer> letterCount = new HashMap<>();

        // Cümlenin her bir karakterini kontrol et
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);

            // Sadece harfleri dikkate al
            if (Character.isLetter(c)) {
                // Eğer harf daha önce sayılmışsa sayısını artır
                if (letterCount.containsKey(c)) {
                    letterCount.put(c, letterCount.get(c) + 1);
                } else {
                    // Harf ilk kez görülüyorsa 1 olarak başlat
                    letterCount.put(c, 1);
                }
            }
        }

        // Sonuçları ekrana yazdırma
        System.out.println("Harflerin sayısı:");
        for (char c : letterCount.keySet()) {
            System.out.println(c + " : " + letterCount.get(c));
        }

        // Scanner'ı kapatma
        scanner.close();
    }
}
