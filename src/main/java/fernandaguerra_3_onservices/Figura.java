package fernandaguerra_3_onservices;

class Figura {
    protected String nomFigura;

    public Figura (String nomFigura) {
        setNomFigura(nomFigura);
    }
    public void setNomFigura(String nomFigura) {
        this.nomFigura = nomFigura;
    }
    public String getNomFigura() {
        return nomFigura;
    }
    public String toString() {
        return nomFigura;
    }

}
