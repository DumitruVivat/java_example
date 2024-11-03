package main.lesson2;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class FileNames {
    private static Logger logger = Log.log(FileNames.class.getName());

    public static String[] getFileNamesInDir(String path) {
        File dir = new File(path);
        String[] result = new String[0];
        File[] files;
        if (dir.isDirectory()) {
            files = dir.listFiles();
            if(files != null) {
                result = new String[files.length];
                for (int i = 0; i < files.length; i++) {
                    File f = files[i];
                    String name = f.getName();
                    result[i] = name;
                }
            }
        } else {
            System.out.println(dir.getName() + " is not a directory");
        }
        return result;
    }

    public static void writeFileNamesToFile(String outPath, String inPath) {
        String[] arr = getFileNamesInDir(outPath);
        try {
            FileWriter fw = new FileWriter(inPath, true);
            for (int i = 0; i < arr.length; i++) {
                fw.write(arr[i] + "\n");
            }
            fw.flush();
            if (isThrow()){
                throw new IOException("Write file error");
            }
        } catch (IOException e) {
            System.out.println("Write file error");
            logger.log(Level.INFO,"Hello");
        }
    }
    private static boolean isThrow() {
        int a = 0;
        int b = 2;
        int digit = a + (int) (Math.random() * b);
        System.out.println(digit);
        return digit > 0;
    }
}
