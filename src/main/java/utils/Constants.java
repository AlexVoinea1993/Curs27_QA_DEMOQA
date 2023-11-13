package utils;

import java.util.Random;

public class Constants {

    public static final String URL = "https://tutorialsninja.com/demo/";
    public static final String FIRST_NAME = "Alex";
    public static final String LAST_NAME = "Voinea";
    public static final String USED_EMAIL = "coulditbe1993@gmail.com";
    public static final String EMAIL = generate_email();

    public static String generate_email() {
        Random rnd = new Random();
        int number = rnd.nextInt(1000000);
        return "coulditbe" + number + "@gmail.com";
    }

    public static final String TELEPHONE_NUMBER = "+40728864542";
    public static final String PASSWORD = "c9c3b5n7";
    public static final String TITLE_COLOR = "rgb(35, 161, 209)";
    public static final String SEARCH_BAR_COLOR = "rgb(255, 255, 255)";
    public static final String SEARCH_BUTTON_COLOR = "rgb(119, 119, 119)";
    public static final String SHOPPING_CART_COLOR = "rgb(54, 54, 54)";
    public static final String NAVIGATION_BAR_COLOR = "rgb(34, 154, 200)";
    public static final String FOOTER_COLOR = "rgb(48, 48, 48)";
    public static final String INFORMATION_COLOR = "rgb(255, 255, 255)";
    public static final String GREY_COLOR = "rgb(204, 204, 204)";
    public static final String RED_COLOR = "rgb(169, 68, 66)";
    public static final String WRONG_EMAIL_ADDRESS = "amIWrong@gmail.com";
    public static final String WRONG_PASSWORD = "someday231993";

}
