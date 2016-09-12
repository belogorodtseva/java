public class calculator{
	
	private int result;
	
	public void add(int ... params) {		
		for (Integer param : params) {
			this.result += param;
		}
	}
	
	public void minus(int ... params) {
		int key = 1;
		for (Integer param : params){
			if(key==1) {
				this.result = param;
				key += 1;
			}
			else this.result -= param;				
		}		
	}
	
	public void multiply(int ... params) {
		int key = 1;
		for (Integer param : params){
			if(key==1) {
				this.result = param;
				key += 1;
			}
			else this.result *= param;				
		}		
	}
	
	public void devide(int ... params) {
		int key = 1;
		for (Integer param : params){
			if(key==1) {
				this.result = param;
				key += 1;
			}
			else this.result /= param;				
		}		
	}
	
	public int getResult() {
		return this.result;
	}
	
	public void cleanResult() {
		this.result=0;
	}
}