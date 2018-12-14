
package arrayListExample;
import java.util.*;
public class arrayListExample {

	public static void main(String[] args) {
		ArrayList<Integer> intlist=new ArrayList<Integer>(10);
		//intlist.add(5);
		//intlist.add(100);
		//intlist.add(-1);
		for(int i=0; i <10; i++) {
			intlist.add(i);
		}
		// intlist[0] = 0
		// intlist[1] = 1
		// TODO Auto-generated method stub
		System.out.println(intlist.size());
		System.out.println("John Farmer");
		System.out.println(intlist.indexOf(6));
		System.out.println(intlist.contains(1));

	}

}
