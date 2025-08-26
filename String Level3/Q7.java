import java.util.*;

public class Q7 {
    static String getMonthName(int m) {
        String[] months = {"Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sep","Oct","Nov","Dec"};
        return months[m-1];
    }

    static int getDays(int m, int y) {
        int[] days = {31,28,31,30,31,30,31,31,30,31,30,31};
        if (m==2 && isLeap(y)) return 29;
        return days[m-1];
    }

    static boolean isLeap(int y) {
        if (y%400==0) return true;
        if (y%100==0) return false;
        return y%4==0;
    }

    static int firstDay(int d, int m, int y) {
        int y0 = y - (14-m)/12;
        int x = y0 + y0/4 - y0/100 + y0/400;
        int m0 = m + 12*((14-m)/12) - 2;
        return (d + x + 31*m0/12) % 7;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int y = sc.nextInt();
        System.out.println(getMonthName(m)+" "+y);
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");
        int start = firstDay(1,m,y);
        for (int i=0;i<start;i++) System.out.print("    ");
        int days = getDays(m,y);
        for (int d=1;d<=days;d++) {
            System.out.printf("%3d ",d);
            if ((d+start)%7==0) System.out.println();
        }
    }
}