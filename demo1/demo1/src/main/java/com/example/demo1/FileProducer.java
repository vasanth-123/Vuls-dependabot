package com.example.demo1;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class FileProducer implements CommandLineRunner {

    @Override
    public void run(String... args) throws Exception {
        String content = "Hello from demo1!";
        Path path = Paths.get("C:/Users/MADHU/eclipse-workspace/shared-folder/demo-file.txt");
       // Path path = Paths.get("shared-folder/demo-file.txt");
        Files.createDirectories(path.getParent());
        Files.write(path, content.getBytes());
        System.out.println(" File created by demo1.");
    }
}
