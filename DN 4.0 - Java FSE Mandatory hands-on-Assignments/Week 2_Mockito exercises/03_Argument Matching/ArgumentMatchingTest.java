import static org.mockito.Mockito.*;
import org.junit.jupiter.api.Test;
import static org.mockito.ArgumentMatchers.*;

public class ArgumentMatchingTest {
   @Test
    public void testArgumentMatching() {
        ExternalApi mockApi = mock(ExternalApi.class);
        MyService service = new MyService(mockApi);

        System.out.println("Calling fetchWithParam(\"Hello\")...");
        service.fetchWithParam("Hello");

        System.out.println("Verifying that getDataWithParam(\"Hello\") was called...");
        verify(mockApi).getDataWithParam(eq("Hello"));
    }
}
