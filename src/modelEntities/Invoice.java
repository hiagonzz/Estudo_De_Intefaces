package modelEntities;

public class Invoice {
    private double basicPayment;
    private double tax;

    public Invoice() {

    }

    public Invoice(double basicPayment, double tax) {
        this.basicPayment = basicPayment;
        this.tax = tax;

    }
    //getter 
    public double getBasicPayment(){
        return basicPayment;
    }
    public double getTax() {
        return tax;
    }
    //setters
    public void setBasicPayment(double basicPayment) {
        this.basicPayment = basicPayment;
    }
    public void setTax(double tax) {
        this.tax = tax;
    }


    public double getTotalPayment(){
        return getBasicPayment() - getTax();
    }
}
