import java.util.ArrayList;
import java.util.HashMap;

public class SampleTests {

    private ArrayList<String> flowers = new ArrayList<>();
    private HashMap<Integer,String> classroom = new HashMap<>();

    public void addDetails(String name) {
        flowers.add(name);
    }

    public void printDetails(){
        flowers.forEach(flower -> System.out.println(flower));
    }

    public int addName(int id,String name){
        classroom.put(id,name);
        classroom.forEach((classr,names) -> System.out.println(classroom));
        classroom.forEach((classr,names) -> System.out.println(classroom.get(classr)));


        HashMap<Integer,String> classroom1 = new HashMap<>();
        classroom1.put(id,name);
        classroom1.forEach((classr,names) -> System.out.println(classroom1));
        classroom1.forEach((classr,names) -> System.out.println(classroom1.get(classr)));

        return 0;

    }

    }



