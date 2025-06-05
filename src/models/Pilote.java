package models;

public class Pilote {
    private static final int NOMBRE_PNEUS_EN_RESERVE = 16;
    private final String nom;
    private final String nationalite;
    private int nombrePoints;
    private int nombreCourses;
    private int nombreVictoires;
    private int nombrePodiums;
    private Pneu[] pneusEnReserve;
    private Voiture voiture;

    public Pilote(String nom, String nationalite, Voiture voiture) {
        this.nom = nom;
        this.nationalite = nationalite;
        this.nombrePoints = 0;
        this.nombreCourses = 0;
        this.nombreVictoires = 0;
        this.nombrePodiums = 0;
        this.voiture = voiture;
        this.pneusEnReserve = new Pneu[NOMBRE_PNEUS_EN_RESERVE];
    }

    public String getNom() {
        return nom;
    }

    public String getNationalite() {
        return nationalite;
    }

    public int getNombrePoints() {
        return nombrePoints;
    }

    public void setNombrePoints(int nombrePoints) {
        this.nombrePoints = nombrePoints;
    }

    public int getNombreCourses() {
        return nombreCourses;
    }

    public void setNombreCourses(int nombreCourses) {
        this.nombreCourses = nombreCourses;
    }

    public int getNombreVictoires() {
        return nombreVictoires;
    }

    public void setNombreVictoires(int nombreVictoires) {
        this.nombreVictoires = nombreVictoires;
    }

    public int getNombrePodiums() {
        return nombrePodiums;
    }

    public void setNombrePodiums(int nombrePodiums) {
        this.nombrePodiums = nombrePodiums;
    }

    public boolean deposerPneuEnReserve(Pneu pneu) {

    }

    public boolean retirerPneuEnReserve(Pneu pneu) {
    }

    public int getNombrePneusEnReserve() {

    }

    public Pneu[] getPneusEnReserveSansTrous() {

    }

    public String calculerPressionMoyennePneusEnReserve() {

    }

    public int compterNombrePneusEnReserveDeType(TypePneu type) {

    }

    @Override
    public String toString() {

    }
    
}
