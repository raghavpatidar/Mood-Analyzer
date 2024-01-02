import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.example.MoodAnalyzer;

public class MoodTest {
    @Test
    public void moodAnalyzerTestUC11() {
        String msg = "I am in Sad Mood";
        MoodAnalyzer<String> moodAnalyzer = new MoodAnalyzer<String>(msg);
        assertEquals("Sad", moodAnalyzer.analyseMood());
    }

    @Test
    public void moodAnalyzerTestUC12() {
        String msg = "I am in Any Mood";
        MoodAnalyzer<String> moodAnalyzer = new MoodAnalyzer<String>(msg);
        assertEquals("Happy", moodAnalyzer.analyseMood());
    }

    @Test
    public void moodAnalyzerTestUC21() {
        String msg = null;
        MoodAnalyzer<String> moodAnalyzer = new MoodAnalyzer<String>(msg);
        assertEquals("Happy", moodAnalyzer.analyseMood());
    }

}
