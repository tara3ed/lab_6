package blogic;

public class FlatFigure {
    double a,b,c,d;
    int al,bet;
    FFHelp ffhelp;

    public FlatFigure(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
        if (new FFHelp().isTriangle(a,b,c)){
            System.out.println("ok Triangle");
        }
        else {
            System.out.println("bad Triangle");
        }
    }
    public FlatFigure(double a, double b, int alfa) {
        this.a = a;
        this.b = b;
        if (alfa==90) this.c=Math.sqrt(a*a+b*b);
        else this.c = Math.sqrt(a*a+b*b -2*a*b*Math.cos(alfa*Math.PI/180));
        this.al = alfa;
    }
    public FlatFigure(double a, int alfa) {
        this.a = a;
        this.b = a;
        this.c = a;
        this.d = a;
        this.al= alfa;
        this.bet=180-alfa;
    }
    public FlatFigure(double a, double b, int alfa, int betta) {
        this.a = a;
        this.b = b;
        this.c = a;
        this.d = b;
        this.al= alfa;
        this.bet=betta;
        if (new FFHelp().isParallelogram(al,bet))
                System.out.println("ok Parallelogram");
        else    System.out.println("bad Parallelogram");

    }

    public double area(){
        FFHelp helper = new FFHelp();
        return helper.area(this);
    }
    


}
