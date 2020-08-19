import java.io.*;
import java.util.*;

public interface BoardReader {
    List<List<Integer>> parseBoard(String filePath) throws IOException;

}