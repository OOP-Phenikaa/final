package sample.model;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Directory {
    private String name;             // Tên thư mục
    private List<Directory> subdirectories = new ArrayList<>();
    private List<File> files = new ArrayList<>();

    // Constructor
    public Directory(String name) {
        this.name = name;
    }

    // Getters and setters

    // Hàm thêm thư mục con
    public void addSubdirectory(Directory subdirectory) {
        subdirectories.add(subdirectory);
    }

    // Hàm thêm file
    public void addFile(File file) {
        files.add(file);
    }

    // Hàm trả về danh sách file
    public List<File> getFiles() {
        return files;
    }

    // Hàm trả về danh sách thư mục con
    public List<Directory> getSubdirectories() {
        return subdirectories;
    }
}
