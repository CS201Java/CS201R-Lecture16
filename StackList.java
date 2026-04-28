import java.util.ArrayList;

//EXAMPLE 5: Generic Stack  
public class StackList {
    private ArrayList<String> stack = new ArrayList<>();

    public int getSize() {return stack.size();}
    public String peek(){return stack.get(getSize() - 1);}
    public void push (String item){stack.add(item);}
    public String pop (){
        String popItem = stack.get(getSize() - 1);
        stack.remove(getSize() - 1);
        return popItem;
    }    
    public boolean isEmpty(){return stack.size() == 0;}
    @Override
    public String toString(){
        return "Stack: " + stack.toString();
    }
}