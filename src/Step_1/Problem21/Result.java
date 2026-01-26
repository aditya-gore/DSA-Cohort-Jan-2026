package Step_1.Problem21;

class Result {

    /*
     * Complete the 'dayOfProgrammer' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts INTEGER year as parameter.
     */

    public static String dayOfProgrammer(int year) {
        // Write your code here
        // Special transition year
        if (year == 1918) {
            return "26.09.1918";
        }
        boolean isLeap;
        // Julian calendar
        if (year < 1918) {
            isLeap = (year % 4 == 0);
        }
        // Gregorian calendar
        else {
            isLeap = (year % 400 == 0) ||
                    (year % 4 == 0 && year % 100 != 0);
        }
        int day = isLeap ? 12 : 13;
        return String.format("%02d.09.%d", day, year);
    }

}
