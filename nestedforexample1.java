package nestedfor;
//this displays "&" in a single triangular form
public class nestedforexample1 {
    public static void main(String[] args) {
     for(int a=1;a<10;a++){
        for(int b=1;b<=a;b++){
            System.out.print("&");
        }
         System.out.println();
     }   
    }
}
