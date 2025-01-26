
## Design Patterns
Reference :

https://www.geeksforgeeks.org/software-design-patterns/?ref=shm

https://refactoring.guru/design-patterns



### Behavorial Design Pattern

#### Proxy Design Pattern

- Lazy Loading: This technique defers the creation of an expensive object until it's actually needed. 
In this case, the RealImage object is only loaded from disk when it's displayed.
- Proxy Class: A proxy class acts as a placeholder for the real object. It provides the same interface 
but delegates the actual work to the real object when necessary.
- Access Control: Proxies can be used to implement security policies by checking authentication before allowing access to the real object.
- Caching: Proxies can cache frequently used data to improve performance.
- Logging and Monitoring: Proxies can be a convenient place to add logging and monitoring code to track usage and identify potential issues.
- Example: In applications like image galleries, loading all high-resolution images at once can slow performance and waste memory. 
Using a Virtual Proxy pattern solves this by initially loading lightweight placeholders instead of the full images. 
The high-resolution image only loads when the user scrolls to it, improving application responsiveness and optimizing resource use. 
This approach provides a smoother user experience while reducing unnecessary memory and CPU usage.


#### Observer Design Pattern

Let’s understand the observer design pattern through a real-world example:

Imagine a scenario where a weather station is observed by various smart devices. 
The weather station maintains a list of registered devices. 
Weather Station will update all the devices whenever there is change in the weather.

Each of the devices are concrete observers and each have their ways to interpret and display the information.
The Observer Design Pattern provides a flexible and scalable system where adding new devices or weather stations 
doesn’t disrupt the overall communication, providing real-time and location-specific weather updates to users.


### Creational Design Pattern

#### Prototype Design Pattern

A mechanism to create a new object by copying an existing object. 
qzOne common use case - managing configuration files for various environment.
Creating several config files could be error-prone, if they share common properties. 
So creating one and cloning that one across multiple environment is an efficient solution.
Promotes code re-use

### Structural Design Pattern

#### Decorator Design Pattern

The Decorator design pattern is a structural pattern that allows adding new functionalities 
to an object dynamically without altering its structure. It involves a set of decorator 
classes that wrap concrete components, providing additional behavior while maintaining 
the same interface.
Real-time example: Pizza customization
Consider a pizza ordering system where customers can customize their pizzas with various 
toppings. The base pizza can be decorated with toppings like cheese, pepperoni, 
mushrooms, and olives. Each topping is a decorator that adds its specific 
functionality (cost, description) to the base pizza. 


#### Facade Design Pattern

The Facade design pattern provides a simplified interface to a complex subsystem.
It involves creating a facade class, which acts as a single entry point for clients 
to interact with the underlying system, hiding its internal complexity.
Real-time Example: Online Shopping Order Processing
Consider an online shopping system where placing an order involves multiple steps: 
Checking product availability in the inventory, 
Processing payment, 
Arranging shipment, and 
Sending a confirmation email.
Without the Facade pattern, the client (e.g., the user interface or another module) 
would need to interact with each of these subsystems directly, leading to complex and 
tightly coupled code. Using the Facade pattern, a OrderFacade class can be created 
to encapsulate these steps: