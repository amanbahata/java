package com.personal.filesearch;

import java.io.File;

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
            case 0 : System.out.println("USAGE: FileSearchApp path [regex] [zipfile]");
                    return;
            case 3 : app.setZipFileName(args[2]);
            case 2 : app.setPath(args[1]);
            case 1 : app.setRegex(args[0]);

        }

        try {
            app.walkDirectory(app.getPath());
        }catch (Exception e){
            e.printStackTrace();
        }


    }


    public void walkDirectory(String path){
        System.out.println("Directory: " + path );
        searchFile(null);
        addFileToZip(null);
    }


    public void searchFile(File file){
        System.out.println("searchFile: " + file);

    }

    public void addFileToZip(File file){
        System.out.println("addFileToZip: " + file);
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
