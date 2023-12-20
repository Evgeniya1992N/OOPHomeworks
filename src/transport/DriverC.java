package transport;

public class DriverC extends Driver{
    public DriverC(String name,
                   boolean hasDrivingLicence,
                   int experienceInYears) {
        super(name, hasDrivingLicence, experienceInYears);
    }

    @Override
    public void startMove() {
        System.out.println("Driver category C "+ getName() + "started Move");
    }

    @Override
    public void finishMove() {
        System.out.println("Driver category C "+ getName() + "finished Move");

    }

    @Override
    public void refill() {
        System.out.println("Driver category C "+ getName() + "gas the car");
    }
}
