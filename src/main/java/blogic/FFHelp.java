package blogic;

public  class FFHelp {
    FlatFigure figure;

    public double area(FlatFigure figure) {
        if (figure.d==0 && isTriangle(figure.a,figure.b,figure.c)) {
            if (figure.al==90) return 0.5*figure.a*figure.b;
            else return triangleArea(figure.a,figure.b,figure.c);
        }
        else if (figure.al==90 && figure.bet==90 && figure.a==figure.c && figure.b==figure.d) {
            return figure.a*figure.b; }
        else { return parallelArea(figure.a,figure.b,figure.al); }
    }

    private double triangleArea(double a, double b, double c) {
        double p = (a + b + c) / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    private double parallelArea(double a, double b, int al) {
        return a * b * Math.sin(al*Math.PI/180);
    }

    public boolean isTriangle(double a, double b, double c) {
        return (a + b > c && a + c > b && b + c > a);
    }

    public boolean isParallelogram(int al, int bet) {
        return (al + bet == 180);
    }
}
