public class CinemaSeats {
    public static void main(String[] args) {
        int rows = 5, cols = 10;
        int[][] seats = new int[rows][cols]; 

        bookSeats(seats, 3); 
        bookSeats(seats, 3);
        bookSeats(seats, 4); 
    }

    static void bookSeats(int[][] seats, int k) {
        for (int i = 0; i < seats.length; i++) {
            for (int j = 0; j <= seats[i].length - k; j++) {
                boolean found = true;

                // Check k consecutive seats
                for (int x = 0; x < k; x++) {
                    if (seats[i][j + x] == 1) {
                        found = false;
                        break;
                    }
                }

                if (found) {
                    // Mark them as booked
                    for (int x = 0; x < k; x++) {
                        seats[i][j + x] = 1;
                    }
                    System.out.println("Booked " + k + " seats in Row " + (i+1));
                    return;
                }
            }
        }
        System.out.println("Not available for " + k + " seats");
    }
}
