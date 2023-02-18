package warmup;

public class CheckSqrt{

    private int num;

    public CheckSqrt(int num){
        this.num = num;
    }

    public int mySqrt(){

        if(this.num<2){
            return this.num;
        }

        int lower = 2;
        int upper = this.num/2;
        int middle;
        long midSqr;
        while(lower<=upper){
            middle = lower + (upper-lower)/2;
            midSqr = (long) middle*middle;
            if(midSqr<this.num){
                lower = middle+1;
            }else if(midSqr>this.num){
                upper = middle-1;
            }else{
                return middle;
            }
        }
        return upper;
    }
}