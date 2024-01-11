package transport;

public class DriverB extends Driver{
    public DriverB(String name,
                   boolean hasDrivingLicence,
                   int experienceInYears) {
        super(name, hasDrivingLicence, experienceInYears);
    }

    @Override
    public void startMove() {
        System.out.println("Driver category B "+ getName() + "started Move");
    }

    @Override
    public void finishMove() {
        System.out.println("Driver category B "+ getName() + "finished Move");

    }

    @Override
    public void refill() {
        System.out.println("Driver category B "+ getName() + "gas the car");
    }
}
