public class Enumz {
    public static void main(String[] args) {

        //================== Need to convert 80inches --->> Meters ???

        System.out.println("==================normal way");
        //we have chosen INCH to be converted to Meters
        String chosenUnitString = "INCH";
        //these are the conversion factors we will multiply by to get value in meters
        double convFromMeter = 1.0;
        double convFromCentiMeter = 0.01;
        double convFromInch = 0.025;
        double convFromFoot = 0.3;


        switch (chosenUnitString) {
            case "FOOT":
                System.out.println("Foot unit is selected.... use " + convFromFoot);
                break;
            case "METER":
                System.out.println("Meter unit is selected.... use " + convFromMeter);
                break;
            case "INCH":
                System.out.println("Inch unit is selected.... use " + convFromInch);
                break;
            case "CENTIMETER":
                System.out.println("Centimeter unit is selected.... use " + convFromCentiMeter);
                break;
        }

        System.out.println("Ans via old way: " + (80 * convFromInch) + " Meters.");
//==================about 20Lines


        System.out.println("\n================== Enum way ");
        LengthUnit chosenUnit = LengthUnit.valueOf(chosenUnitString); //("INCH");
        System.out.println("Ans via Enum " + (chosenUnit.convertToMeters() * 80) + " Meters");

        System.out.println("\n================== Iteration");
        for (LengthUnit tempVar : LengthUnit.values()) {
            System.out.println(tempVar + ": " + tempVar.convertToMeters());
        }

        MoveBy mvEnum = MoveBy.valueOf("DOWN");
        int position = 55;
        int amount = mvEnum.moveByValue();
        position = position + amount;
        System.out.println("the new position is: " + position);


        /*System.out.println("\n================== for complex eg.");

        Cryptzz cryptEnumVariable = Cryptzz.valueOf("Iron");
        String tobeUsed = cryptEnumVariable.getMyCrypt();
        System.out.println(cryptEnumVariable + ": " + tobeUsed);
        System.out.println(">>>>: " + Cryptzz.Iron.getMyCrypt() );
    }*/


    }

    // ENUMS are always thread safe
    enum LengthUnit {
        METER(1),
        CENTIMETER(0.01),
        FOOT(0.3),
        INCH(0.025);

        double value;

        LengthUnit(double value) {
            this.value = value;
            System.out.println("Constructor..." + value);
        }

        double convertToMeters() {
            return value;
        }
    }

    enum MoveBy {
        UP(-1),
        DOWN(1),
        LEFT(-8),
        RIGHT(8);

        int value;

        MoveBy(int value) {
            this.value = value;
        }

        int moveByValue() {
            return value;
        }
    }
}







/*enum Cryptzz {
    Iron("tVxyMEb87CW0ktVxjkdsf"),
    Ozzy("K6s28$vhCAqw4hkjuU$Qxx"),
    Pearl("vhCvfr55Aqw4xynnMEb8o157CW"),
    Audio("cxvWwyoooSkcnzuXgI7R41");

    String value;
    Cryptzz(String value) {
        this.value = value;
    }

    String getMyCrypt() {
        return value;
    }
}*/


