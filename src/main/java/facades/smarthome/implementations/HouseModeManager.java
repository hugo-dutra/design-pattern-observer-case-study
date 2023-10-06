package facades.smarthome.implementations;

import facades.smarthome.enums.EnumHouseMode;
import facades.smarthome.interfaces.*;

public class HouseModeManager implements IHouseMode {

    private final Iligth light;
    private final IBlind blind;
    private final IAirConditioning airConditioning;
    private final ISystemSound systemSound;

    private HouseModeManager(Iligth light, IBlind blind, IAirConditioning airConditioning, ISystemSound systemSound){
        this.light = light;
        this.blind = blind;
        this.airConditioning = airConditioning;
        this.systemSound = systemSound;
    }

    @Override
    public void setHouseMode(EnumHouseMode mode) {
        switch (mode) {
            case MOVE_THEATER:
                setMoveTheaterMode();
                break;
            case PARTY:
                setPartyMode();
                break;
            case SLEEP:
                setSleepMode();
                break;
            case WAKE_UP:
                setWakeUpMode();
                break;
            default:
                throw new AssertionError(mode.name());
        }
    }

    private void setMoveTheaterMode(){
        light.turnOff();
        blind.close();
        airConditioning.turnOn();
        systemSound.setVolume(5);
        systemSound.turnOn();
    }

    private void setPartyMode(){
        light.turnOn();
        blind.open();
        airConditioning.turnOn();
        systemSound.setVolume(10);
    }

    private void setSleepMode(){
        light.turnOff();
        blind.close();
        airConditioning.turnOff();
        systemSound.setVolume(0);
        systemSound.turnOff();
    }

    private void setWakeUpMode(){
        light.turnOn();
        blind.open();
        airConditioning.turnOn();
        systemSound.setVolume(5);
        systemSound.turnOn();
    }


    public static class HouseModeManagerBuilder {
        private Iligth light;
        private IBlind blind;
        private IAirConditioning airConditioning;
        private ISystemSound systemSound;

        public HouseModeManagerBuilder light(Iligth light) {
            this.light = light;
            return this;
        }

        public HouseModeManagerBuilder blind(IBlind blind) {
            this.blind = blind;
            return this;
        }

        public HouseModeManagerBuilder airConditioning(IAirConditioning airConditioning) {
            this.airConditioning = airConditioning;
            return this;
        }

        public HouseModeManagerBuilder systemSound(ISystemSound systemSound) {
            this.systemSound = systemSound;
            return this;
        }

        public HouseModeManager build() {
            return new HouseModeManager(light, blind, airConditioning, systemSound);
        }
    }
}
