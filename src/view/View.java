package view;

import controller.Topiccontroller;

import java.util.Scanner;

public class View {
    public  void startTheProgram(){
        Scanner sc = new Scanner(System.in);
        Topiccontroller topicController = new Topiccontroller();
        System.out.println("Choose any option from below");
        System.out.println("1. Add New Topic");
        System.out.println("2. View All Topics");
        String userInput = sc.nextLine();

        switch (userInput){
            case "1":
                System.out.print("Enter the topic name: ");
                String topicName = sc.nextLine();
                String result = topicController.addNewTopic(topicName);

                System.out.println(result);
                break;

            case "2":
                System.out.println("View All Topic Process");
                break;
            default:
                System.out.println("Invalid Option");
        }
    }
}