package kodlamaio;

import java.util.ArrayList;
import java.util.List;

public class InstructorManager {
	private List<Instructor> instructors;


    public InstructorManager() {
       instructors = new ArrayList<>();
   }
   public void add(Instructor instructor) {
       instructors.add(instructor);
       System.out.println("Eklendi");
   }
   
   public void delete(Instructor instructor) {
       instructors.add(instructor);
       System.out.println("Silindi");
   }
   
   public void update(Instructor instructor) {
       instructors.add(instructor);
       System.out.println("Güncellendi");
   }
   public List<Instructor> getAll(){

       return instructors ;
   }

}
