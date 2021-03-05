import java.util.ArrayList;

public class Arrayworks1 {
    public static void main(String[] args) {
        ArrayList<Integer> List001 =new ArrayList<>();
        List001.add(9);
        List001.add(5);
        List001.add(3);
        List001.add(1);
        List001.set(2,22);
        for (int i = 0; i < List001.size() ; i++) {
            System.out.println((i+1)+".element"+ List001.get(i));
            
        }
    }
}
