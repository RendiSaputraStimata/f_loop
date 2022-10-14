public class FFor {
    public static void main(String[] args) {
        int max = 5;
        for (int i = 0; i < max; i++) {
            for (int j = 0; j < max; j++) {
                if (j == (max - 1) || i == (max - 1)) {
                    System.out.print("0");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println("");
        }
    }
}
