package train;

/**
 * @author rout
 *
 * Nov 18, 2019
 *
 * @project train
 */

public class Train {

	private String s="";
	private StringBuilder sd;
	private StringBuilder sKK;
	
	public Train(String st) {
		// TODO Auto-generated constructor stub
		this.setS(st);
		setSd(new StringBuilder());
		
		//sKK.append(s);
	}

	public String print() {
		StringBuilder sb = new StringBuilder();
		
		 String c ;
		for (int i = 0; i < this.s.length(); i++) {
			c= this.s.charAt(i)+"";
			if(c.equals("H")) {
				if(sb.toString().equals(""))sb.append("<HHHH");
				else if(i == this.s.length()-1)sb.append("::HHHH>");
			}
			if(c.equals("P"))sb.append("::|OOOO|");
			if(c.equals("R"))sb.append("::|hThT|");
			if(c.equals("C"))sb.append("::|____|");

		}
		
		this.sd = sb;

		return sb.toString();
	}

	public void detachEnd() {
		// TODO Auto-generated method stub
//		sKK.append(s);
//		if(sKK.charAt(0) == 'H') {
//			this.sd.delete(this.sd.length()-7, this.sd.length());
//			sKK.deleteCharAt(0);
//		}
//		else this.sd.delete(0, 6);
	}

	public boolean fill() {
		return false;
		// TODO Auto-generated method stub
		
	}

	public String getS() {
		return s;
	}

	public void setS(String s) {
		this.s = s;
	}

	public StringBuilder getSd() {
		return sd;
	}

	public void setSd(StringBuilder sd) {
		this.sd = sd;
	}

}
