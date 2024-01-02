import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.Test;

import com.example.MoodAnalyzer;

public class MoodTest {
    @Test
    public void tempTest() {
        String msg = "I am in Sad Mood";
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer(msg);
        assertEquals("Sad", moodAnalyzer.analyseMood());
    }
}
