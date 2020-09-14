import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MommifierTest {

    @Test
    public void should_return_null_when_get_empty_string() {
        Mommifier mommifier = new Mommifier("");
        String getString = mommifier.getResult();
        assertEquals(null, getString);
    }
}
