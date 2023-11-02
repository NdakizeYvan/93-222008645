package compound;

 class compoundint {
    public double cmp(double x, double y, double z){
        double n = 12;
        return x*Math.pow(1+(y/n),n*z);
    }
}

public class compoundinterest {
    public static void main(String[] args) {
        double p = 500000;
        double r = 0.18;
        double y= 3;
 
        compoundint cmpint = new compoundint();
 
        double interest= cmpint.cmp(p, r, y);
         
        System.out.println(interest);
  
    }
}
