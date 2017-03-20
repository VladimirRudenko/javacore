package VladimirRudenko.app.classwork.lesson14;

/**
 * Created by vladimir on 27.02.17.
 */
public class Pixel {
    private int x;
    private int y;

    public Pixel(int x, int y){
        this.x=x;
        this.y= y;
    }

    public int[] getCoords(){
        int[] res = {x,y};
        return res;
    }
}
