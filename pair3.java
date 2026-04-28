public class pair3 <E extends Number>{
    private E x;
    private E y;

    public pair3(E x,E y){
        this.x = x;
        this.y = y;
    }

    public E getX(){return x;}
    public E getY(){return y;}
    public void setX(E x){this.x = x;}
    public void setY(E y){this.y = y;}
    public double sum(){
        double sum = x.doubleValue() + y.doubleValue();
        return sum;
    }
}
