public class Ted {
    public static void main(String[] args) {

        int i = 0;

        while (i <= 20) {
            System.out.println(i);
            i++;
            if (i % 5 == 0) {
                System.out.println('\n');
            } else {
                System.out.print('\t');

            }
        }
    }
}