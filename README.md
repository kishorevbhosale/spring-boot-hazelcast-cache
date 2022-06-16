# Caching-With-Spring-Boot-Using-HazelCast

### What is caching ?
In computing, a cache is a high-speed data storage layer which stores a subset of data, typically transient in nature, so that future requests for that data are served up faster than is possible by accessing the data’s primary storage location. Caching allows you to efficiently reuse previously retrieved or computed data.
___
### What is Hazelcast?
Hazelcast is a distributed In-Memory Data Grid platform for Java. The architecture supports high scalability and data distribution in a clustered environment. It supports the auto-discovery of nodes and intelligent synchronization. Likewise, Hazelcast offers various features such as Distributed Data Structure, Distributed Compute, Distributed Query, etc.
___
### Required Changes
* Add @EnableCaching in Main class
* Use @Cacheable, @CacheEvict, @CachePut as per application requirement
* Add Hazelcast dependency in pom.xml