package com;
class C1{
	
}

class C2<E extends C1> extends C1{
	
	
}

class C4{
	
}
class C3<E extends C2> extends C4{
	
}


public class GenDemo {

	public static void main(String[] args) {
		
	C1 c=new C2<>();
	
	C4 c4=new C3<>();
	
	
	
	
	
	
		
		
	}
	
	
	
}
