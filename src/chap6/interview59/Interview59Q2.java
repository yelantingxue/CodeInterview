package chap6.interview59;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.EmptyStackException;

public class Interview59Q2 {

	private Deque<DataWithIndex> data = new ArrayDeque<>();
	private Deque<DataWithIndex> max = new ArrayDeque<>();
	private int currentIndex;
	
	public Interview59Q2(){
		currentIndex = 0;
	}
	
	public void add(Integer number) {
		
		while(!max.isEmpty() && number > max.getLast().data) {
			max.removeLast();
		}
		
		DataWithIndex dataWithIndex = new DataWithIndex(number, currentIndex);
		
		data.add(dataWithIndex);
		max.add(dataWithIndex);
		++currentIndex;
	}
	
	public DataWithIndex removeFirst() {
		
		if(data.isEmpty()) {
			throw new EmptyStackException();
		}
		
		DataWithIndex dataWithIndex = data.removeFirst();
		if(dataWithIndex.index == max.peek().index) {
			max.removeFirst();
		}
		
		return dataWithIndex;
		
	}
	
	public int maxNumber() throws EmptyStackException{
		
		if(max.isEmpty()) {
			throw new EmptyStackException();
		}
		
		return max.peek().data;
	}
	
	class DataWithIndex{
		
		int data;
		int index;
		
		public DataWithIndex(int data, int index) {
			this.data = data;
			this.index = index;
		}
	}
}
