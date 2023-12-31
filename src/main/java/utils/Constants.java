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
    public static final String BLACK_COLOR1 = "rgb(51, 51, 51)";
    public static final String BLACK_COLOR2 = "rgb(85, 85, 85)";
    public static final String COMMENT1 = "nothing to declare";
    public static final String COMMENT2 = "It's a very good monitor";
    public static final String DATE = "2023-12-07 ";
    public static final String TIME = " 03:10";
    public static final String NUMBER_OF_PRODUCTS = "2";
    public static final String POSTCODE = "012915";
}
