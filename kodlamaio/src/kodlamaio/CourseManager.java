package kodlamaio;

import java.util.ArrayList;
import java.util.List;

public class CourseManager {
	private List<Course> courses;
 
	 public CourseManager() {
	        courses = new ArrayList<>();
	    }
	    public void add(Course course) {
	        courses.add(course);
	        System.out.println("Eklendi : "+ course.getName());
	    }
	    public void delete(Course course) {
	        courses.add(course);
	        System.out.println("Silindi : "+ course.getName());
	    }
	    public void update(Course course) {
	        courses.add(course);
	        System.out.println("Güncellendi : "+ course.getName());
	    }
	    public List<Course> getAll(){

	        return courses ;
	    }

}
