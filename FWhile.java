public class FWhile {
    public static void main(String[] args) {
        int x = 0, y = 0, max = 5;
        while (x < max) {
            while (y < max) {
                if (y == (max - 1)) {
                    System.out.println("0");
                } else if (x == (max - 1)) {
                    System.out.print("0");
                } else {
                    System.out.print("*");
                }
                y++;
            }
            y = 0;
            x++;
        }
    }
}
