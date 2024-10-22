
## Design Patterns
Reference :

https://www.geeksforgeeks.org/software-design-patterns/?ref=shm

https://refactoring.guru/design-patterns



### Behavorial Design Pattern

- #### Proxy Design Pattern

- Lazy Loading: This technique defers the creation of an expensive object until it's actually needed. In this case, the RealImage object is only loaded from disk when it's displayed.
- Proxy Class: A proxy class acts as a placeholder for the real object. It provides the same interface but delegates the actual work to the real object when necessary.
- Access Control: Proxies can be used to implement security policies by checking authentication before allowing access to the real object.
- Caching: Proxies can cache frequently used data to improve performance.
- Logging and Monitoring: Proxies can be a convenient place to add logging and monitoring code to track usage and identify potential issues.