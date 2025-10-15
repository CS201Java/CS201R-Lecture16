import java.util.ArrayList;

//EXAMPLE 5: Generic Stack  
public class StackList <E>{
    private ArrayList<E> stack = new ArrayList<>();

    public int getSize() {return stack.size();}
    public E peek(){return stack.get(getSize() - 1);}
    public void push (E item){stack.add(item);}
    public E pop (){
        E popItem = stack.get(getSize() - 1);
        stack.remove(getSize() - 1);
        return popItem;
    }    
    public boolean isEmpty(){return stack.size() == 0;}
    @Override
    public String toString(){
        return "Stack: " + stack.toString();
    }
}