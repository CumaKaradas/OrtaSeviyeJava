import java.util.Scanner;

public class MatrixMultiplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // İlk matrisin boyutlarını alıyoruz
        System.out.print("Birinci matrisin satır sayısını girin: ");
        int m = scanner.nextInt();
        System.out.print("Birinci matrisin sütun sayısını girin: ");
        int n = scanner.nextInt();

        // İkinci matrisin boyutlarını alıyoruz
        System.out.print("İkinci matrisin satır sayısını girin: ");
        int n2 = scanner.nextInt(); // Bu değer n ile aynı olmalı
        System.out.print("İkinci matrisin sütun sayısını girin: ");
        int p = scanner.nextInt();

        // Matrislerin sütun ve satır uyumunu kontrol et
        if (n != n2) {
            System.out.println("Birinci matrisin sütun sayısı ile ikinci matrisin satır sayısı eşit olmalıdır.");
            return;
        }

        // İlk matrisi oluşturma ve elemanları alma
        int[][] matrix1 = new int[m][n];
        System.out.println("Birinci matrisin elemanlarını girin:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("matrix1[" + i + "][" + j + "]: ");
                matrix1[i][j] = scanner.nextInt();
            }
        }

        // İkinci matrisi oluşturma ve elemanları alma
        int[][] matrix2 = new int[n][p];
        System.out.println("İkinci matrisin elemanlarını girin:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < p; j++) {
                System.out.print("matrix2[" + i + "][" + j + "]: ");
                matrix2[i][j] = scanner.nextInt();
            }
        }

        // Çarpım matrisi
        int[][] resultMatrix = new int[m][p];

        // Matris çarpımını gerçekleştirme
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < p; j++) {
                resultMatrix[i][j] = 0; // Her bir hücreyi sıfırla
                for (int k = 0; k < n; k++) {
                    resultMatrix[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }

        // Sonuç matrisini yazdırma
        System.out.println("Çarpımın sonucu:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < p; j++) {
                System.out.print(resultMatrix[i][j] + " ");
            }
            System.out.println();
        }

        scanner.close();
    }
}
