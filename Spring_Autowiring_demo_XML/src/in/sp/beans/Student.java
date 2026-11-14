package in.sp.beans;

public class Student {
private String name;
private int rollno;
private Address addId;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getRollno() {
	return rollno;
}
public void setRollno(int rollno) {
	this.rollno = rollno;
}

public Address getAddId() {
	return addId;
}
public void setAddId(Address addId) {
	this.addId = addId;
}
public void display() {
	System.out.println("Name: "+name);
	System.out.println("Roll No: "+rollno);
	System.out.println("Address: "+addId);
}
}
