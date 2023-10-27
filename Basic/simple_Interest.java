package Basic;

import java.util.Scanner;

public class simple_Interest {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int P=scn.nextInt();
        int R=scn.nextInt();
        int T=scn.nextInt();
        int si=(P * R * T)/100;
        System.out.println(si);
    }
}
