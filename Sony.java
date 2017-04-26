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
public class Sony implements UniversalRemoteControl{
   public void powerSamsung(String action){
      
   }
   public void powerSony(String action){
      if(action.equals("on")){
         System.out.println("Turning on Sony device...");
      }
      else if(action.equals("off")){
         System.out.println("Turning off Sony device...");
      }
   }
   public void powerVizio(String action){
      
   }
}