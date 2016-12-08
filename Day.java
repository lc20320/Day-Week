
public class Day {
	private String [] day = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
	int index;
	private boolean error = false;
	
	
	
	public Day(String day) {
		int i = indexOfDay(day);
		if (i!=7) {
			this.index = i;
		} else {
			error = true;
		}
	}
	
	
	private int indexOfDay(String day) {
		int i = 0;
		while (i<this.day.length) {
			if (this.day[i].equals(day)) {
				return i;
			}
			i++;
		}
		return i;
	}
	

	public String getDay() {
		return day[this.index];
	}
	
	
	public void setDay(String day) {
		int i = indexOfDay(day);
		if (i!=7) {
			this.index = i;
		} else {
			error = true;
		}
	}
	
	
	public String nextDay() {
		return day[((this.index+1)%7)];
	}
	
	
	public String previousDay() {
		int i = (this.index==0)?(this.day.length-1):(this.index-1);
		return day[i];
	}
	
	
	public String calculateDay(int days) {
		int i;
		if (days>=0) {
			i = (this.index+1)%7;
		} else {
			i = (this.index==0)?(7-Math.abs(days)%7):(this.index+(7-Math.abs(days%7)));
		}
		return day[i];
	}
	
	
	public String toString() {
		return "Current day: " + day[this.index];
	}
}
