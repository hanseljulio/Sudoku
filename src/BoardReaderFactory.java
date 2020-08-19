import java.io.*;
import java.util.*;

public class BoardReaderFactory {
    public static BoardReader getReader(String filePath) {
        if (filePath.contains(".sdk")) {
            return new SdkBoardReader();
        } else if (filePath.contains(".ss")) {
            return new SsBoardReader();
        }
        throw new UnsupportedOperationException("File format " + filePath + " is not supported.");
    }
}