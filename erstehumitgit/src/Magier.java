public class Magier extends Helden{
    private int manapunkte;

    public Magier(int level, int trefferpunkte, int manapunkte) {
        super(level, trefferpunkte);
        this.manapunkte = manapunkte;
    }

    public int getManapunkte() {
        return manapunkte;
    }

    public void setManapunkte(int manapunkte) {
        this.manapunkte = manapunkte;
    }

    @Override
    public String toString() {
        return "Magier{" +
                "manapunkte=" + manapunkte +
                '}';
    }
}
