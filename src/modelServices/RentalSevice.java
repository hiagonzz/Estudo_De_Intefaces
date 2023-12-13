package modelServices;

import java.time.Duration;

import modelEntities.CarRental;
import modelEntities.Invoice;

public class RentalSevice {
    private double pricePerHour;
    private double pricePerDay;

    private BrazilTaxService taxService;


    public RentalSevice(double pricePerHour, double princePerDay, BrazilTaxService taxService ){
        this.pricePerHour = princePerDay;
        this.pricePerHour = pricePerHour;
        this.taxService = taxService;
    }
    
    

    public void processInvoice(CarRental carRental){

        // double minutes =  Duration.between(carRental.getStart(), carRental.getFinish()).toMinutes();
        // double hours = minutes /  60.0;

        // double basicPayment;

        // if(hours <= 12.0){
        //     basicPayment = pricePerHour * Math.ceil(hours);
        // }
        // else{
        //     basicPayment = pricePerDay * Math.ceil(hours / 24.0);
        // }

        // double tax = taxService.tax(basicPayment);

        carRental.setInvoice(new Invoice(50.0, 10.0));
    }
}
