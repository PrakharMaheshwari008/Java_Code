package Imutable_class_creation;

import java.util.HashMap;
import java.util.Map;
//step 1 : Make the class f9nal so that it cannot be inherited
final class Student{
//    step 2: MAking mamber valriable private ensure that field
    private final String name;
    private final int id;
    private final Map<String,String> metadata;

   public Student(String name, int id, Map<String,String>metadata){
       this.name = name;
       this.id = id;
       Map<String ,String> tempMap = new HashMap<>();
       tempMap.putAll(metadata);
       this.metadata = tempMap;
   }
//Step
    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public Map<String, String> getMetadata() {
       Map<String,String> tempMap = new HashMap<>();
       for(Map.Entry<String,String> entry : metadata.entrySet()){
           tempMap.put(entry.getKey(),entry.getValue());
       }
      return tempMap;
    }
}
public class imutable {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<>();
        map.put("1","first");
        map.put("2","Second");
        Student s = new Student("ABC",1,map);
        System.out.println(s.getName());
        System.out.println(s.getId());
        System.out.println(s.getMetadata());
        map.put("3","pecond");
        System.out.println(s.getMetadata());

//        System.out.println(2);

    }

}
