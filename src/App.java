import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import modelEntities.CarRental;
import modelEntities.Vehicle;
import modelServices.BrazilTaxService;
import modelServices.RentalSevice;

public class App {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        System.out.println("Enter com os dados do aluguel");
        System.out.print("Modelo do carro: ");
        String carModel = sc.nextLine();
        System.out.println("Retirada (dd/MM/yyyy hh:mm) : ");
        LocalDateTime start = LocalDateTime.parse(sc.nextLine(), fmt);

        System.out.println("Retorno (dd/MM/yyyy hh:mm) : ");
        LocalDateTime finish = LocalDateTime.parse(sc.nextLine(), fmt);

        CarRental cr = new CarRental(start, finish, new Vehicle(carModel));

        System.out.print("Entre com o preço por hora: ");
        double pricePerHour = sc.nextDouble();
        System.out.print("Entre com o preço do dia: ");
        double pricePerDay = sc.nextDouble();

        RentalSevice Service = new RentalSevice(pricePerHour, pricePerDay, new BrazilTaxService());

        Service.processInvoice(cr);

        System.out.println("FATURA:");
        System.out.println("Pagamento básico: " + String.format("%2f",cr.getInvoice().getBasicPayment())) ;
        System.out.println("Imposto: " + cr.getInvoice().getTax());
        System.out.println("Pagamento total: " + cr.getInvoice().getTotalPayment());

        sc.close();
    }
}
