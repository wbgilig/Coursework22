import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Board {
    public TestLocations[][] locations;

    /*
    constructor for board
    sets the types of each square and the size of the board
     */
    public Board (String spaces) {
        Scanner readSpaces = new Scanner(spaces);
        /*
        height and width are used to find out the dimentions of the 2d
        array representing the board called locations
         */
        int width = readSpaces.nextInt();
        readSpaces.nextLine();
        int height = readSpaces.nextInt();
        readSpaces.nextLine();
        this.locations = new TestLocations[width][height];

        //iterates through each line of the file and adds each to the y axis of the 2d array
        int i = 0; // iterator for placing types in locations on the y axis
        while (readSpaces.hasNextLine()) {
            int j = 0;//the iterator for placing types in locations on x axis
            String readLine = readSpaces.nextLine();
            Scanner Line = new Scanner(readLine);
            //iterates through the objects in each line and adds them to the x axis of the 2d array
            while (Line.hasNext()) {
                String type = Line.next();
                if (type.equals("T") || type.equals("G") || type.equals("P")){
                    this.locations[j][i] = new TestLocations(type);
                } else {
                    System.out.println("ERROR");
                    /*
                    throw IOException("bad input")
                    will throw error, but it will be caught externally
                    so I am using "ERROR" as a placeholder.
                     */
                }
                j++;
            }
            i++;
        }
    }

    /*
    This is a method that is designed to test a Board to get all of the
    tile types and output them appropriately
     */
    public void test(){
        for(int i = 0; i < this.locations[0].length;i++){
            for(int j = 0; j < this.locations.length; j++){
                System.out.print(this.locations[j][i].getType());
            }
            System.out.print("\n");
        }
    }
}
