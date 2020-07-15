package by.tc.task01.main;

import by.tc.task01.entity.*;

public class PrintApplianceInfo {
	
	public static void print(Appliance appliance) {
		if (appliance == null) {
			System.out.println("Такого прибора не существует!");
		}
		if (appliance instanceof Oven) {
			Oven oven = (Oven) appliance;
			System.out.println("Oven : " + "POWER_CONSUMPTION=" + oven.getPowerConsumption() + ", WEIGHT=" + oven.getWeight()
			                    + ", CAPACITY=" + oven.getCapacity() + ", DEPTH=" + oven.getDepth() + ", " +
                              		  "HEIGHT=" + oven.getHeight() + ", WIDTH=" + oven.getWidth());
		}
		if (appliance instanceof Laptop) {
			Laptop laptop = (Laptop) appliance;
			System.out.println("Laptop : " + "BATTERY CAPACITY=" + laptop.getBatteryCapacity() + ", OS=" + laptop.getOs()
                            		   + ", MEMORY ROM=" + laptop.getMemoryROM() + ", SYSTEM MEMORY=" + laptop.getSystemMemory() +
                             		  ", CPU=" + laptop.getCpu() + ", DISPLAY_INCHS=" + laptop.getDisplayInchs());
		}
		if (appliance instanceof Refrigerator) {
			Refrigerator refrigerator = (Refrigerator) appliance;
			System.out.println("Refrigerator : " + "POWER CONSUMPTION=" + refrigerator.getPowerConsumption() +  ", WEIGHT=" + refrigerator.getWeight() + 
					   ", FREEZER CAPACITY=" + refrigerator.getFreezerCapacity() + ", OVERALL CAPACITY=" + refrigerator.getOverallCapacity() +
                   			   ", HEIGHT=" + refrigerator.getHeight() + ", WIDTH=" + refrigerator.getWidth());
		}
		if (appliance instanceof VacuumCleaner) {
			VacuumCleaner vacuumCleaner = (VacuumCleaner) appliance;
			System.out.println("Vacuum Cleaner : " + "POWER CONSUMPTION=" + vacuumCleaner.getPowerConsumption() + ",FILTER TYPE=" + 
					   vacuumCleaner.getFilterType() + ", BAG TYPE=" + vacuumCleaner.getBagType() + ", WAND TYPE=" + 
					   vacuumCleaner.getWandType() + ", MOTOR SPEED REGULATION" + vacuumCleaner.getMotorSpeedRegulation() + ", CLEANING WIDTH=" + 
					   vacuumCleaner.getCleaningWidth());
		}
		if (appliance instanceof TabletPC) {
			TabletPC tabletPC = (TabletPC) appliance;
			System.out.println("Tablet PC : " + "BATTERY CAPACITY=" + tabletPC.getBatteryCapacity() + ", DISPLAY INCHES=" + tabletPC.getDisplayInches() + 
					   ", MEMORY ROM=" + tabletPC.getMemoryRom() + ", FLASH MEMORY CAPACITY=" + tabletPC.getFlashMemoryCapacity() + ", COLOR=" +
					   tabletPC.getColor());
		}
		if (appliance instanceof Speakers) {
			Speakers speakers = (Speakers) appliance;
			System.out.println("Speakers : " + "POWER_CONSUMPTION=" + speakers.getPowerConsumption() + ", NUMBER OF SPEAKERS=" + speakers.getNumberOfSpeakers() + 
					   ", FREQUENCY RANGE" + speakers.getFrequencyRange() + ", CORD LENGTH=" + speakers.getCordLength());
		}
	}

}
