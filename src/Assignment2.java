import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Assignment2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        List<String> duplicateString=new ArrayList<>();
		
        duplicateString.add("Sudhir");
        duplicateString.add("Nayak");
        duplicateString.add("Sudhir");
        duplicateString.add("Nayak");
        duplicateString.add("Sujir");
        duplicateString.add("Sujir");
		
		System.out.println("****** Duplicate Values **************");
		for(String s:duplicateString){
			System.out.println(s);
		}
		
		Set<String> noduplicate=new HashSet<>(duplicateString);
		
		System.out.println("****** Without Duplicate Values **************");
		for(String s:noduplicate){
			System.out.println(s);
		}

	}

}
