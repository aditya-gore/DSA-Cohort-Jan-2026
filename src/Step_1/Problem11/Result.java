package Step_1.Problem11;

class Result {

    /*
     * Complete the 'kangaroo' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. INTEGER x1
     *  2. INTEGER v1
     *  3. INTEGER x2
     *  4. INTEGER v2
     */

    public static String kangaroo(int x1, int v1, int x2, int v2) {

        // If one starts behind and is not faster, they can never meet
        if (x1 < x2 && v1 <= v2) return "NO";
        if (x1 > x2 && v1 >= v2) return "NO";

        // Same position initially
        if (x1 == x2) return "YES";

        // Check if the meeting point occurs at an integer number of jumps
        if ((x2 - x1) % (v1 - v2) == 0) {
            return "YES";
        }

        return "NO";
    }

}

