package transport;

public abstract class Driver {
    private String name;
    private boolean hasDrivingLicence;
    private int experienceInYears;


    public Driver(String name,
                  boolean hasDrivingLicence,
                  int experienceInYears) {
        this.name = name;
        this.hasDrivingLicence = hasDrivingLicence;
        this.experienceInYears = experienceInYears;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isHasDrivingLicence() {
        return hasDrivingLicence;
    }

    public void setHasDrivingLicence(boolean hasDrivingLicence) {
        this.hasDrivingLicence = hasDrivingLicence;
    }

    public int getExperienceInYears() {
        return experienceInYears;
    }

    public void setExperienceInYears(int experienceInYears) {
        this.experienceInYears = experienceInYears;
    }

    public abstract void startMove();
    public abstract void finishMove();
    public abstract void refill();

    @Override
    public int hashCode() {
        return name.hashCode() ;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        Driver other = (Driver) obj;
        return name.equals(other.name) ;
    }
}
