public class p4 {
 public static void main(String[] args) {
  Car myCar = new Car("TATA");
  Car.Engine startMyCar = myCar.new Engine();
  startMyCar.start();
 }
}
class Car{
 String car;

 Car(String car){
  this.car = car;
 }

 class Engine{
  void start(){
   System.out.println("your "+car+" car is started");
  }
 }
}