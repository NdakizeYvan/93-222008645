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
// declaring class "ranking" that includes fifa world ranking which is a child class of "country"
class ranking extends country{
    int rank =140;
  }

public class inheritanceExperiment {
    public static void main(String[] args) {
        ranking R= new ranking();
        world w =new country();
       System.out.println(R.rank);// to display its fifa ranking
        w.show();//to display the country name
    }
}
