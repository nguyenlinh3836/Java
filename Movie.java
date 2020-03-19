package ExArray;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Movie {
    List<String> movielist = new ArrayList<>();
    public static void main(String[] args) {
        int n;
        String movie;
        Movie list = new Movie();
        Scanner in = new Scanner(System.in);
        do {
            do {
                System.out.print("Enter 1: add List\n" +
                        "Enter 2: print List\n" +
                        "Enter 3: update Movie\n" +
                        "Enter 4: delete Movie\n" +
                        "Enter 5: find Movie\n" +
                        "Enter 0: to End\n" +
                        "Enter: ");
                n = in.nextInt();
            } while (n < 0 || n > 5);
            switch (n) {
                case 1:
                    System.out.print("Enter movie: ");
                    movie = in.next();
                    list.addMovie(movie);
                    break;
                case 2:
                    list.displayList();
                    break;
                case 3:
                    int afMovie;
                    System.out.print("Enter movie: ");
                    movie = in.next();
                    System.out.print("Enter update movie: ");
                    afMovie = in.nextInt();
                    list.updateMovie(afMovie,movie);
                    break;
                case 4:
                    System.out.print("Enter movie: ");
                    movie = in.next();
                    list.removeMovie(movie);
                    break;
                case 5:
                    System.out.print("Enter movie: ");
                    movie = in.next();
                    list.findMovie(movie);
                    break;
            }
        }while (n != 0);
    }
        public void addMovie(String movie){
           movielist.add(movie);
        }
        public void displayList() {
            System.out.println("List movie:"+ movielist);
        }
        public void updateMovie(int index, String movie){
            movielist.set(index,movie);
            System.out.println("List after update:" + movielist);
        }
        public void removeMovie(String index){
            movielist.remove(index);
            System.out.println("List movie after remove : ");
            System.out.println(movielist);
        }
        public void findMovie(String name){
            System.out.println("Does list contain movie " + name +" ? :"+movielist.contains(name));
            if (movielist.contains(name) == true) {
                System.out.println("index of " + name + ": " + movielist.indexOf(name));
            }
            else {
                System.out.println("Not movie on list\n");
            }
        }












}
