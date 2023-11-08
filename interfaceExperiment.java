/*this program displays marks and whether they passed or not in each year
(year1,2,3) and if they are eligible to graduate*/

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
    System.out.println("student passed year 2 with: "+score+" marks");
  }
}
class yearthree extends yeartwo {
   int total= 82;
  void showing(){
    System.out.println("student passed year 3 with: "+total+" marks");
  }
}
class graduate extends yearthree{
   public void grad(){
     System.out.println("you are eligible to graduade");
   }
}

public class interfaceExperiment {
    public static void main(String[] args) {
        yeartwo b = new yeartwo(); //object of class yeartwo
        yearthree c = new yearthree(); //object of class yearthree
        graduate g = new graduate(); //object of class graduate
        End e = new yearone();

        e.print(); //calling method print from interface end to display value in class yearone
        b.result(); //calling method result in class yeartwo
        c.showing(); //calling method showing in class yearthree
        g.grad(); //calling grad method in class graduate
    }
    
}
