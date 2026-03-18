class Invalidrentalduration extends Exception{
   String m;
   Invalidrentalduration(String m){
      super(m);
   }
}
class Notavailable extends Exception{
   String m;
   Notavailable(String m){
      super(m);
   }
}
class Vehicle{
   double rent_dur;
   Vehicle(double rent_dur){
       this.rent_dur=rent_dur;
   }     
}
class Car extends Vehicle{
   String model;
   String color;
   Car(double rent_dur,String model,String color){
      super(rent_dur);
      this.model=model;
      this.color=color;
   }
}
class Electric_car extends Car{
   int no_of_cars;
   double price;
   int range;
   Electric_car(double rent_dur,String model,String color,double price,int range,int no_of_cars)throws Invalidrentalduration{
      if(rent_dur>4){
         throw new Invalidrentalduration("u can rent a car only for 3 days");
      }
      super(rent_dur,model,color);      
      this.price=price;
      this.range=range;
      this.no_of_cars=no_of_cars;
   }
   void check_Available()throws Notavailable{
      if(no_of_cars>=10){
      throw new Notavailable("at once u can rent only 10 cars");
      }
   }
}
public class Main{
public static void main(String[] args){
   System.out.println(2);
}
}

      
      