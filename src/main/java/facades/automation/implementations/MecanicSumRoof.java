package facades.automation.implementations;

import facades.automation.interfaces.ISumRoof;

public class MecanicSumRoof implements ISumRoof {
    @Override
    public void openTo(int percent) {
        System.out.println("MecanicSumRoof open to "+percent+"%");
    }

    @Override
    public void closeTo(int percent) {
        System.out.println("MecanicSumRoof close to "+percent+"%");
    }
}
