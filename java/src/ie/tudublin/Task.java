package ie.tudublin;

import java.util.Scanner;
import java.io.*;

import processing.data.TableRow;

public class Task{
    private String taskString;
    private int taskX1;
    private int taskX2;

    
    

    public void task(String taskString, int taskX1, int taskX2){
        this.taskString = taskString;
        this.taskX1 = taskX1;
        this.taskX2 = taskX2;
        

    }

    public void TableRow(){
       /// this.taskString = row.getString("taskString");
        //this.taskX1 = row.getInt("taskX1");
       // this.taskX2 = row.getInt("taskX2");
    }



    public String getString() {
        return taskString;
    }

    public void setString(String newtaskString) {
        this.taskString = newtaskString;
    }

    public int getTaskX1() {
        return taskX1;
    }

    public void setTaskX1(int newtaskX1) {
        this.taskX1 = newtaskX1;
    }

    public int getTaskX2() {
        return taskX2;
    }

    public void setTaskX2(int newtaskX2) {
        this.taskX2 = newtaskX2;
    }

    public Task(TableRow tr){

    }

}
