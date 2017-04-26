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

class Driver{
   public static void main (String [] args){
      Remote logitech = new Remote();
      
      logitech.power("samsung", "on");
      logitech.power("sony", "on");
      logitech.power("vizio", "on");
   }
}