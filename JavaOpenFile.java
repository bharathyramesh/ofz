package com.ofs.training;

import java.io.File;
import java.io.IOException;

public class JavaOpenFile {

    public static void main(String[] args) throws Exception {
    	
        // ClassFileLocationFinder cp = getCurrentProgram()
        JavaOpenFile cp = new JavaOpenFile();

        // Class currentClass = cp.getClass()
        Class currentClass = cp.getClass();

        // File currentClassFile = currentClass.getFile()
        // String absPath = currentClassFile.getAbsolutePath()
        String absPath = currentClass.getProtectionDomain()
                                     .getCodeSource()
                                     .getLocation()
                                     .getFile();
        String fileName = absPath + (currentClass.getName()) + (".java") ;
        // System.out.println(absPath + (currentClass.getName()));

        String path = "D:/tools/notepad++/notepad++.exe " + absPath.substring(3)+ (currentClass.getName()) + (".java") ;
        System.out.println(path);
        Runtime objRun = Runtime.getRuntime();
        Process process = objRun.exec(path);
        /* try {
            Runtime objRun = Runtime.getRuntime();
            Process process = objRun.exec(fileName);
        } catch (IOException e) {
            System.out.println(e);
            
        } */
    }
}
