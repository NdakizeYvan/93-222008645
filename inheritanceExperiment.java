//this program shows rwanda's fifa world ranking in men football
 
//declaring interface "world"
interface world {
    void show();
}
//declaring class "country" 
class country implements world{
    public void show(){
        System.out.println("Rwanda");
    }
}
// declaring class "ranking" that includes fifa world ranking number which is a child class of "country"
class ranking extends country{
    public void display(){
    int rank =140;
    System.out.println(rank);
}
  }
//declaring class "points" which includes points scored
class points extends ranking{
    public void print(){
    double total = 1087.03;
    System.out.println(total);
}
}
//declaring class"difference" which includes difference between previous and current points
class difference extends points{
    public void write(){
    double diff=0;
    System.out.println(diff);
}
}

public class inheritanceExperiment {
    public static void main(String[] args) {
        ranking R= new ranking(); //object of class ranking
        points P = new points(); //object of class points
        difference D = new difference(); //objects of class difference
        world w =new country(); //

       R.display();// to display its fifa ranking
        w.show();//to display the country name
       P.print();// to display current points
       D.write();//to display the difference
    }
}
