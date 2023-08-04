package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = 0, y = 0, z = 0, n = 0;
        String direction = "N";

        System.out.println("Enter the initial direction:");
        direction = sc.nextLine();

        System.out.println("Enter the x-coordinates:");
        x = sc.nextInt();

        System.out.println("Enter the y-coordinates:");
        y = sc.nextInt();

        System.out.println("Enter the z-coordinates:");
        z = sc.nextInt();

        System.out.println("Enter the value of n (No of commands)");
        n = sc.nextInt();

        String[] commands = new String[n];
        for (int i=0; i<n; i++){
            commands[i]=sc.next();

        }
        for (int i=0; i<n; i++){
            if(commands[i].equals("f"))
            {
                if(direction.equals("N"))
                {
                    y=y+1;
                }
                else if(direction.equals("S"))
                {
                    y=y-1;
                }
                else if(direction.equals("E"))
                {
                    x=x+1;
                }
                else if(direction.equals("W"))
                {
                    x=x-1;
                }
                else if (direction.equals("U"))
                {
                    z=z+1;
                }
                else if(direction.equals("D"))
                {
                    z=z-1;
                }
            }
            else if(commands[i].equals("b"))
            {
                if(direction.equals("N"))
                {
                    y=y-1;
                }
                else if(direction.equals("S"))
                {
                    y=y+1;
                }
                else if(direction.equals("E"))
                {
                    x=x-1;
                }
                else if(direction.equals("W"))
                {
                    x=x+1;
                }
                else if (direction.equals("U"))
                {
                    z=z-1;
                }
                else if(direction.equals("D"))
                {
                    z=z+1;
                }
            }
            else if(commands[i].equals("u"))
            {
                direction = "U";
            }
            else if(commands[i].equals("d"))
            {
                direction = "D";
            }
            else if(commands[i].equals("l"))
            {
                if(direction.equals("N"))
                {
                    direction = "W";
                }
                else if(direction.equals("S"))
                {
                    direction = "E";
                }
                else if(direction.equals("E"))
                {
                    direction = "N";
                }
                else if(direction.equals("W"))
                {
                    direction = "S";
                }
                else if (direction.equals("U"))
                {
                    direction = "W";
                }
                else if(direction.equals("D"))
                {
                    direction = "E";
                }
            }
            else if(commands[i].equals("r"))
            {
                if(direction.equals("N"))
                {
                    direction = "E";
                }
                else if(direction.equals("S"))
                {
                    direction = "W";
                }
                else if(direction.equals("E"))
                {
                    direction = "S";
                }
                else if(direction.equals("W"))
                {
                    direction = "N";
                }
                else if (direction.equals("U"))
                {
                    direction = "E";
                }
                else if(direction.equals("D"))
                {
                    direction = "W";
                }
            }
            else{
                System.out.println("Invalid command");
            }

        }
        System.out.println("Final Position : ("+x+", "+y+", "+z+" )");
        System.out.println("Final Direction : "+direction);




    }
}