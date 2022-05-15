import models.Actor;
import models.MovieLibrary;
import tools.Menu;
import tools.UserInputHandler;

public class MovieLibraryApp {
    public static void main(String[] args) {
        MovieLibrary movieLibrary = new MovieLibrary();
        movieLibrary.fillMovieList();

        while (true) {

            Menu.printMenu();
            switch (UserInputHandler.getMenuOptionFromUser()) {
                case DISPLAYINFORMATIONABOUTRANDOMMOVIE:
                    movieLibrary.getRandomMovieInformation();
                    break;
                case DISPLAYACTORS:
                    movieLibrary.printActorFilmography();
                    break;
                case QUIT: //Exit
                    System.out.println("nara");
                    System.exit(1);
            }


        }
    }

}

