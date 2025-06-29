import static org.mockito.Mockito.*;
import org.junit.jupiter.api.Test;

public class VoidMethodTest {

    @Test
    public void testVoidMethod() {
        ExternalApi mockApi = mock(ExternalApi.class);
        doNothing().when(mockApi).logAction();

        System.out.println("Calling logAction()...");
        mockApi.logAction();

        System.out.println("Verifying that logAction() was called...");
        verify(mockApi).logAction();
    }
}
