public class SwitchExpressionAsExpression {

    public static void main(String[] args) {
        Day day = Day.MONDAY;
        int numLetters = switch (day) {
            case MONDAY, FRIDAY, SUNDAY -> 6;
            case TUESDAY                -> 7;
            case THURSDAY, SATURDAY     -> 8;
            case WEDNESDAY              -> 9;
        };
        System.out.println("numLetters=" + numLetters);
    }
    enum Day {
        MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;
    }
}