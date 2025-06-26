import static org.mockito.Mockito.*;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import static org.junit.jupiter.api.Assertions.*;
public class MyServiceMockStubTest {
@Test
    public void testExternalApi() {
        ExternalApi mockApi = Mockito.mock(ExternalApi.class);

        System.out.println("Stubbing getData() to return 'Mock Data'...");
        when(mockApi.getData()).thenReturn("Mock Data");

        System.out.println("Creating MyService with mocked ExternalApi...");
        MyService service = new MyService(mockApi);

        System.out.println("Calling fetchData() from MyService...");
        String result = service.fetchData();

        System.out.println("Result received: " + result);//
        assertEquals("Mock Data", result);
        System.out.println("Test passed: Mocked data matches expected value.");
    }
}
