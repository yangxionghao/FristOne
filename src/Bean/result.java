package Bean;

public class result {
   private String ip;
   private String time;
   private String day;
   private String traffic;
   private String type;
   private String id;
   private String muncs;
   private String mumip;
   private String numll;
public String getIp() {
	return ip;
}
public void setIp(String ip) {
	this.ip = ip;
}
public String getTime() {
	return time;
}
public void setTime(String time) {
	this.time = time;
}
public String getDay() {
	return day;
}
public void setDay(String day) {
	this.day = day;
}
public String getTraffic() {
	return traffic;
}
public void setTraffic(String traffic) {
	this.traffic = traffic;
}
public String getType() {
	return type;
}
public void setType(String type) {
	this.type = type;
}
public String getId() {
	return id;
}
public void setId(String id) {
	this.id = id;
}
public String getMuncs() {
	return muncs;
}
public void setMuncs(String muncs) {
	this.muncs = muncs;
}
public String getMumip() {
	return mumip;
}
public void setMumip(String mumip) {
	this.mumip = mumip;
}
public String getNumll() {
	return numll;
}
public void setNumll(String numll) {
	this.numll = numll;
}
public result(String ip, String time, String day, String traffic, String type, String id, String muncs, String mumip,
		String numll) {
	super();
	this.ip = ip;
	this.time = time;
	this.day = day;
	this.traffic = traffic;
	this.type = type;
	this.id = id;
	this.muncs = muncs;
	this.mumip = mumip;
	this.numll = numll;
}
public result() {
	super();
}
   
}
