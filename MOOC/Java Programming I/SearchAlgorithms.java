import java.util.ArrayList;

public class SearchAlgorithms {


    //Constructors
    //Methods
    public static int linearSearch(ArrayList<Book> books, int searchedId){
        for (int i = 0; i < books.size(); i++){
            if (books.get(i).getId() == searchedId){
                return i;
            }
        }

        return -1;
    }

    public static int binarySearch(ArrayList<Book> books, int searchedId){
        int start = 0, end = books.size();

        while (true){
            int mid = (end + start)/2;

            if (books.get(mid).getId() == searchedId){
                return mid;
            }

            if (start >= mid){
                return -1;
            }

            if (books.get(mid).getId() < searchedId){
                start = mid;
            }

            if (books.get(mid).getId() > searchedId){
                end = mid;
            }
        }
    }
}
