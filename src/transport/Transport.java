package transport;

public abstract class Transport<T extends Driver> implements Competing{

    private final String brand;
    private final String model;
    private double engineVolume;
    private T driver;

    private int gasTankBar;
    private int oilTankBar;

    public Transport(String brand,
                     String model,
                     double engineVolume,
                     T driver,
                     int gasTankBar,
                     int oilTankBar) {
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

    public int getGasTankBar() {
        return gasTankBar;
    }

    public int getOilTankBar() {
        return oilTankBar;
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

    public void setGasTankBar(int gasTankBar) {
        if (gasTankBar<0){
            gasTankBar = 0;
        }
        this.gasTankBar = gasTankBar;
    }

    public void setOilTankBar(int oilTankBar) {
        if (oilTankBar<0){
            oilTankBar = 0;
        }
        this.oilTankBar = oilTankBar;
    }

    public abstract void startMove() throws EmptyGasTankException, NoOilException;
    public abstract void finishMove();
    public abstract Type getType();

    public abstract void printType();

    public void tankWithGas(){
        int gasCurrentLevel;
        gasCurrentLevel = getGasTankBar();
        if (gasCurrentLevel<1){
            gasCurrentLevel = gasCurrentLevel + 5;
        }
    };
    public void tankWithOil(){
        int oilCurrentLevel;
        oilCurrentLevel = getOilTankBar();
        if (oilCurrentLevel<1){
            oilCurrentLevel = oilCurrentLevel + 3;
        }
    };


    @Override
    public String toString() {
        return "Brand: " + brand+", "+
                "Model: " + model+", "+
                "Engine Volume: " + engineVolume;



    }
}
