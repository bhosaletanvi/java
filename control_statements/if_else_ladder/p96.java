class demo{
	public static void main(String [] args){
	
	int hr=3;
	boolean VIP=true;
	if(!VIP){
		if(hr<=2){
			System.out.print(hr*20);
		}
		else{
			System.out.print((2*20)+((hr-2)*10));
		}
	}	
	else{
		System.out.print(0);
	
	}
}
}