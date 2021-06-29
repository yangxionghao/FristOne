package Bean;

public class shengfen {
  public String province;
  public int id;
  public int confirmed_num;
  public int cured_num;
  public int dead_num;
public int getDead_num() {
	return dead_num;
}
public void setDead_num(int dead_num) {
	dead_num = dead_num;
}
public String getProvince() {
	return province;
}
public void setProvince(String province) {
	this.province = province;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public int getConfirmed_num() {
	return confirmed_num;
}
public void setConfirmed_num(int confirmed_num) {
	this.confirmed_num = confirmed_num;
}
public int getCured_num() {
	return cured_num;
}
public void setCured_num(int cured_num) {
	this.cured_num = cured_num;
}
public shengfen(String province, int id, int confirmed_num, int cured_num, int dead_num) {
	super();
	this.province = province;
	this.id = id;
	this.confirmed_num = confirmed_num;
	this.cured_num = cured_num;
	this.dead_num = dead_num;
}

  
}
