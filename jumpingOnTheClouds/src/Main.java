public class Main {

    public static void main(String[] args) {
        System.out.println(jumpingOnClouds(new int[] {0, 0, 1, 0, 0, 1, 1, 0}, 2));
    }

    static int jumpingOnClouds(int[] c, int k) {

        int points = 100;

        int index = 0;

        do {
            index = (index + k) % c.length;
            points--;

            if(c[index] == 1) {
                points -= 2;
            }

        } while(index != 0);

        return points;

    }
}
