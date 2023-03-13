public class Tank extends Helden{
    private int Schildpunkte;

    public Tank(int level, int trefferpunkte, int schildpunkte) {
        super(level, trefferpunkte);
        Schildpunkte = schildpunkte;
    }

    public int getSchildpunkte() {
        return Schildpunkte;
    }

    public void setSchildpunkte(int schildpunkte) {
        Schildpunkte = schildpunkte;
    }

    @Override
    public String toString() {
        return "Tank{" +
                "Schildpunkte=" + Schildpunkte +
                '}';
    }
}
