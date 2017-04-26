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
public interface RemoteControl{
   public void power(String model, String action);
}