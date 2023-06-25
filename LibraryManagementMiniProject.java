import java.util.ArrayList;
import java.util.Scanner;

public class LibraryManagementMiniProject {
    public static void main(String[] args) {
        int choise, code = 0;
        Scanner ob = new Scanner(System.in);
        ArrayList<Library> LibraryManagement = new ArrayList<>();
        do {
            System.out.println("=======================================================");
            System.out.println("Enter 1 to Add New Book ");
            System.out.println("Enter 2 to View Books List ");
            System.out.println("Enter 3 to Search Book ");
            System.out.println("Enter 4 to Purchase Book ");
            System.out.println("Enter 5 to Take Book For Rant(500 Rupay per Month)");
            System.out.println("Enter 0 to Exit ");
             System.out.println("=======================================================");

            System.out.print("Select an Option : ");
            choise = ob.nextInt();

            switch (choise) {
                case 1:
                    System.out.print("Enter Book Name :");
                    String bookName = ob.next();
                    System.out.print("Enter Book Author Name :");
                    String bookAuthorName = ob.next();
                    System.out.print("Enter Book Price  :");
                    float bookPrice = ob.nextFloat();
                    System.out.print("Enter Books Avalability : ");
                    int bookAvalable = ob.nextInt();
                    code++;
                    LibraryManagement.add(new Library(code, bookName, bookAuthorName, bookPrice, bookAvalable));
                    break;

                case 2:
                    System.out.println("----------All Books List---------");
                    System.out.println("BookCode\t\tBookName\t\tAuthorName\t\tPrice\t\tAvalability");
                    for (Library book : LibraryManagement) {
                        System.out.println(book.code + "\t\t\t" + book.bookName + "\t\t\t" + book.bookAuthorName + "\t\t\t"
                                + book.bookPrice + "\t\t" + book.bookAvalable);
                    }
                    break;

                case 3:
                    System.out.print("Enter Book Code For Search Book : ");
                    int searchBook = ob.nextInt();
                    for (int i = 0; i < LibraryManagement.size(); i++) {
                        if (searchBook == LibraryManagement.get(i).code) {
                            System.out.println("..........Book is Avalable");
                            System.out.println("BookCode\t\tBookName\t\tAuthorName\t\tPrice\t\tAvalability");
                            System.out.println(LibraryManagement.get(i).code + "\t\t\t" + LibraryManagement.get(i).bookName +
                                    "\t\t\t" + LibraryManagement.get(i).bookAuthorName + "\t\t\t"
                                    + LibraryManagement.get(i).bookPrice + "\t\t"
                                    + LibraryManagement.get(i).bookAvalable);
                        }
                    }
                    break;

                case 4:
                    System.out.print("Which Book You Want to Purchase Enter Name : ");
                    String purchaseBook = ob.next();
                    for (Library book : LibraryManagement) {
                        if (book.bookName.equals(purchaseBook)) {
                            System.out.println("...............Ok jii, Pay And Get Your Book");
                        }

                        String morePurchase;
                        do {
                            System.out.print("Do You Want to Purchase More Books(yes/no)? : ");
                            morePurchase = ob.next();
                            if (morePurchase.equals("yes")) {
                                System.out.print("Which Book You Want to Purchase Enter Name : ");
                                purchaseBook = ob.next();
                                for (Library i : LibraryManagement) {
                                    if (i.bookName.equals(purchaseBook)) {
                                        System.out.println("...............Ok jii, Pay And Get Your Book");
                                    }
                                }
                            }

                            else {
                                System.out.println("...........Ok, Thank You");
                                break;
                            }
                        } while (!morePurchase.equals("no"));
                    }
                    break;


                    case 5:
                     System.out.print("How Much Book You Want to Take on Rent : ");
                    int numberOfBooks = ob.nextInt();
                    System.out.print("Enter Which Book you Want to Take On Rent : ");
                    String bookRent = ob.next();
                    System.out.print("Enter How Long Time You Want to Take book on Rent(Month) : ");
                    Integer numberOfMonth = ob.nextInt();
                    float currectRent = (numberOfBooks * 500)*numberOfMonth;
                    System.out.println("-----------Your "+numberOfBooks+" Books Rent For "+numberOfMonth+" Month is : "+currectRent);


                    break;

            }
        } while (choise != 0);
    }
}

class Library {
    Integer bookAvalable;
    String bookName;
    String bookAuthorName;
    float bookPrice;
    Integer code;

    public Library(Integer code, String bookName, String bookAuthorName, float bookPrice, Integer bookAvalable) {
        this.bookName = bookName;
        this.bookAuthorName = bookAuthorName;
        this.bookPrice = bookPrice;
        this.bookAvalable = bookAvalable;
        this.code = code;
    }
}
