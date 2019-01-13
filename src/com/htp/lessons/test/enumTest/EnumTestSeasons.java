package com.htp.lessons.test.enumTest;

public class EnumTestSeasons {
    public static void main(String[] args) {
        //values first
        Seasons[] seasons = Seasons.values();
        for (Seasons s:seasons
            ) {
            System.out.println(s + " ");
        }
        //values second
        System.out.println();
        for (Seasons s : Seasons.values()
        ) {
            System.out.println(s + " ");
        }
        System.out.println();
        System.out.println("ordinal");
        //values()
        System.out.println(Seasons.WINTER.ordinal());
        System.out.println(Seasons.SPRING.ordinal());
        System.out.println(Seasons.FALL.ordinal());
        System.out.println(Seasons.SUMMER.ordinal());

        //valuesOf()
        System.out.println();
        String f = "FALL";
        System.out.println(Seasons.valueOf(f));//

        //name()
        System.out.println();
        System.out.println(Seasons.SUMMER.name());

        System.out.println();
        //add description for Seasons
        System.out.println("add description for Seasons");
        Seasons seas = Seasons.SUMMER;
        System.out.println(seas);

        //none
        System.out.println();
        System.out.println("use getIntEnum");
        System.out.println("in copy of Seasons");
        Seasons type = Seasons.SUMMER;//in copy of Seasons
        System.out.println(type.getIntEnum());// in copy of Seasons
        System.out.println(type.getStrEnum()); // in copy of Seasons
        type.setIntEnum(12); //in copy of Seasons
        type.setStrEnum(" - 12");//in copy of Seasons
        System.out.println(type.getIntEnum());//in copy of Seasons
        System.out.println(type.getStrEnum());//in copy of Seasons
        // you changing values in original Enum
        System.out.println("original Seasons");
        System.out.println(Seasons.SUMMER.getIntEnum());
        System.out.println(Seasons.SUMMER.getStrEnum());
        System.out.println("do set");
        Seasons.SUMMER.setIntEnum(13);//original Seasons
        System.out.println(Seasons.SUMMER.getIntEnum());//original Seasons
        Seasons.SUMMER.setStrEnum("set summer");//original Seasons
        System.out.println(Seasons.SUMMER.getStrEnum());//original Seasons
        //switch
        System.out.println("switch"); // in psvm
        switch(type) {
            case WINTER:
            case SPRING:
            case FALL:
                System.out.println("Working ...");
                break;
            case SUMMER:
                System.out.println("Relaxation ...");
                break;
        }
        //switch from Seasons
        System.out.println("switch from Seasons");
        System.out.println(type.IsSummer());
        System.out.println(Seasons.FALL.IsSummer());
        //method isFall
        System.out.println("-----");
        System.out.println("isFall");
        type.IsFall();
        Seasons.FALL.IsFall();
        System.out.println(Seasons.valueOf("FALL"));
    }
}
