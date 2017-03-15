Meteor
===========

Meteor: Automatic Machine Translation Evaluation System

Author: Michael Denkowski (http://www.cs.cmu.edu/~mdenkows/, mdenkows@cs.cmu.edu)

Copyright: Carnegie Mellon University

License: LGPL v2.1


## Programmatic Usage 

Add the following snipppet to add the dependencies into your project: 

```xml
<dependencies>
     ...
    <dependency>
        <groupId>edu.cmu</groupId>
        <artifactId>Meteor</artifactId>
        <version>1.5</version>
    </dependency>
    ...
</dependencies>
...
<repositories>
    <repository>
        <id>CogcompSoftware</id>
        <name>CogcompSoftware</name>
        <url>http://cogcomp.cs.illinois.edu/m2repo/</url>
    </repository>
</repositories>
```

This code snippet shows how to use it programmatically in your code: 
  
```java
import edu.cmu.meteor.scorer.MeteorConfiguration;
import edu.cmu.meteor.scorer.MeteorScorer;
import edu.cmu.meteor.scorer.MeteorStats;

MeteorConfiguration config = new MeteorConfiguration();
MeteorScorer scorer = new MeteorScorer(config);
MeteorStats stats = scorer.getMeteorStats("these include actitvies", "those include actitvies");
System.out.println(stats.score);
```


