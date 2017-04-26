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
public class Vizio implements UniversalRemoteControl{
   public void powerSamsung(String action){
      
   }
   public void powerSony(String action){
      
   }
   public void powerVizio(String action){
      if(action.equals("on")){
         System.out.println("Turning on Vizio device...");
      }
      else if(action.equals("off")){
         System.out.println("Turning off Vizio device...");
      }
   }
}