/*
Jemma Tiongson
Section #16031
App: Driver.java (Adapter App)
Purpose: Demonstrate Adapter
-------------------------------------------------------------------------

Terminal:
   Compile: javac Driver.java RemoteControl.java UniversalRemoteControl.java
   Samsung.java Sony.java Vizio.java RemoteAdapter.java Remote.java
   Run: java Driver
_________________________________________________________________________
*/
public class Remote implements RemoteControl{
   RemoteAdapter remoteAdapter;
   public void power(String model, String action){
      if(model.equalsIgnoreCase("samsung") || model.equalsIgnoreCase("sony") || model.equalsIgnoreCase("vizio")){
         remoteAdapter = new RemoteAdapter(model);
         remoteAdapter.power(model,action);
      }
      else{
         System.out.println(model +" not supported.");
      }
   }
}