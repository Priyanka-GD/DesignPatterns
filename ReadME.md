
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


### Creational Design Pattern

#### Prototype Design Pattern

A mechanism to create a new object by copying an existing object. 
qzOne common use case - managing configuration files for various environment.
Creating several config files could be error-prone, if they share common properties. 
So creating one and cloning that one across multiple environment is an efficient solution.
Promotes code re-use


