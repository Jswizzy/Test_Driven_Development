package name.jnsmith.tdd;

public class LeapYear {

    public static boolean isLeapYear(final int year) {
        return isDivisibleBy(year, 4) &&
                (!isDivisibleBy(year, 100) || isDivisibleBy(year, 400));
    }

    private static boolean isDivisibleBy(final int year, final int denominator) {
        return year % denominator == 0;
    }
}
