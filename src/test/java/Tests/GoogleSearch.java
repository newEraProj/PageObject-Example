package Tests;
import Pages.HomePage;
import org.junit.Test;




public class GoogleSearch {

    @Test
    public void GoogleSearching1() {
        HomePage home= new HomePage(); //you should create instance of the page which youre using in your test

        home.Search("Selenide"); // using home instance we calling Search method and setting text to send dirrectly
    }

    @Test
    public void GoogleSearching2() {
        HomePage home = new HomePage();//you should create instance of the page which youre using in your test

       home.Search("FireFox"); // using home instance we calling Search method and setting text to send dirrectly

    }
}



