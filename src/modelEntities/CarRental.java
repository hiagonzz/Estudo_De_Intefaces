package modelEntities;

import java.time.LocalDateTime;

public class CarRental {

    private LocalDateTime start;
    private LocalDateTime finish;

    private Vehicle vehicle;
    private Invoice invoice;

    public CarRental() {

    }

    public CarRental(LocalDateTime start, LocalDateTime finish, Vehicle vehicle) {
        this.start = start;
        this.finish = finish;
        this.vehicle = vehicle;

    }

    // getters
    public LocalDateTime getStart() {
        return start;
    }

    public LocalDateTime getFinish() {
        return finish;
    }

    public Invoice getInvoice() {
        return invoice;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    // setters
    public void setStart(LocalDateTime start) {
        this.start = start;
    }

    public void setFinish(LocalDateTime finish) {
        this.finish = finish;
    }

    public void setInvoice(Invoice invoice) {
        this.invoice = invoice;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

}