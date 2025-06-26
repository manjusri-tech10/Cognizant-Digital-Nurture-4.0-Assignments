//Goal: Set up a Java project with JUnit 4.
//Steps:
//Create a Maven Project in your IDE.
//Add JUnit Dependency to your pom.xml:
//xml
//Copy
//Edit
//<dependencies>
   // <dependency>
        //<groupId>junit</groupId>
        //<artifactId>junit</artifactId>
      //  <version>4.13.2</version>
      //  <scope>test</scope>
  // </dependency>
//</dependencies>
//Create a test class:
//Right-click src/test/java
//New → Java Class → SampleTest
import org.junit.Test;
import static org.junit.Assert.*;
public class SampleTest {
    @Test
    public void sampleTest() {
        System.out.println("Running test...");
        assertEquals(4, 2 + 2);
    }
}

