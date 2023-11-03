package breakloop;

public class breakexp2 {
    public static void main(String[] args) {
        double score=45;
        do{
            if(score<50){
                System.out.println("fail");
                break;
            }
            else if(score>=50 && score<75 ){
                System.out.println("good");
                break;
            }
            else if(score>=75 && score<=100) {
                System.out.println("excellent");
                break;
            }
            else{
                System.out.println("invalid");
            }
            score++;
        }while(score<=100); 
    }
    
}
