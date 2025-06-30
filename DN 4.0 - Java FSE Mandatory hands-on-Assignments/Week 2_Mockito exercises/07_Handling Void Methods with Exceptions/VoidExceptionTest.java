import static org.mockito.Mockito.*;
import org.junit.jupiter.api.Test;

public class VoidExceptionTest {

    @Test
    public void testVoidThrowsException() {
        ExternalApi mockApi = mock(ExternalApi.class);
        doThrow(new RuntimeException("Logging failed")).when(mockApi).logAction();

        System.out.println("Calling logAction(), expecting exception...");
        try {
            mockApi.logAction();
        } catch (Exception e) {
            System.out.println("Caught exception: " + e.getMessage());
        }

        verify(mockApi).logAction();
    }
}
