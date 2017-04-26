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
public class RemoteAdapter implements RemoteControl{
   UniversalRemoteControl urc;
   
   public RemoteAdapter(String model){
      if(model.equalsIgnoreCase("samsung")){
         urc = new Samsung();
      }
      else if(model.equalsIgnoreCase("sony")){
         urc = new Sony();
      }
      else if(model.equalsIgnoreCase("vizio")){
         urc = new Vizio();
      }
   }
   public void power(String model, String action){
      if(model.equalsIgnoreCase("samsung")){
         urc.powerSamsung(action);
      }
      else if(model.equalsIgnoreCase("sony")){
         urc.powerSony(action);
      }
      else if(model.equalsIgnoreCase("vizio")){
         urc.powerVizio(action);
      }
   }
}