
public class ArrayDeque<Item> implements Deque<Item>{
	private Item[] items;
	private int size;
	private int nextFirst;
	private int nextLast;
	private int arraySize;
	
	private static int FACTOR=2;
	
	public ArrayDeque(){
		size = 0;
		nextFirst = 4;
		nextLast = 5;
		arraySize = 8;
		items = (Item[]) new Object[arraySize];
	}
	
	/*reSize the array when reaches its capacity*/
	private void reSize(int capacity){
		Item[] copyTo = (Item[]) new Object[capacity];
		if(nextFirst>=nextLast){
			System.arraycopy(items, 0, copyTo, 0, nextLast);
			System.arraycopy(items, nextFirst+1, copyTo, capacity-size+nextFirst+2, size-nextFirst-1);
			nextLast = capacity-size+nextFirst+1;
		}
		else {
			System.arraycopy(items, nextFirst+1, copyTo, nextFirst+1, nextLast-nextFirst-1);
			
		}
	}
	
	@Override
	public void addFirst(Object x) {
		size+=1;
		int position = nextFirst;
		items[position]=(Item)x;
		nextFirst = (nextFirst-1)%arraySize;		
	}

	@Override
	public void addLast(Object x) {
		size+=1;
		int position = nextLast;
		items[position]=(Item)x;
		nextLast = (nextLast+1)%arraySize;
	}

	@Override
	public boolean isEmpty() {
		if (size==0){
			return true;
		}
		else
			return false;
	}

	@Override
	public int size() {		
		return size;
	}

	@Override
	public void printDeque() {
		int i = (nextFirst+1)%arraySize;
		int j = 0;
		while (i<=size){
			System.out.println(j + " "+ items[i]);
			System.out.println(" ");
			i+=1;
			j+=1;
		}		
	}

	@Override
	public Item removeFirst() {
		size-=1;
		int position = (nextFirst+1)%arraySize;	
		Item removed = items[position];
		items[position]	= null;
		nextFirst = (nextFirst+1)%arraySize;
		return removed;
	}

	@Override
	public Item removeLast() {
		size-=1;
		Item removed;
		if (nextLast>=1){			
			int position = nextLast-1;
			removed = items[position];
			items[position]= null;
			nextLast = nextLast-1;
		}
		else {
			int position = items.length-1;
			removed = items[position];
			items[position]= null;
			nextLast = items.length-1;
		}
		return removed;
	}

	@Override
	public Item get(int index) {
		int position = (nextFirst + index)%arraySize;
		return items[position];
	}

}
