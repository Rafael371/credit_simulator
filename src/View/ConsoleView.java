package View;
import java.util.Scanner;
import Model.Kendaraan;
public class ConsoleView {
    private Scanner scanner;

    public Kendaraan getInputFromUser() {
        System.out.println("Jenis Kendaraan (Motor/Mobil): ");
        String vehicleType = scanner.nextLine();

        System.out.println("Kondisi Kendaraan (Baru/Bekas): ");
        String vehicleCondition = scanner.nextLine();

        System.out.println("Tahun Kendaraan: ");
        int vehicleYear = Integer.parseInt(scanner.nextLine());

        System.out.print("Input Jumlah Pinjaman Total: ");
        double totalLoanAmount = Double.parseDouble(scanner.nextLine());

        System.out.print("Input Tenor Pinjaman (1-6 tahun): ");
        int tenor = Integer.parseInt(scanner.nextLine());

        System.out.print("Input Jumlah DP: ");
        double downPayment = Double.parseDouble(scanner.nextLine());

        return new Kendaraan(vehicleType, vehicleCondition, vehicleYear, totalLoanAmount, tenor, downPayment);
    }
}
