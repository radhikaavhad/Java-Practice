package BadmintonSlotScheduler;

import java.util.Scanner;

public class ScheduleSlot {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        Batch[] batchesArray = {
                new Batch("7 AM to 8 AM"),
                new Batch("8:30 AM to 9:30 AM"),
                new Batch("10 AM to 11 AM"),
                new Batch("5 PM to 6 PM"),
                new Batch("7 PM to 8 PM")
        };

        System.out.println("Enter number of users: ");
        int totalUsers = sc.nextInt();
        sc.nextLine();

        User[] usersArray = new User[totalUsers];

        for(int j=0;j<usersArray.length;j++) {

            System.out.println("Enter your name: ");
            String userName = sc.nextLine();

            User user = new User(userName);
            usersArray[j] = user;

            while (true) {
                System.out.println("===Badminton Class Batches===");
                for (int i = 0; i < batchesArray.length; i++)
                    batchesArray[i].displaySlot(i);

                System.out.println();
                System.out.println("Enter your choice: ");

                System.out.println("a) Book Slot");
                System.out.println("b) Cancel Slot");
                System.out.println("c) Exit");
                int choice = sc.nextInt();
                sc.nextLine();

                switch (choice) {
                    case 1:
                        if (user.hasBooked()) {
                            int bookedIndex = user.getBookedBatchIndex();
                            System.out.println("You have already booked: " + batchesArray[bookedIndex].slot);
                            System.out.println();
                            break;
                        }

                        System.out.print("Enter batch number to book (0 to 4): ");
                        int batchChoice = sc.nextInt();
                        if (batchChoice >= 0 && batchChoice <= 4) {
                            int index = batchChoice;
                            if (batchesArray[index].isAvailable()) {
                                batchesArray[index].bookSpot();
                                user.book(index);
                                System.out.println("Booking confirmed for " + batchesArray[index].slot);
                                System.out.println();
                            } else {
                                System.out.println("Sorry, this batch is full.");
                                System.out.println();
                            }
                        } else {
                            System.out.println("Invalid batch number.");
                            System.out.println();
                        }
                        break;

                    case 2:
                        if (user.hasBooked()) {
                            int cancelIndex = user.getBookedBatchIndex();
                            batchesArray[cancelIndex].cancelSpot();
                            user.cancelBooking();
                            System.out.println("Booking cancelled.");
                            System.out.println();
                        } else {
                            System.out.println("You have no bookings to cancel.");
                            System.out.println();
                        }
                        break;

                    case 3:
                        System.out.println("Exited successfully");
                        break;

                    default:
                        System.out.println("Invalid choice : ");
                }
                if(choice == 3)
                    break;
            }
        }
        }
    }
