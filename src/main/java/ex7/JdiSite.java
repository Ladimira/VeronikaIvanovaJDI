package ex7;

import com.epam.jdi.light.elements.pageobjects.annotations.JSite;
import ex7.pages.MainPage;
import ex7.pages.MetalsColorsPage;

@JSite("https://epam.github.io/JDI/")
public class JdiSite {
    public static MainPage mainPage;
    public static MetalsColorsPage metalsColorsPage;
}
