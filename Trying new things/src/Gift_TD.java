public class Gift_TD {
    public static void main(String[] args) {
        int D=1;
        int C;
        double total;
        C = (199*D + 5)%98;
        while (C != 0) {
            D++;
            C = (199*D + 5)%98;
        }
        System.out.println("D="+D);
        C = (199*D + 5)/98;
        total = D+(0.01)*C;
        System.out.println(total);
    }
}
