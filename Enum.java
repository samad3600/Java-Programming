// Define an enum for the days of the week
public enum Day {
    SUNDAY,
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY
}

public class EnumExample {
    public static void main(String[] args) {
        Day today = Day.WEDNESDAY;

        // Print the value of the enum
        System.out.println("Today is: " + today);

        // Use enum in a switch statement
        switch (today) {
            case MONDAY:
                System.out.println("Start of the work week!");
                break;
            case FRIDAY:
                System.out.println("Almost the weekend!");
                break;
            case SATURDAY:
            case SUNDAY:
                System.out.println("It's the weekend!");
                break;
            default:
                System.out.println("Just another day.");
                break;
        }
    }
}
