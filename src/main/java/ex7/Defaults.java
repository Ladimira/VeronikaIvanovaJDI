package ex7;

import ex7.entities.MetalsColors;
import ex7.entities.User;

import java.util.Arrays;

public class Defaults {
    public static User defaultUser = new User("epam","1234", "PITER CHAILOVSKII");
    public static MetalsColors defaultMCData = new MetalsColors(
            Arrays.asList("Water","Fire"),
            Arrays.asList("Cucumber","Tomato"),
            "Selen",
            "Red",
            "8",
            "3"
    );
}

