package Step_1.Problem8;

class Result {

    public static String timeConversion(String s) {

        String[] parts = s.split(":");
        String hour = parts[0];
        String minute = parts[1];
        String second = parts[2].substring(0, 2); // remove AM/PM
        String period = parts[2].substring(2);    // AM or PM

        int h = Integer.parseInt(hour);

        if (period.equals("AM")) {
            if (h == 12) {
                h = 0;
            }
        } else { // PM
            if (h != 12) {
                h += 12;
            }
        }

        return String.format("%02d:%s:%s", h, minute, second);
    }
}
