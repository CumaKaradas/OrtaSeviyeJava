import java.io.*;
import java.util.Scanner;

public class FileOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Kullanıcıdan veri alma
        System.out.print("Dosyaya yazılacak metni girin: ");
        String userInput = scanner.nextLine();

        // Veriyi dosyaya yazma
        try {
            FileWriter fileWriter = new FileWriter("kullanici_verisi.txt");
            fileWriter.write(userInput);
            fileWriter.close();
            System.out.println("Veri başarıyla dosyaya yazıldı.");
        } catch (IOException e) {
            System.out.println("Dosyaya yazarken bir hata oluştu.");
            e.printStackTrace();
        }

        // Dosyadan veriyi okuma ve ekrana yazdırma
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader("kullanici_verisi.txt"));
            String line;
            System.out.println("Dosyadan okunan veri:");
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
            bufferedReader.close();
        } catch (IOException e) {
            System.out.println("Dosyadan okurken bir hata oluştu.");
            e.printStackTrace();
        }

        scanner.close();
    }
}
