class demo{
	public static void main(String [] args){
	int balance=5000;
	int widraw=-10;
	if(widraw<+balance){
		if(widraw>0){
			if(widraw%100==0){
				System.out.print("success");
			}else{
				System.out.print("fail");
			     }
			
		}else{
			System.out.print("negative ammount ");

		}
	}else{
		System.out.print("acount have less balance");
	}
	}
}