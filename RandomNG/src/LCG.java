import java.util.Iterator;


public class LCG implements Iterable<Integer>  {
	
	public Integer factor;
	public Integer increment;
	public Integer module;
	public boolean full_period;
	
	public Integer previous;

	
	public LCG( Integer seed, Integer factor, Integer increment, Integer module, boolean full_period ){
	
		if (full_period){
			
			//make checks over parameters
			
			
		}
		
		this.factor = factor;
		this.increment = increment;
		this.module = module;
		this.full_period = full_period;
		this.previous = seed;
		
	}

	@Override
	public Iterator<Integer> iterator() {

		Iterator<Integer> it = new Iterator<Integer>() {

			@Override
			public boolean hasNext() {
				
				// there is always a next element
				return true;
			}

			@Override
			public Integer next() {
				
				// next = ( factor * previous  + increment ) % module
				Integer next = new Integer(( factor * previous  + increment ) % module  ); 
				previous = next;
				return next ;
			}

			@Override
			public void remove() {
				throw new UnsupportedOperationException();	
			}
		};
		
		return it;
	}
	
	 

}
