package example3;

 interface InterfaceA {
	 public default String getName() { // A
         return null; 
	 
 }
}
 interface InterfaceB{
	 public default String getName() { // B
         return null; 
}
 }