package Day10;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
class Student2
{
	public int age;
	 public String name;
	 public Student2(int age, String name) {
		this.age=age;
		this.name=name;
	}
	public String toString() {
		return "Student[age=" +age+ ",name=" +name+ "]";
	}
}
public class Comparator_String {
	public static void main(String[] args) {
		Comparator<Student2> com=new Comparator<Student2>() {
			public int compare(Student2 i, Student2 j) {
				if(i.age>j.age)
					return 1;
				else
					return -1;
			}
		};
        List<Student2> stud= new ArrayList<>();
        stud.add(new Student2(22,"varun"));
        stud.add(new Student2(24,"Sudeep"));
        stud.add(new Student2(23,"Dev"));
        Collections.sort(stud,com);
       
    for(Student2 s:stud) {
   	 System.out.println(s);
    }   
	}
}
