class Droid{
  String name;
  int batteryLevel;
  public  Droid(String droidName){
    name = droidName;
    batteryLevel = 100;
  }
  public void performTask(String task){
    System.out.println(name + " is performing task : " + task);
    batteryLevel -= 10;

  }
 public String toString(){
   return  name;
 }
 public void energyReport(){
  System.out.println(name + "s battery level is :" + batteryLevel + "%");
 }
 public void energyTransfert(Droid Giver, Droid Reciever, int amount){
  Giver.batteryLevel -= amount;
  Reciever.batteryLevel += amount;
  System.out.println(Giver + " Just gave " + amount + "% of battery to " + Reciever);
 }
  
public static void main(String[] args){
 Droid Codey = new Droid("Codey");
 Droid Ekko = new Droid("Ekko");
 Droid Ilma = new Droid("Ilma");
 System.out.println("Hello, I am the droid : " + Codey);
 System.out.println("Hello, I am the droid : " + Ekko);
 System.out.println("Hello, I am the droid : " + Ilma);
 Codey.performTask("Singing");
 Ekko.performTask("Running");
 Ilma.performTask("Coding");
 Codey.energyReport();
 Ekko.energyReport();
 Ilma.energyReport();
 Ekko.energyTransfert(Ekko , Ilma , 10);
 Ekko.energyReport();
 Ilma.energyReport();
 Codey.energyTransfert(Codey , Ekko , 20);
 Codey.energyReport();
 Ekko.energyReport();

}
}
