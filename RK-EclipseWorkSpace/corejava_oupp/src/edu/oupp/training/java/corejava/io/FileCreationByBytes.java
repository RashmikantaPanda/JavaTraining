package edu.oupp.training.java.corejava.io;

import java.io.File;
import java.io.FileOutputStream;

public class FileCreationByBytes {

	public static void main(String[] args) {
		String filePath="./src/edu/oupp/training/java/corejava/io/FirstFile.txt";
		File file = new File(filePath);
        try {
            if (file.createNewFile()) {
                System.out.println("File created : " + file.getAbsolutePath());
            } else {
                System.out.println("File Already Exist");
            }
            try (FileOutputStream fos=new FileOutputStream(file)){
                    String data="Hello TM!";
                    fos.write(data.getBytes());
                }

        } catch (Exception e) {
        	e.printStackTrace();
        }
	}

}
