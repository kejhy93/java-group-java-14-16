public class SwitchExpressionLegacyBlocks {

    public static void main(String[] args) {
        Day day = Day.MONDAY;
        boolean divisibleByTwo;
        switch (day) {
            case MONDAY:
            case FRIDAY:
            case SUNDAY:
                int numLetters = 6;
                divisibleByTwo = true;
                break;
            case TUESDAY:
                int numLetters2 = 7;
                divisibleByTwo = false;
                break;
            case THURSDAY:
            case SATURDAY:
                int numLetters3 = 8;
                divisibleByTwo = true;
                break;
            case WEDNESDAY:
                int numLetters4 = 9;
                divisibleByTwo = false;
                break;
            default:
                numLetters = 0;
                divisibleByTwo = false;
                break;
        }
        System.out.println("divisibleByTwo=" + divisibleByTwo);
    }

    enum Day {
        MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;
    }

}