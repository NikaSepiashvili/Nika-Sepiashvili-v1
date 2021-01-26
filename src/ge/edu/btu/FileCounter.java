package ge.edu.btu;

import java.io.File;
import java.io.FilenameFilter;

public class FileCounter {
    public int getFilesCount(String filePath, String word) {
        File file = new File(filePath);
        String[] fileNames = file.list(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {

                return name.toLowerCase().startsWith(word.toLowerCase());
            }
        });
        if (fileNames != null) {
            return fileNames.length;
        }
        else{
            return 0;
        }
    }

    public static void main(String[] args) {
        FileCounter fileCounter = new FileCounter();
        String filePath = "C:\\Users\\user\\Desktop\\BTU_DIRECTORY";
        int filesCount = fileCounter.getFilesCount(filePath, "btu");

        System.out.println("ნაპოვნი ფაილების რაოდენობაა: " + filesCount);
    }
}
