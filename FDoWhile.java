public class FDoWhile {
    public static void main(String[] args) {
        int x = 0, y = 0, max = 5;

        do {
            do {
                if (y == (max - 1) || x == (max - 1)) {
                    System.out.print("0");
                } else {
                    System.out.print("*");
                }
                y++;
            } while (y < max);
            System.out.println("");
            y = 0;
            x++;
        } while (x < max);
    }
}
