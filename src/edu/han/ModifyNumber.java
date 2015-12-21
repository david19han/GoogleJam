package edu.han;

public class ModifyNumber {
	private String number;
	public ModifyNumber(String number){
		this.number = number;
	}
		public String getNumber(){
			return this.number;
		}
		public void setNumber(String number){
			this.number = number;	
		}
		public String switchNumber(){
			String newnumber = "";
			for (int i = 0;i<number.length();i++){
				String current = Character.toString(number.charAt(i));
				if(current.equals("1")){
					newnumber = newnumber + 0;
				}else if (current.equals("0")) {
					newnumber = newnumber +1;
				}
			}
			return newnumber;
		}
		public String reverseNumber(){
			String snew="";
			for (int i=number.length()-1;i>0;i--){
				snew = snew + Character.toString(number.charAt(i));
			}
			return snew;
		}
		public String reverseSwitch(){
			String snew="";
			for (int i=number.length()-1;i>0;i--){
				snew = snew + Character.toString(number.charAt(i));
			}
			String newnumber = "";
			for (int i = 0;i<snew.length();i++){
				String current = Character.toString(snew.charAt(i));
				if(current.equals("1")){
					newnumber = newnumber + 0;
				}else if (current.equals("0")) {
					newnumber = newnumber +1;
				}
			}
			return newnumber;
			
		}
}
