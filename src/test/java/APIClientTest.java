import fi.shams.APIClient;
import fi.shams.Todo;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class APIClientTest
{
    @Test
    void testFetchTodo()
    {
        APIClient apiClient = new APIClient();
        Todo todo = apiClient.fetchTodo();

        assertNotNull(todo, "Todo object not to be null");

        assertEquals(1, todo.getUserId(), "User ID should be 1");
        assertEquals(1, todo.getId(), "ID should be 1");
        assertEquals("delectus aut autem", todo.getTitle(), "Title should be 'delectus aut autem'");
        assertFalse(todo.isCompleted(), "Completed should be false");
    }
}
