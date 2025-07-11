class BreakInForLoop{ 

    public static void main(String[] args) {  
		
		for(int i = 1; i <= 3; i++){ 

			if(i == 2) {
				break; 
			}
			
			System.out.println("\n i = " + i);
		}  
		
		System.out.println("\n Outside loop");
    }  
}