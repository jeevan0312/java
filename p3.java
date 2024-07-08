public class p3 {
 public static void main(String[] args) {
  Customer c1 = new Customer("pratik", 20, 1234567890,true,5.0f);
  Customer c2 = new Customer("yash", 21, 1234567890, true, 3.5f);

  System.out.println(" customer name is: "+c1.name+", age is: "+c1.age+", contact no is: "+c1.contactnumber+", reward points are: "+c1.rewardPoint);

  System.out.println(" customer name is: "+c2.name+", age is: "+c2.age+", contact no is: "+c2.contactnumber+", reward points are: "+c2.rewardPoint);
 }
}

class Customer{
 String name;
 int age;
 int contactnumber;
 boolean memberShip = false;
 float rewardPoint;

 Customer(String name, int age,int contactNumber){
  this.name = name;
  this.age = age;
  this.contactnumber = contactnumber;
 }
 Customer(String name, int age, int contactnumber, boolean memberShip, Float rewardPoint){
  this.name = name;
  this.age = age;
  this.contactnumber = contactnumber;
  this.memberShip = memberShip;
  this.rewardPoint = rewardPoint;
 }
}
