package com.personal.filesearch;


import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * Created by aman1 on 08/09/2017.
 */
public class FileSearchApp {

    /**
     * Class variables
     */

    private String path;
    private String regex;
    private String zipFileName;


    public static void main(String[] args){

        FileSearchApp app = new FileSearchApp();

        switch (Math.min(args.length, 3)){
            case 0 : System.out.println("USAGE: FileSearchApp [path] [regex] [zipfile]");
                    return;
            case 3 : app.setZipFileName(args[2]);
            case 2 : app.setRegex(args[1]);
            case 1 : app.setPath(args[0]);

        }

        try {
            app.walkDirectory(app.getPath());
        }catch (Exception e){
            e.printStackTrace();
        }


    }

    // Uses java8 to go through the lit of files recursively by way of streams

    public void walkDirectory(String path) throws IOException {
        Files.walk(Paths.get(path)).forEach(f -> processFile(f.toFile()));
    }



    // Displays the relative path names of files

    public void processFile(File file) {
        System.out.println("processfile: " + file);
    }


    /**
     * Accessor methods
     */

    public String getPath(){
        return path;
    }

    public String getRegex(){
        return regex;
    }

    public String getZipFileName(){
        return zipFileName;
    }


    /*
     * Mutator methods
     */

    public void setPath(String path){
        this.path = path;
    }

    public void setRegex(String regex){
        this.regex = regex;
    }

    public void setZipFileName(String zipFileName){
        this.zipFileName = zipFileName;
    }




}
