package BilalPack;
import java.util.Iterator;

public  class GenericList <T> implements Iterable <T> {            //made generic list iterable by implementing iterable iterface

	//Change T with different Data Structures --l1
	public T [] items= (T[]) new Object [10];
	private int count;
	
	public void add (T item) {
		items[count++]=item;
	}
	public T get (int index) {
		return items[index];
	}
	@Override
	public Iterator <T> iterator (){
		return new ListIterator(this);   //return a list iterator an object knows how to iterate over a generic list
	}
	
	//This iterator is the only place we have to modify our code --l2
	private class ListIterator implements Iterator <T>{

		private GenericList <T> list;
		private int index;
		
		public ListIterator(GenericList <T> list) {
			this.list=list;
			
		}
		
		
		@Override
		public boolean hasNext() {
			// TODO Auto-generated method stub
			return (index < list.count);
		}

		@Override
		public T next() {
			// TODO Auto-generated method stub
			return list.items[index++];
		}
		
	}
}
