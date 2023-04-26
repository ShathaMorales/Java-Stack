import java.util.ArrayList;

class Exceptions {
    public static void main(String[] args){
        ArrayList<Object> myList = new ArrayList<Object>();
        myList.add("13");
        myList.add("hello world");
        myList.add(48);
        myList.add("Goodbye World");
        try {
            for(int i = 0; i < myList.size(); i++) {
            Integer castedValue = (Integer) myList.get(i);
        }
            System.out.println("Code ran successfully!");
        } catch (ClassCastException e){
            System.out.println("Hey, uh, there's an error!");
        } catch (Exception e){
            System.out.println("There's another error!");
        }
}
    
}