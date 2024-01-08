package transport;

public class DriverD extends Driver{
    public DriverD(String name,
                   boolean hasDrivingLicence,
                   int experienceInYears) {
        super(name, hasDrivingLicence, experienceInYears);
    }
    @Override
    public void startMove() {
        System.out.println("Driver category D "+ getName() + "started Move");
    }

    @Override
    public void finishMove() {
        System.out.println("Driver category D "+ getName() + "finished Move");

    }

    @Override
    public void refill() {
        System.out.println("Driver category D "+ getName() + "gas the car");
    }
}
