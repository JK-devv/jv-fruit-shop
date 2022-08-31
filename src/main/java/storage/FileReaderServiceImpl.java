package storage;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class FileReaderServiceImpl implements FileReaderService {
    private static final File FILE_INPUT = new File("src/main/resources/input.csv");
    private static final Path PATH_OF_FILE = FILE_INPUT.toPath();
    private static final int INDEX_OF_HEAD_ELEMENT = 0;

    public List<String> getInfoFromFile() {
        try {
            List<String> parsedInfo = Files.readAllLines(PATH_OF_FILE);
            parsedInfo.remove(INDEX_OF_HEAD_ELEMENT);
            return parsedInfo;
        } catch (IOException e) {
            throw new RuntimeException(String.format("Can't read from file %s", FILE_INPUT), e);
        }
    }
}
