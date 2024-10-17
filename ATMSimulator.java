import java.util.Scanner;

public class ATMSimulator {

    public static void main(String[] args) {
        // Ön tanımlı hesap numarası ve PIN
        String accountNumber = "123456";
        String pin = "1234";
        double balance = 1000.00; // Başlangıç bakiyesi

        Scanner scanner = new Scanner(System.in);

        // Kullanıcı giriş işlemi
        System.out.print("Hesap numaranızı girin: ");
        String inputAccountNumber = scanner.nextLine();

        System.out.print("PIN kodunuzu girin: ");
        String inputPin = scanner.nextLine();

        // Giriş doğrulaması
        if (inputAccountNumber.equals(accountNumber) && inputPin.equals(pin)) {
            System.out.println("Giriş başarılı! Hoş geldiniz.");

            boolean exit = false; // Çıkış kontrolü için
            while (!exit) {
                // Ana Menü
                System.out.println("\nATM İşlemleri:");
                System.out.println("1. Bakiye Görüntüleme");
                System.out.println("2. Para Yatırma");
                System.out.println("3. Para Çekme");
                System.out.println("4. Çıkış");
                System.out.print("Lütfen bir işlem seçin: ");
                int choice = scanner.nextInt();

                switch (choice) {
                    case 1:
                        // Bakiye Görüntüleme
                        System.out.println("Mevcut Bakiyeniz: " + balance + " TL");
                        break;
                    case 2:
                        // Para Yatırma
                        System.out.print("Yatırmak istediğiniz tutarı girin: ");
                        double depositAmount = scanner.nextDouble();
                        if (depositAmount > 0) {
                            balance += depositAmount;
                            System.out.println(depositAmount + " TL yatırıldı. Güncel bakiyeniz: " + balance + " TL");
                        } else {
                            System.out.println("Geçersiz tutar.");
                        }
                        break;
                    case 3:
                        // Para Çekme
                        System.out.print("Çekmek istediğiniz tutarı girin: ");
                        double withdrawAmount = scanner.nextDouble();
                        if (withdrawAmount > 0 && withdrawAmount <= balance) {
                            balance -= withdrawAmount;
                            System.out.println(withdrawAmount + " TL çekildi. Güncel bakiyeniz: " + balance + " TL");
                        } else if (withdrawAmount > balance) {
                            System.out.println("Yetersiz bakiye.");
                        } else {
                            System.out.println("Geçersiz tutar.");
                        }
                        break;
                    case 4:
                        // Çıkış
                        System.out.println("Çıkış yapılıyor... İyi günler!");
                        exit = true;
                        break;
                    default:
                        System.out.println("Geçersiz seçenek, lütfen tekrar deneyin.");
                        break;
                }
            }
        } else {
            System.out.println("Hatalı hesap numarası veya PIN!");
        }

        scanner.close();
    }
}
