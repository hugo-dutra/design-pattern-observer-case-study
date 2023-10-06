package facades.smarthome;

import facades.smarthome.enums.EnumHouseMode;
import facades.smarthome.implementations.*;
import facades.smarthome.interfaces.IHouseMode;

public class MainFacadeClient {
    public static void main(String[] args) {
        IHouseMode houseMode = new HouseModeManager.HouseModeManagerBuilder()
                .airConditioning(new SamsungAirConditioning())
                .blind(new ClassicBlind())
                .light(new LedLight())
                .systemSound(new DigitalSound())
                .build();
        System.out.println("ModeName: "+EnumHouseMode.PARTY.getMode());
        houseMode.setHouseMode(EnumHouseMode.PARTY);
        System.out.println("--------------------------------------------------");
        System.out.println("ModeName: "+EnumHouseMode.MOVE_THEATER.getMode());
        houseMode.setHouseMode(EnumHouseMode.MOVE_THEATER);
        System.out.println("--------------------------------------------------");
        System.out.println("ModeName: "+EnumHouseMode.SLEEP.getMode());
        houseMode.setHouseMode(EnumHouseMode.SLEEP);
        System.out.println("--------------------------------------------------");
        System.out.println("ModeName: "+EnumHouseMode.WAKE_UP.getMode());
        houseMode.setHouseMode(EnumHouseMode.WAKE_UP);
    }
}
