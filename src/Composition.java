//When an Object is composed of other objects...
// These composing objects are specific to the creation of the OWNING object
// And when the OWNING object is destroyed the composing objects have no real life of their own

public class Composition {
    public static void main(String[] args) {
        Phone obj = new Phone("kjkjkj", 12, 999,"HD");
        obj.getMyStatus();
        obj.bat.power=100;
        obj.getMyStatus();
        //obj =null;
        obj.getMyStatus();
    }
}

class OS{
    String name;
    public OS(String name){
        this.name=name;
    }
    
    public String getStatus(){
        if(name.equals("Android")){return "Cool OS";}
        else if(name.equals("iOS")){return "hmmm... tore!";}
        else{return "paha!";}// missing return statement
    }
}

class Version {
    int version;

    public Version(int version) {
        this.version = version;
    }

    public String getStatus() {
        if (version > 10) {
            return "Great!";
        } else if (version < 10) {
            return "Please Update,,,";
        } else {
            return "Special Case!";
        }
    }
}

class Battery{
    int power;

    public Battery(int power){
        this.power = power;
    }

    public String getStatus() {
        if (power > 1000) {
            return "Powerful!";
        } else {
            return "Weak ... ";
        }
    }
}

//make a Screen class a size variant
class ScreenSize{
    String dimensions;

    public ScreenSize(String dimensions) {
        this.dimensions = dimensions;
    }

    public String getStatus(){
        if(dimensions.equals("HD")){
         return  "Nice HD!";
                    }
        else {
            return "not HD";
        }
    }
}






    class Phone {
        Version v;
        OS os;
        Battery bat;
        ScreenSize scr;

        public Phone(String os, int v, int p, String scr){
            this.os= new OS(os);
            this.v = new Version(v);
            this.bat = new Battery(p);
            this.scr = new ScreenSize(scr);
        }

        public void getMyStatus(){
            System.out.println(os.getStatus());
            System.out.println(v.getStatus());
            System.out.println(bat.getStatus());
            System.out.println(scr.getStatus());
        }
    }
