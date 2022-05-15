package tools;

public enum MenuOptions {
    DISPLAYINFORMATIONABOUTRANDOMMOVIE(1),
    DISPLAYACTORS(2),
    QUIT(3);
    int action;
    MenuOptions(int action){
        this.action = action;
    }
}
