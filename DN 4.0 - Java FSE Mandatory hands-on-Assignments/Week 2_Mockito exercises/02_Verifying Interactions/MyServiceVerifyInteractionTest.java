import static org.mockito.Mockito.*;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class MyServiceVerifyInteractionTest {

    @Test
    public void testVerifyInteraction() {
        ExternalApi mockApi = Mockito.mock(ExternalApi.class);

        System.out.println("Creating MyService with mocked ExternalApi...");
        MyService service = new MyService(mockApi);

        System.out.println("Calling fetchData() from MyService...");
        service.fetchData();

        System.out.println("Verifying if getData() was called on ExternalApi...");
        verify(mockApi).getData();
        System.out.println("Verification successful: getData() was called.");
    }
}
