package modelEntities;

public class Vehicle {
    private String model;

    public Vehicle(){

    }
    public Vehicle(String  model){
        this.model = model;
    }


    // getter
    public String getModel() {
        return model;
    }
    // setter
    public void setModel(String model) {
        this.model = model;
    }
}
