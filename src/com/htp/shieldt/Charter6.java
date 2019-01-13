package com.htp.shieldt;

public class Charter6 {
    private double weigth;
    private double length;
    private double depth;

    Charter6(Charter6 ob) {
        weigth=ob.weigth;
        length=ob.length;
        depth=ob.depth;
    }

    Charter6(double weigth, double length, double depth){
        this.weigth=weigth;
        this.length=length;
        this.depth=depth;
    }

    Charter6() {
        weigth=-1;
        length=-1;
        depth=-1;
    }
    Charter6(double len){
        weigth=length=depth=len;
    }

    double volume(){
        return length*depth*weigth;
    }
    //установить размеры
}
//Добавление веса посылки
class BoxWeigth extends Charter6{
    double wigth;

    public BoxWeigth(BoxWeigth ob) {
        super(ob);
        this.wigth =ob.wigth;
    }
    BoxWeigth(double w, double l, double d, double m) {
        super(w,l,d);
        wigth=m;
    }
    public BoxWeigth(){
        super();
        this.wigth=-1;
    }
    public BoxWeigth(double len, double m){
        super(len);
        this.wigth=m;
    }
}
// добавление стоимость посылки
class Shipment extends BoxWeigth{
    double cost;

    public Shipment(Shipment ob) {
        super(ob);
        this.cost = ob.cost;
    }

    public Shipment(double w, double l, double d, double m, double cost) {
        super(w, l, d, m);
        this.cost = cost;
    }

    public Shipment() {
        this.cost = -1;
    }

    public Shipment(double len, double m, double cost) {
        super(len, m);
        this.cost = cost;
    }
}