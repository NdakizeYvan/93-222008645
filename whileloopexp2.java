package whileLoop;

public class whileloopexp2 {
    public static void main(String[] args) {
        int a=1;
        int sum=0;

        while (a<=1000) {
            sum=sum+ a;
            a++;
        }
        System.out.println("the sum of 1000 numbers is:"+ sum);
    }
}
