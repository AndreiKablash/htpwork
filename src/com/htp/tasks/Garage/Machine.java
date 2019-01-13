package com.htp.tasks.Garage;

public class Machine {
    public static String machine= "Mercedes ";
    //класс машина
    //5 деталей
    // провести замену деталей (изменгить цену)
    //пересчитать стоимость автомобиля

    private int engine = 40;
    private int wheel = 14;
    private int body = 110;
    private int windshild = 15;
    private int gearbox = 35;
    private int spoiler = 10;
    private int rearSplashes = 5;
    private String model =" benz";


    //default constractor
    public Machine(){
    }
    public Machine(int engine, int wheel, int body, int windshild, int gearbox, int spoiler, int rearSplashes, String model) {
        this.engine = engine;
        this.wheel = wheel;
        this.body = body;
        this.windshild = windshild;
        this.gearbox = gearbox;
        this.spoiler = spoiler;
        this.rearSplashes = rearSplashes;
        this.model = model;
        this.machine=machine;
    }

    public static String getMachine() { return machine; }

    public int getEngine() {
        return engine;
    }

    public int getWheel() {
        return wheel;
    }

    public int getBody() {
        return body;
    }

    public int getWindshild() {
        return windshild;
    }

    public int getGearbox() {
        return gearbox;
    }

    public int getSpoiler() { return spoiler; }

    public int getRearSplashes() { return rearSplashes; }

    public String getModel() {
        return model;
    }


    public void setEngine(int engine) {
        this.engine = engine;
    }

    public void setWheel(int wheel) {
        this.wheel = wheel;
    }

    public void setBody(int body) {
        this.body = body;
    }

    public void setWindshild(int windshild) {
        this.windshild = windshild;
    }

    public void setGearbox(int gearbox) {
        this.gearbox = gearbox;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setSpoiler(int spoiler) { this.spoiler = spoiler; }

    public void setRearSplashes(int rearSplashes) { this.rearSplashes = rearSplashes; }

    public static void setMachine(String machine) { Machine.machine = machine; }
}

