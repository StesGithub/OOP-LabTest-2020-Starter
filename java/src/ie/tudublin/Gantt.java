package ie.tudublin;

import processing.core.PApplet;
import java.util.Scanner;
import java.io.*;

public class Gantt extends PApplet
{	
	
	public void settings()
	{
		size(800, 600);

		try {
			loadTasks();
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		}
		printTasks();
	}

	public void loadTasks() throws FileNotFoundException{
        Scanner sc = new Scanner(new File("C:/Users/justs/Desktop/Year 2/algo&design/StephenThompson algo&design assignment/OOP-LabTest-2020-Starter/java/data/tasks.csv"));
        sc.useDelimiter(",");
		while(sc.hasNext()){
            System.out.println(sc.next());
        }
        sc.close();

    }

	public void printTasks()
	{
		
	}
	
	public void mousePressed()
	{
		println("Mouse pressed");	
	}

	public void mouseDragged()
	{
		println("Mouse dragged");
	}

	
	
	public void setup() 
	{
		
	}
	
	public void draw()
	{			


		background(255,255,255);
		stroke(0);
		fill(0);
		for(int i= 0; i<15; i++){

			int space = 200;
			int xSpacing = (space) + (40*i);

			line(xSpacing, 50, xSpacing, 400);
			textAlign(CENTER, CENTER);

			text("X", xSpacing, 40);
		}
	}
}
