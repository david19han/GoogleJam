package edu.han;

public class Algorithm {
	String s0 = "";
	String s1 = "0";
	String s2 = "001";
	String s3 = "0010011";
	String s4 = "001001100011011";

	ModifyNumber modify1 = new ModifyNumber(s1);
	ModifyNumber modify2 = new ModifyNumber(s2);
	ModifyNumber modify3 = new ModifyNumber(s3);
	ModifyNumber modify4 = new ModifyNumber(s4);
	
	ModifyNumber reverse1 = new ModifyNumber(modify1.switchNumber());
	//private int n;
	public Algorithm(){
		//this.n = n;
	}
	public String pastnumber(int m){
		if (m == 0){
			return s0;
		}
		else if (m == 1){
			return s1;
		}
		else if (m == 2){
			return s2;
		}
		else if (m == 3){
			return s3;
		}
		else if (m == 4){
			return s4;
		}else {
			ModifyNumber past = new ModifyNumber(pastnumber(m-1));
			String result = pastnumber(m-1) + "0" + past.reverseSwitch();
			return result;	
		}
	}	
}
