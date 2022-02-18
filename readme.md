1. more flexible and reusable
2. Encapsulation--> hiding the data , accessing the data using only method
3. Abstraction--> Hiding the implementation
4. 
5. Without perform upcast if we try to downcast , ClassCastException will be thrown.

              It is a runtime exception or unchecked exception.
              It is class, present in java.lang package.
              It can be avoided by using a operator known as ‘instanceof’.
6. Child ---(extends)--->Parent
    Parent p=new Child(); //auto downcasting
    Child c=new (Child)p;//Explicit upcasting
7. Data types
     int i= short// valid, no truncation
     int i = long //there will be truncation //error
     int i =(int)long;//explicit casting
8. BigDecimal bdl=new BigDecimal("22.55688");
    

    