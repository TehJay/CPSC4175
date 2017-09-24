## Assignment 5 - Jay Patel ##

### 1. ###
operation-oriented & data-oriented:  
In operation-oriented design, the emphasis is on the operations. An example is data fl ow analysis (Section 14.3), where the objective is to design modules with high cohesion. In data-oriented design,
the data are considered first. The structure
of the data is determined first, and then the procedures are designed to conform to the structure
of the data.

### 2. ###
The input to the design process is the specification document, a description
of what the product is to do. The output is the design document, a description of how
the product is to achieve this. SRS is very much important to the Design, without the specification document, the project would be stuck with the basic question which is "what should this program do?". Design is the second step in the SDL process, therefore every note or revelation from SRS is needed in order to design a system which then results a fluid design which can be further used to actually build the system. 

### 3. ###
Input Variables:  Student info, prior transcripts (if any), Required Classes  
Processing Variables:  Grades, Professor's Info, Unpaid fees, other restrictions  
Output Variables:   Graduation (yes or no).

When a student enters a school, he/she will have the personal info, previous records, and required classes put together in order to create a process, which checks validity of graduation. The internal process will the bring in professor info, class grades, unpaid fees, which then will give out a yes or no for the validity for graduation. 

### 4. ###
 Transaction Analysis:  
Check for transcripts. 
Apply the credit if applicable
Assign the required classes.
Assign class restriction between upper/lower level classes. 
Student attends class(es) with Prof
Student assigned final grade. 
check for unpaid fees. 
check for other restrictions
Provide the result. 

### 5. ###

Class: Student  
Attributes: personal records, current transcript, current student balance, class level  
Methods: GetStudentInfo(), Get/Set CurrentBalance(), evaluatechecklist(), updateInfo().. etc

### 6. ###

In the context of your project (2 player chess game), I believe that the Design process is iterative in itself, which also includes testing, implementation, and requirement analysis. I say this because a project like a chess needs extensive focus on design as the fluidity of any project will be based on its inherit design. There are multiple points of focus on our project like, player movement, piece movement, check for win/loss. Iterative design allows us to to combine testing and implementing for small design changes, and when we decide on the final design then we can move to implementation knowing that we created a design which has been practically tested. 

### 7. ### 

When testing an implementation, the dev is testing foe compilation, syntax, bugs, re-factoring or run-time errors. 
When testing a design, the dev is looking for efficiency and fluidity of the procedure.  
Procedure for StudentGrad checker:  
chkGrad( student ) {
chkBalance()
chkClasslevel()
chkClassReq()
}

### 8. ###

Cyclomatic complexity = E - N + 2*P   
where,  
  E = number of edges in the flow graph.  
  N = number of nodes in the flow graph.  
  P = number of nodes that have exit points  

Figure 1: CC = 11 - 10 + 2*2 = 3

### 9. ### 
I have used a case tool once, and I have mixed feeling about it. Mostly, I do not want to involve another software in my SDLC in order to fasten or organize a project, However I do believe that the existence for CASE tools might be essential for not so full-fetched dev teams across the world, and it may help them build and organize with more efficiency.  

### 10. ###

It is a really great article on what a well written software is. I believe that every software engineering project could boast similar numbers. It is just that achieving them comes at a price which may be considered high by most people. It can be said that design up front is obviously much easier for the Shuttle group because they, as the article points out, have a single client with a single project. Point laid down by author in regards to documentation and version control is a no brainer. Many of the techniques mentioned in the article seem to boil down to good documentation and not sparing time or resources when it comes to making sure that the software is perfect. The simple truth is that bug–free on-time software is just more expensive than most clients are prepared to pay.