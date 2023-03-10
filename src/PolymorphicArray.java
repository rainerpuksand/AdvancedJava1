public class PolymorphicArray {
    public static void main(String[] args) {

        SportsMan obj = new Athlete();
        obj.GoPlay();
        /*System.out.println(((Athlete) obj).x);//if you try to access x
        SportsMan obj2 = new Wrestler();
        obj2.GoPlay();*/
        System.out.println("========================");


        SportsMan[] arrObj = new SportsMan[5];
        arrObj[0] = new Athlete();
        arrObj[1] = new WeightLifter();
        arrObj[2] = new Wrestler();
        arrObj[3] = new Footballer();
        arrObj[4] = new Cricketer();

        for(int i=0; i<5; i++){
            arrObj[i].GoPlay();
        }


        for( SportsMan objTemp : arrObj  ) {
            objTemp.GoPlay();
        }

    }
}

//if this is an abstract class then GoPlay() cant have a body
class SportsMan{
    public void GoPlay(){System.out.println("Playing all sports"); }
}

class Athlete extends SportsMan{
int x=5;
    @Override
    public void GoPlay() {
        System.out.println("I sprint 100m");
    }

    public void abc(){}
}

class WeightLifter extends SportsMan{

    @Override
    public void GoPlay() {
        System.out.println("I lift heavy stuff");
    }
}

class Wrestler extends SportsMan{

    @Override
    public void GoPlay() {
        System.out.println("I love free style grapling");
    }
}

class Footballer extends SportsMan{

    @Override
    public void GoPlay() {
        System.out.println("I kick balls!");
    }
}

class Cricketer extends SportsMan{

    @Override
    public void GoPlay() {
        System.out.println("I bat, bowl & field");
    }
}



