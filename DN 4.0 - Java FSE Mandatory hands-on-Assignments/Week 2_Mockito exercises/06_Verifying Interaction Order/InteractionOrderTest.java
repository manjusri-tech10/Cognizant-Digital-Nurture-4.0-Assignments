import static org.mockito.Mockito.*;
import org.junit.jupiter.api.Test;
import org.mockito.InOrder;

public class InteractionOrderTest {

    @Test
    public void testOrder() {
        ExternalApi mockApi = mock(ExternalApi.class);

        System.out.println("Calling methods in order...");
        mockApi.stepOne();
        mockApi.stepTwo();

        InOrder inOrder = inOrder(mockApi);
        System.out.println("Verifying method call order...");
        inOrder.verify(mockApi).stepOne();
        inOrder.verify(mockApi).stepTwo();
    }
}
