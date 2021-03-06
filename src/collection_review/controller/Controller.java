package collection_review.controller;

import collection_review.models.Fresher;
import collection_review.models.Intern;
import collection_review.view.ExperienceManager;
import collection_review.view.FresherManager;
import collection_review.view.InternManager;

import java.util.Scanner;

public class Controller {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ExperienceManager experienceManager = new ExperienceManager();
        FresherManager fresherManager = new FresherManager();
        InternManager internManager = new InternManager();
        boolean flag = true;
        do {
            System.out.println("CANDIDATE MANAGEMENT SYSTEM!:\n" +
                    "1. Experience!\n" +
                    "2. Fresher!\n" +
                    "3. Internship!\n" +
                    "4. Searching!\n" +
                    "5. Exit!\n");
            System.out.println("Please choose 1 to Create Experience Candidate, 2 to Create Fresher Candidate, 3 to Internship Candidate, 4 to Searching and 5 to Exit program!");
            int chooseMenu = Integer.parseInt(scanner.nextLine());
            switch (chooseMenu) {
                case 1:
                    experienceManager.add();
                   break;
                case 2:
                    fresherManager.addFr();
                    break;
                case 3:
                    internManager.add();
                    break;
                case 4:
                    System.out.println("CANDIDATE SEARCHING!:\n" +
                            "0. For Experience!\n" +
                            "1. For Fresher!\n" +
                            "2. For Internship!\n" +
                            "3. Exit!\n");
                    int chooseMenu1 = Integer.parseInt(scanner.nextLine());
                    switch (chooseMenu1) {
                        case 0:
                            experienceManager.displayExi();
                            experienceManager.search();
                            break;
                        case 1:
                            fresherManager.displayExf();
                            fresherManager.searchingFr();
                            break;
                        case 2:
                            internManager.displayI();
                            internManager.search();
                            break;
                        default:
                            flag = false;
                    }
                    break;
                default:
                    flag = false;
            }
        } while (flag);
    }

}
