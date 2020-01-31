public class Car {

    private String model;
    private String brand;
    private int horsePower;

    public void setModel(String model){
        this.model = model;
    }
    public void setBrand(String brand){
        this.brand = brand;
    }
    public void setHorsePower(int horsePower){
        this.horsePower = horsePower;
    }

    public String getBrand (String brand){
        return this.brand;
    }
    public String getModel(String model){
        return this.model;
    }
    public int getHorsePower(int horsePower){
        return this.horsePower;
    }
    public String carInfo(String model,String brand, int horsePower){
        return String.format("The car is: %s %s - %d HP.",
                this.brand,this.model,this.horsePower);
    }

    @Override
    public String toString() {
        return String.format("The car is: %s %s - %d HP.",
                this.brand,this.model,this.horsePower);
    }
}
