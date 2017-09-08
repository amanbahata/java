package com.personal.filesearch;

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

        FileSearchApp fileSearchApp = new FileSearchApp();


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
