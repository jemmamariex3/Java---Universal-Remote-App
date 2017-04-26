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
public class Samsung implements UniversalRemoteControl{
   public void powerSamsung(String action){
      if(action.equals("on")){
         System.out.println("Turning on Samsung device...");
      }
      else if(action.equals("off")){
         System.out.println("Turning off Samsung device...");
      }
   }
   public void powerSony(String action){
      
   }
   public void powerVizio(String action){
      
   }
}