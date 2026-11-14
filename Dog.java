public class Dog{
//states-variable
int regNo;
String name;
static float height;
float weight;
Boolean isIndian;
//behaviour-methods
void barking(){
System.out.println("Dog barks");
}
void eating(){
System.out.println("Dog eats");
}
void fetching(){
System.out.println("Dog fetch");
}
void prnDetails(){
System.out.println(regNo+" "+name+" "+height+" "+weight+" ");}

public static void main(String[] args){
System.out.println("from main");
System.out.println(height);
//System.out.println(weight);

Dog D1= new Dog();
D1.regNo=12345;
D1.name="Kalu";
D1.height=24.5f;
D1.weight=38.5f;
D1.prnDetails();
D1.barking();
D1.eating();
D1.fetching();

Dog D2=new Dog();
D2.regNo=2345;
D2.name="Peelu";
//D2.height=48.6f;
D2.weight=20.5f;
D2.prnDetails();
D2.barking();
D2.eating();
D2.fetching();


}
}
 class Cat{
}



