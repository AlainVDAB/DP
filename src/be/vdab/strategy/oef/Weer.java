package be.vdab.strategy.oef;

public class Weer {
    private int temp;
    private int wind;

    public Weer(int temp, int wind) {
        this.temp = temp;
        this.wind = wind;
    }

    public int getTemp() {
        return temp;
    }

    public int getWind() {
        return wind;
    }

    String kiesJuisteVervoer(OversteekAlgoritme algoritme){
        return new StringBuilder().append("Inpakken")
                .append("\n").append(algoritme.getVervoer(this))
                .append("\nUitpakken")
                .toString();
    }


}
