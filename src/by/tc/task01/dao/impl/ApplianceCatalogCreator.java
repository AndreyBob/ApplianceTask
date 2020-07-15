package by.tc.task01.dao.impl;

import by.tc.task01.entity.*;

public class ApplianceCatalogCreator {

    public ApplianceCatalogCreator() {
    }

    public static Appliance createAppliance(String line) {
        String[] parametres = line.split("[:;\\s,=]+");
        Appliance appliance = null;
        switch (parametres[0]) {
            case "Oven":
                appliance = createOven(parametres);
                break;
            case "Laptop":
                appliance = createLaptop(parametres);
                break;
            case "Refrigerator":
                appliance = createRefrigerator(parametres);
                break;
            case "VacuumCleaner":
                appliance = createVacuumCleaner(parametres);
                break;
            case "TabletPC":
                appliance = createTabletPC(parametres);
                break;
            case "Speakers":
                appliance = createSpeakers(parametres);
                break;
        }
        return appliance;
    }

    private static Oven createOven(String[] parametres) {

        Oven oven = new Oven(Integer.valueOf(parametres[2]),Integer.valueOf(parametres[4]),
                            Integer.valueOf(parametres[6]),Integer.valueOf(parametres[8]),
                            Double.valueOf(parametres[10]),Double.valueOf(parametres[12]));
        return oven;
    }

    private static Laptop createLaptop(String[] parametres) {
        Laptop laptop = new Laptop(Double.valueOf(parametres[2]), parametres[4], Integer.valueOf(parametres[6]),
                                    Integer.valueOf(parametres[8]), Double.valueOf(parametres[10]),
                                    Integer.valueOf(parametres[12]));
        return laptop;
    }

    private static Appliance createRefrigerator(String[] parametres) {

        Refrigerator refrigerator = new Refrigerator(Integer.valueOf(parametres[2]),Integer.valueOf(parametres[4]),
                                                     Integer.valueOf(parametres[6]),Double.valueOf(parametres[8]),
                                                     Integer.valueOf(parametres[10]), Integer.valueOf(parametres[12]));

        return refrigerator;
    }

    private static Appliance createVacuumCleaner(String[] parametres) {

        VacuumCleaner vacuumCleaner = new VacuumCleaner(Integer.valueOf(parametres[2]),parametres[4],
                                                         parametres[6],parametres[8], Integer.valueOf(parametres[10]),
                                                         Integer.valueOf(parametres[12]));

        return vacuumCleaner;
    }

    private static Appliance createTabletPC(String[] parametres) {

        TabletPC tabletPC = new TabletPC(Integer.valueOf(parametres[2]),Integer.valueOf(parametres[4]),
                                         Integer.valueOf(parametres[6]),Integer.valueOf(parametres[8]),
                                         parametres[10]);

        return tabletPC;
    }

    private static Appliance createSpeakers(String[] parametres) {

        Speakers speakers = new Speakers(Integer.valueOf(parametres[2]),Integer.valueOf(parametres[4]),
                                         parametres[6], Integer.valueOf(parametres[8]));

        return speakers;
    }
}
