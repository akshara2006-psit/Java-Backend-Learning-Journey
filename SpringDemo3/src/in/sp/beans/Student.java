package in.sp.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student {
	@Value("akshara")
private String name;
	@Value("101")
private int rollNo;
	@Value("94.23f")
private float marks;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getRollNo() {
	return rollNo;
}
public void setRollNo(int rollNo) {
	this.rollNo = rollNo;
}
public float getMarks() {
	return marks;
}
public void setMarks(float marks) {
	this.marks = marks;
}
public void display() {
	System.out.println("Name: "+name);
	System.out.println("RollNo: "+rollNo);
	System.out.println("marks: "+marks);
}
}
