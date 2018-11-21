//A program which stores Grades and calculates the average, addition and subtraction.
import java.util.ArrayList;
public class GradeAnalyzer{
public GradeAnalyzer(){
	
}
public int getAverage(ArrayList<Integer> grades){
	if (grades.size() < 1){
		System.out.println("The ArrayList is empty");
		return 0;
	}
else{
	int sum = 0;
	for (int grade : grades){
		sum += grade;
	}
	int average = sum / grades.size();
	System.out.println(average);
	return average;
}
}
public int getHighest(ArrayList<Integer> grades){
	if (grades.size() < 1){
		System.out.println("The ArrayList is empty");
		return 0;
	}
	else{
		int sum = 0;
		for (int grade : grades){
			sum += grade;
		}
		int highest = sum + grades.size();
		System.out.println(highest);
		return highest;
	}
}
public int getLowest(ArrayList<Integer> grades){
	if (grades.size() < 1){
		System.out.println("The ArrayList is empty");
		return 0;
	}
	else{
		int sum = 0;
		for (int grade : grades){
			sum += grade;
		}
		int lowest = sum - grades.size();
		System.out.println(lowest);
		return lowest;
		
	}
		
	


}
public static void main (String[] args){
	ArrayList<Integer> myClassroom = new ArrayList<Integer>();
	myClassroom.add(98);
	myClassroom.add(92);
	myClassroom.add(88);
	myClassroom.add(75);
	myClassroom.add(61);
	myClassroom.add(89);
	myClassroom.add(95);
	GradeAnalyzer myAnalyzer = new GradeAnalyzer();
	myAnalyzer.getAverage(myClassroom);
	myAnalyzer.getHighest(myClassroom);
	myAnalyzer.getLowest(myClassroom);
	
}

}