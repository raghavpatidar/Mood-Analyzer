import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

import com.example.MoodAnalysisException;
import com.example.MoodAnalyzer;

public class MoodTest {

    @Test
    public void moodAnalyzerTestUC11() throws MoodAnalysisException {
        String msg = "I am in Sad Mood";
        MoodAnalyzer<String> moodAnalyzer = new MoodAnalyzer<>(msg);
        assertEquals("Sad", moodAnalyzer.analyseMood());
    }

    @Test
    public void moodAnalyzerTestUC12() throws MoodAnalysisException {
        String msg = "I am in Any Mood";
        MoodAnalyzer<String> moodAnalyzer = new MoodAnalyzer<>(msg);
        assertEquals("Happy", moodAnalyzer.analyseMood());
    }

    @Test
    public void moodAnalyzerTestUC21() throws MoodAnalysisException {
        String msg = null;
        MoodAnalyzer<String> moodAnalyzer = new MoodAnalyzer<>(msg);
        assertThrows(MoodAnalysisException.class, () -> moodAnalyzer.analyseMood());
    }

    @Test
    public void moodAnalyzerTestUC22() {
        String msg = "";
        MoodAnalyzer<String> moodAnalyzer = new MoodAnalyzer<>(msg);
        assertThrows(MoodAnalysisException.class, () -> moodAnalyzer.analyseMood());
    }
}
