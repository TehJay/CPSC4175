## Homework 12 - Jay Patel ##

### 1. ###
A class is a blueprint for something, e.g., engine, publication, employee, etc. An object is an instance of that class; An aspect is a behavior/set of methods that cuts through multiple objects. For example, if we were to add monitoring software in OOP then we would have to add it to almost every class, on the other hand AOP uses aspects which are very broad to allow usability by many objects. These aspects are coded separately from main code, and whenever there is a call then it will pointcut to that code in the aspect. It is not about putting OOP against AOP, but the main idea here is more efficiently used in conjunction of both programming approaches.  

### 2. ###
As discussed earlier in the semester, trying to modify something in middle of a process can get tricky, thus addressing this particular issue in analysis phase will be easier than addressing it in design phase. Most of the software will have difference in requirements if it is implemented on different hardware platform. For example, most apps more features on their desktop version rather than mobile version. This forces the team to create entire different requirement for the mobile platform. If the move was to happen in a design phase, then the team would have to rework the design   & requirements between the platforms, creating a delay. One solution recommended in the book is the abstract factory pattern, where generator is designed as a abstract class, and then implemented in concrete terms depending on the platform(mobile or desktop).

### 3. ###
The Universal Windows Platform (UWP) is the app platform for Windows. You able to develop apps for UWP with just one API set to reach all Windows 10 devices – PC, tablet, phone, or Xbox. At the core, UWP apps is the idea that users want their experiences to be similar across ALL their devices, and they want to use whatever device is most convenient or productive for the task at hand. UWP makes this requirements a lot easier for SWE to implement because with just one package they're able to create program that run on different platforms without having to rewrite code. 

### 4. ###
Modern IDEs are very component based like Eclipse and VS. They make writing programs easier by having built-in shortcuts that do parts of the code for you; Hence we're not reinventing the component. Benefits include like more time to solve other issues, less time spent on debugging component code since it is always bug-free. On the other hand, modern IDEs really take away from the inherent knowledge of the programmers. These days many programmers don't know the basic methods of languages like Java because eclipse includes them automatically. 

### 5. ###
SaaS: SaaS is very similar to the old thin-client model of software provision, where clients provide the point of access to software running on servers. Example: GSuite, Dropbox, etc.
PaaS: PaaS functions at a lower level than SaaS, typically providing a platform on which software can be developed and deployed. Ex: Heroku, Google App Engine.
IaaS: Cloud infrastructure services, known as Infrastructure as a Service (IaaS), are self-service models for accessing, monitoring, and managing remote datacenter infrastructures, such as compute (virtualized or bare metal), storage, networking, and networking services (e.g. firewalls).
   
All of these represent a stepcase in cloud architecture. SaaS provides software, PaaS provides space to create application, and more deeply IaaS offers the ability to create & manage all of infrastructure related to running a project.   

### 6. ###
XML in homework directory named: A12Q6.xml.

### 7. ###
Input validation. Most of the flaws in modern systems occur from improper input validation. I'm quite petty when it comes to input validation; I have always forced myself to do it. Whenever there is input to be dealt with, just create a list of possible true cases. With that list, it is easy to implement a system in which any other non-true cases won't pass into the system. 
Example, SQL injection. Many sites coded with improper input handling actually provide full access to the database. If the attack were to type formatted SQLqueries in a any text box, he/she can spill the table on to display. 

### 8. ###
This was the paper that introduced the relational database, it clearly had some impact on how we design DB these days. This paper discusses the problem of data Independencies that is when there are changes in internal or external aspects of representation of data there should be minimal or no effect to users at the terminal end or in the applications accessing this data, and also data inconsistencies. One thing I found odd is that he makes a big deal about having no duplicates, however in the modern DBs they allow duplicate row data as long as it has unique primary key. 