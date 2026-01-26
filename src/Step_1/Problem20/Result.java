package Step_1.Problem20;

public class Result {
    static String catAndMouse(int x, int y, int z) {
        int distA = Math.abs(z-x);
        int distB = Math.abs(z-y);
        if(distA > distB){
            return "Cat B";
        } else if (distB > distA){
            return "Cat A";
        } else {
            return "Mouse C";
        }
    }
}
