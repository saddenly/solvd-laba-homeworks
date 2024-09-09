package com.example.solvd.september9;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.StringUtils;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

public class UniqueWordsCounter {
    public static void main(String[] args) throws IOException {
        String content = FileUtils.readFileToString(new File("src/main/java/com/example/solvd/september9/input.txt"), "UTF-8");

        Set<String> uniqueWords = Arrays.stream(StringUtils.split(content.toLowerCase(), " ")).collect(Collectors.toSet());

        FileUtils.writeStringToFile(new File("src/main/java/com/example/solvd/september9/output.txt"), "Unique words count: " + uniqueWords.size(), "UTF-8");
    }
}
