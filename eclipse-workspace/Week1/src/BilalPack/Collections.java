package BilalPack;
import java.util.ArrayList;
import java.util.Collection;
public class Collections {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		var list = new GenericList <String>();
		list.add("a");
		list.add("b");
		for (var item: list) {
			System.out.println(item);
		}
		
		
//		var iterator = list.iterator();
//		while (iterator.hasNext()) {
//		var current =iterator.next();
//		System.out.println(current);			
//	}
//	
		Collection<String> collection = new ArrayList <>();
		//collection.addAll(collection <? extends String>, "a","b","c");
		System.out.println(collection);
	}

}
