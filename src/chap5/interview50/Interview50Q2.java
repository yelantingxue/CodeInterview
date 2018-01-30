package chap5.interview50;

public class Interview50Q2 {

	private int[] indexes;
	private int index;
	
	public Interview50Q2() {
		super();
		
		indexes = new int[256];
		index = 0;
		
		for(int i = 0; i < 256; i++) {
			indexes[i] = -1;
		}
		
	}


	public void insert(char ch) {
		
		if(indexes[(int)ch] == -1) {
			
			indexes[(int)ch] = index;
			
		}else if(indexes[(int)ch] >= 0) {
			
			indexes[(int)ch] = -2;
		}
		
		index++;
		
	}
	
	public char firstAppearingOnce() {
		
		int minIndex = Integer.MAX_VALUE;
		char ch = '\0';
		
		for(int i = 0; i < 256; i++) {
			
			if(minIndex > indexes[i] && indexes[i] >= 0) {
				ch = (char)i;
				minIndex = indexes[i];
			}
		}
		
		return ch;
	}
}
