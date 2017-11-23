## Homework 11 - Jay Patel ##
### 1. ###
Stepwise refinement is a way of developing computer programs by first outlining general functions, then breaking each function down into details which are refined in successive steps until the whole program is fully defined. It is also known as top-down design.

### 2. ###
There is a big difference when it comes to OOAD vs topdown development. The main point is that in topdown dev you're creating/coding from the beginning, without any designs/picture; Whenever the team runs into a problem, they will most likely have to work back to fix the code so that correct design can be implemented. This approach is more like 'sit down & start coding'. On the other hand, OOAD provides a more chunk based project; this approach really helps with overall design and methodology of the project since each episode is sectioned out for a specific task (Analysis/Design/Implementation/Testing).

### 3. ###
This paper describes the concept of stepwise refinement extremely thoroughly. Nicklaus Wirth's main point is that software eng. have a tendency to focus too much on learning the syntax and style of a programming language, in addition to that he says that we should be focusing on the process which is used to design new programs. He then goes on to describe Stepwise refinement using the eight-queens problems -  problem of placing eight chess queens on an 8×8 chessboard so that no two queens threaten each other. Thus, a solution requires that no two queens share the same row, column, or diagonal; this problem can be transformed into 'placing n queens onto nxn square'. Wirth says "A guideline in the process of stepwise refinement should be the principle to decompose decisions as much as possible, to untangle aspects which are only seemingly interdependent, and to defer those decisions which concern details of representation as long as possible." Here Wirth enforces the ides of thinking in stepwise process: Starting out as brute-force, realise that we can be more efficient by using the bounds, tests cases etc.

### 4. ###
I have been investing some of my income in the stock market this year; Due diligence plays a great role if you want to have good return on investments. Lets take ticker $KTOS for example. To do my D.D, I had to start from scratch: knowing what the company is, what they do, who's on their management, whats their product pipeline. Then we can begin to take a look a little deeper: cash reserves, cash flows, net budget, debt, institutional investors, their market sector sentiment. All of this precedes our decision to make an investment or not. Doing due diligence is very important across all of life. 

### 5. ###
The issue mentioned in this question is called coupling vs decoupling. As SWEs, we want to have loose coupling so that  if we change code in module B, it won't affect module A. The best way to ensure loose coupling is to implement encapsulation in our system. The idea is that a class hides it's internal details from other classes, and offers a strictly defined interface for other classes to communicate with it.

### 6. ###
Source formatting:     
/*  
* $decription of method/class/attribute  
*    
* $encap visibility  
* $type type  
* $name name  
* $ini initial value  
* $param param  
* $return return value  
* / 

pseudocode to generation:  
start  
while it has comment block  
do{   
 .call scanner on to the commentblock  
 .have switch cases that go through all of our possible 
variables (starts with - $)  
 -save the new formatting to end of output file  
}  
save the output file  
end

### 7. ###
Added file (A11Q7.txt) to homework folder. Solution in text file. 