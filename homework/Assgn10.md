## Homework 10 - Jay Patel ##

### 1. ###
Two types of planning:  
1. The planning that proceeds
throughout the project: There will be planning as SWE moves through the projects. The type of planning mentioned here is the general planning which a team must do in order to keep the project on a path.  
2. The intense planning that must be carried out once the specifications are complete: This type of planning stresses the importance of working on the phase plan after the team has finalized the requirements with the vendor.

### 2. ###
Figure 9.1 represents the cone of uncertainty. We find the cost estimation works best near the end of the project. Starting the 4x, the uncertainty of cost decreases by a power of 2 as the team move through each phase. This means that the team is likely to miss the net cost by 4x if the cost estimation was done before requirements workflow. The book states that the best time to cost estimate is during the Analysis workflow where the degree of uncertainty is +-1 and it gives the finance dept to work out the details before hand.

### 3. ###
1.  Internal Costs: cost of technology & dev team salaries
2.  External Costs: Price that Client will pay

### 4. ###
 1. Creating source code does not tell the whole story: This is extremely true, I have worked on many projects where thinking looking longer than coding. 
 2. 2 different languages will lead to different output: Simple math function would take 2 lines in Java, where as it's take tens if it were done in assembly. 
 3. Not all system code is sent to the client: The client only wants to pay on the number of line they get but many times the dev team will have to keep some modules of the project on their side for troubleshoot, debug, or to implement new module. 
 4. Using a code generator: Nowadays, dev teams love using libraries and external software to complete a project, this technique can really throw off the line of code count. 

### 5. ###
Function Point Analysis (FPA) is a sizing measure of clear business significance. Business measures, such as the productivity of the development process and the cost per unit to support the software, can also be readily derived.The function point measure itself is derived in a number of stages. Using a standardized set of basic criteria, each of the business functions is a numeric index according to its type and complexity. These indices are totaled to give an initial measure of size which is then normalized by incorporating a number of factors relating to the software as a whole. The end result is a single number called the Function Point index which measures the size and complexity of the software product. I found the following formula to be similar across my research material.   
Function point = FP = UPF x VAF    
UFP = Sum of all the complexities i.e. the 5 parameters provided in the question,  
VAF = Value added Factor i.e. 0.65 + (0.01 * TDI),  
TDI = Total Degree of Influence of the 14 General System Characteristics

### 6. ###
5.7 Project delivery:  
This clause specifies the plans for a project delivery after completion. It asks to specify delivery approach, flow of information between clients, dev team, & the delivery team, packaging & physical delivery plan. In addition to that, it also highlights the importance of operation, instructional, maintenance manuals along with training material. 

### 7. ###
Here are some easy principle my team can follow in order to increase our project documentation history:
Keep track of planning with detailed notes; Every implementation cycle we can document the specific bugs, flaws in our design; Keep a neat record of testing output so that it can be compared with the requirements. 

### 8. ###
Every professional backs his work with some sort of documentation, no matter their field of work. Documenting thr work process gives the client a piece of mind & security about the product which they invested in. In SWE, documenting the project shows the client that the team cares about the product, proof of progress, and security about the project post-delivery. User has every right to complain if there is no documentation because it is their investment. 


