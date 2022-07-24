package kodlamaio;

import java.util.ArrayList;
import java.util.List;

public class CategoryManager {

	private List<Category> categories;


    public CategoryManager() {
        categories = new ArrayList<>();
   }
    
   public void add(Category category) {
       categories.add(category);
       System.out.println("Eklendi");
   }
   public void delete(Category category) {
       categories.add(category);
       System.out.println("Silindi");
   }
   public void update(Category category) {
       categories.add(category);
       System.out.println("Güncellendi");
   }
   
   public List<Category> getAll(){

       return categories ;
   }
}
