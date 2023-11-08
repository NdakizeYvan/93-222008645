class yearone implements End{
    public void print(){
      int marks=80;
      System.out.println("student passed year 1 with: "+marks+" marks");
    }
} 
 interface End {
     void print(); 
}
class yeartwo extends yearone{
  
    int score=76;
    void result(){
    System.out.println("student passed year 2");
  }
}
class yearthree extends yeartwo {
   int total= 82;
  void showing(){
    System.out.println("student passed year 3");
  }
}

public class interfaceExperiment {
    public static void main(String[] args) {
        yeartwo b = new yeartwo();
        yearthree c = new yearthree();
        End e = new yearone();

        System.out.println(b.score);
        System.out.println(c.total);
        e.print();
    }
    
}
