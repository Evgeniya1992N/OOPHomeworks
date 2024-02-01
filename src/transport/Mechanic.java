package transport;


public class Mechanic {
    private final String name;
    private final String nameCompany;

    public Mechanic(String name, String nameCompany) {
        this.name = name;
        this.nameCompany = nameCompany;
    }


    public String getName() {
        return name;
    }

    public String getNameCompany() {
        return nameCompany;
    }

    public boolean runTechService(boolean techService) {
        techService = runTechService(techService);
        if (techService == true) {
            System.out.println("Провести техобслуживание");
        }
        return techService;
    }

    public boolean runTechRepair(boolean techRepair) {
        techRepair = runTechRepair(techRepair);
        if (techRepair == true) {
            System.out.println("Починить машину");
        }
        return techRepair;
    }


}
