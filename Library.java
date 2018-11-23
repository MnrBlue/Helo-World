//A tool which will print out the books that a user has read.
import java .util.HashMap;
public class Library{
	public Library(){
		
	}
	public void getFinishedBooks(HashMap<String, Boolean> Library){
		if (library.size() < 1){
			System.out.println("The HashMap is empty");
		}
		else{
			for (String book: library.keySet()){
				if (library.get(book) == true){
					System.out.println(book);
				}
			}
		}
	}
			
			
			
	public void getUnfinishedBooks(HashMap<String, Boolean> library){
		if (library.size() < 1){
			System.out.println("The HashMap is empty");
				
		}
		else{
			for (String book: library.keySet()){
				if (library.get(book) == false){
					System.out.println(book);
					}
				}
			}
		}
	public static void main(String[]args){
		HashMap<String, Boolean> myBooks = new HashMap<String, Boolean>();
		myBooks.put("Road Down the Funnel", true);
		myBooks.put("Rat: A Biology", false);
		myBooks.put("TimeIn", true);
		myBooks.put("3D Printing", false);
		Library myLibrary = new Library();
		myLibrary.getFinishedBooks(myBooks);
		myLibrary.getUnfinishedBooks(myBooks);
		
	}
		
	}
