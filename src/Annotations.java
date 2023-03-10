public class Annotations {
    public static void main(String[] args) {
        System.out.println("===========");
        Cube c = new Cube(2);

        System.out.println(c.getTheVolume());//click Yellow bulb for options

    }
}

class Cube{
    int side;

    public Cube(int side){
        this.side = side;
    }

    /**
     * this is no longer efficient
     * please use {@link #calcVolume()}
     */
    @Deprecated
    public int getTheVolume(){
        int s = side;
        int area = s * s;
        int volume = area * s;
        return volume;
    }

    public int calcVolume(){
        return side*side*side;
    }
}

//First prepare with this... this is class Cube step1
/*class Cube{
    int side;

    public Cube(int side){
        this.side = side;
    }


    public int getTheVolume(){
        int s = side;
        int area = s * s;
        int volume = area * s;
        return volume;
    }
}*/
//==========================================

//    /**
//     * this is no longer efficient
//     * please use {@link #calcVolume()}
//     */
//    @Deprecated
//    public int getTheVolume(){
//        int s = side;
//        int area = s * s;
//        int volume = area * s;
//        return volume;
//    }
//
//    public int calcVolume(){
//        return side*side*side;
//    }