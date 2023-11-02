package simple;
 class simpleint {
    public  double calculate(double a,double b,double c){
        return a*b*c;
    }
}

 public class simpleinterest {
    public static void main(String[] args) {
         simpleint si = new simpleint();
       
       double principal = 100000;
       double rate = 0.05;
       double years = 5;

       double answer= si.calculate(rate, years, principal);

       System.out.println("simple interest is: "+answer);
    }

    

}
    

