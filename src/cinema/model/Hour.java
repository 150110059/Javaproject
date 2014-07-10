package cinema.model;

public enum Hour {
 
TEN(10),TWELVE(12),FOURTEEN(14),SIXTEEEN(16),EIGHTEEN(18),TWENTY(20),TWENTYTWO(22);

public int hour;

/*
 * @Author Mustafa Akgilli
 * @return
 * @subject this class produce hours
 */
private Hour (int hour){
	this.hour=hour;
}

public int getHour() {
	return hour;
}

 

}
