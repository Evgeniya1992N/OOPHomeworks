package transport;

public abstract class Transport<T extends Driver> implements Competing{

    public enum Type {
        CAR,
        BUS,
        TRUCK
    }
    private final String brand;
    private final String model;
    private double engineVolume;
    private T driver;

    public Transport(String brand,
                     String model,
                     double engineVolume,
                     T driver) {
        if (brand==null || brand.isEmpty()){
            brand = "default";
        }
        this.brand = brand;
        if (model==null || model.isEmpty()){
            model = "default";
        }
        this.model = model;
        setEngineVolume(engineVolume);
        setDriver(driver);
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }
    public double getEngineVolume() {
        return engineVolume;
    }

    public T getDriver() {
        return driver;
    }

    public void setDriver(T driver) {
        this.driver = driver;
    }

    public void setEngineVolume(double engineVolume) {
        if (engineVolume<=0){
            engineVolume = 1.5;
        }
        this.engineVolume = engineVolume;

    }

    public abstract void startMove();
    public abstract void finishMove();
    public String getType(){
        String vehicleType;
        vehicleType = String.valueOf(Type.valueOf("CAR"));
        return vehicleType;
    };

    public abstract void printType();


    @Override
    public String toString() {
        return "Brand: " + brand+", "+
                "Model: " + model+", "+
                "Engine Volume: " + engineVolume;



    }
}
