package breakloop;

public class ex1 {
    public static void main(String[] args) {
        int sum=0;
      
        for(int a=15;a>=0;a--){
          sum=sum+a;
          System.out.println(sum);
           if(a==5){
            break;
           } 
        }
        System.out.println(" total sum after breaking is: "+sum); 
    }
}
