package storage;

import java.io.File;
import java.util.List;

public interface FileReaderService {
    List<String> getInfoFromFile(File file);
}
