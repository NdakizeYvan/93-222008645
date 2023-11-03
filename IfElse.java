public class IfElse {
    public static void main(String[] args) {
        int score=45;
    if(score<50){
        System.out.println("fail");
    }
    else if(score>=50 && score<70){
        System.out.println("good");
    }
     else if(score>=70 && score<=100){
        System.out.println("very good");
     }
     else {
        System.out.println("invalid");
     }
    }
}
