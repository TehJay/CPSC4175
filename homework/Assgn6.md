## HW 6 - Jay Patel ##

### 1. ###
Java:  
1.  OOP: Java allows effiecient management of OOP   
2. Popularity/Adaptibility: Java is famous worldwide, making it compatible across many systems.   
Cobol:  
1. Syntactical: Cobol syntax is like writing sentences in english, makes it easier to learn.  
2. Record-keeping: Mainframe languages are exceptional for financial record-keeping and management.


### 2. ###

Implementation..what not to do:   
1. No documentation..no comments. This makes it difficult code analyzer to do their job.  
2. Improper Indentation...once again this make the code extremely difficult to read and manage.  
3. Improper variable naming. This makes refactoring extremely hard.

### 3. ###

Although multiple subprocedures will be coded within a module, the approach to writing a subprocedure should be that the subprocedure is standalone. All required data that is external to the subprocedure is passed as parameters and/or a return value...other version would be not making the subprocedure standalone. I prefer the first option since it makes calling and interaction between object more structured. 

### 4. ###
On one of my current assignments, I'm having to continuously reuse a set of code which evaluates a list; It is now made into a subprocedure for future references. 

### 5. ###

Answer attached as HW6Q5.pdf in homework folder on github.


### 6. ###

Strength:  
1. Test cases designed to test the integration of a module are reused during the regression tests performed after integrating other modules.  
2. Advantageous if major flaws occur toward the top of the program.
Weakness:  
1. Until a certain set of modules have been integrated, it may not be possible to observe meaningful system functions because of an absence of lower level modules and the presence of stubs.

### 7. ###

Strength:  
1. If the low level modules and their combined functions are often invoked by other modules, then it is more useful to test them first so that meaningful effective integration of other modules can be done.  
2. Test conditions are easier to create.
Weakness:  
1. Test engineers cannot observe system level functions from a partly integrated system. They cannot observe the system level functions until the top level test driver is in place

### 8. ###
DSL is the perfect example of sandwich integration. Sandwich testing is a type of testing that consist of two parts,they are Top-down approach and Bottom-up approach.It combines the advantages of both Bottom-up testing and Top-down testing at a time.Bottom-up testing starts from middle layer and goes upward to the top layer where as Top-down testing starts from middle layer and goes downward. DSL is the middle layer actor. It helps the high level lang like python test the small stuff at the bottom of the structure while helping low level language make sure everything in the upper level is good to go. 


### 9. ###
 
Implementation group might only check the code for testing purposes like getting the job done. On the other hand, SQA is in charge of the bigger picture. The SQA group reviews the process description for compliance with organizational policy, internal software standards, externally imposed standards ISO-9001, and other parts of the software project plan.

### 10. ###
 
The abuse of GOTO is, thankfully, a long forgotten memory in today's modern programming languages. These days most programmers use loops and exit them once they find the value they're looking for, making this early exit/return a tightly scoped goto. So in thoery, Edgar's warning have been ignored and the goto statement has been transformed into something high level, making it harder to notice. Off topic but fun to note, Edgar's essay started a snowball effect in naming papers/essay in 'x considered harmful' style.