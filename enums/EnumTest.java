package enums;

import java.util.*;

enum Size{
    SMALL("S"), MEDIUM("M"), LARGE("L"), VERY_BIG("XL");

    private Size(String abbreviation)
    { 
        this.abbreviation = abbreviation ;
    }

    public String getAbbreviation(){
        return abbreviation;
    }

    private String abbreviation;
}

public class EnumTest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a size: SMALL, MEDIUM, LARGE, VERY_BIG");
        String input = in.next().toUpperCase();
        Size size = Enum.valueOf(Size.class, input);

        System.out.println("size=" + size);
        System.out.println("abbreviation=" + size.getAbbreviation());

        if (size == Size.VERY_BIG){
            System.out.println("YOU ARE FUCKING FAT!!!");
        }


    }
}
