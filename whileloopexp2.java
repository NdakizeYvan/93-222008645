package whileLoop;
// this program calculates the sum of first 1000 numbers using while loop
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
