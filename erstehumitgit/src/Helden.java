public abstract class Helden {
    private int level;
    private int trefferpunkte;

    public Helden(int level, int trefferpunkte){
        this.level=level;
        this.trefferpunkte=trefferpunkte;
    }

    public int getLevel() {
        return level;
    }

    public int getTrefferpunkte() {
        return trefferpunkte;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public void setTrefferpunkte(int trefferpunkte) {
        this.trefferpunkte = trefferpunkte;
    }

    @Override
    public String toString() {
        return "Helden{" +
                "level=" + level +
                ", trefferpunkte=" + trefferpunkte +
                '}';
    }
}
