package homeworks.homework11.tests;

public class Convertor {

    private int fuelConsumptionPer100km = 12;

    public float convert(ConvertorTypes type, int convertorValue) {
        float result = 0;
        if (convertorValue < 0){
            throw new IllegalArgumentException("value less then 0 not permitted");
        }

        switch (type){
            case FROM_KILLOGRAMM_TO_GRAMM:
                result = convertorValue * 1000;
                break;
            case FROM_METERS_TO_KILOMETERS:
                result = convertorValue/1000;
                break;
            case FROM_KM_TO_L:
                result = convertorValue * fuelConsumptionPer100km / 100f;
                break;
        }
        return result;
    }

    public enum ConvertorTypes {
        FROM_METERS_TO_KILOMETERS,
        FROM_KILLOGRAMM_TO_GRAMM,
        FROM_KM_TO_L;
    }

}
