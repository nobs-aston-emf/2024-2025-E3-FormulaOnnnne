package models;

import java.util.Arrays;

public class Pilote {

    public static int NOMBRE_PNEUS_EN_RESERVE = 16;

    private String nom;
    private String nationalite;
    private int nombrePoints;
    private int nombreCourses;
    private int nombreVictoires;
    private int nombrePodiums;
    private Pneu[] pneusEnReserve;
    private Voiture voiture;

    public Pilote(String nom, String nationalite) {
        this.nom = nom;
        this.nationalite = nationalite;
        this.nombrePoints = 0;
        this.nombreCourses = 0;
        this.nombreVictoires = 0;
        this.nombrePodiums = 0;
        this.pneusEnReserve = new Pneu[NOMBRE_PNEUS_EN_RESERVE];
        this.voiture = null;
    }

    public Pilote(String nom, String nationalite, Voiture voiture) {
        this.nom = nom;
        this.nationalite = nationalite;
        this.nombrePoints = 0;
        this.nombreCourses = 0;
        this.nombreVictoires = 0;
        this.nombrePodiums = 0;
        this.pneusEnReserve = new Pneu[NOMBRE_PNEUS_EN_RESERVE];
        this.voiture = voiture;
    }

    public boolean deposerPneuEnReserve(Pneu pneu) {
        boolean pneuDeposer = false;
        for (int i = 0; i < pneusEnReserve.length; i++) {
            if (pneusEnReserve[i] == null) {
                pneusEnReserve[i] = pneu;
                pneuDeposer = true;
                break;
            }

        }

        return pneuDeposer;
    }

    public Pneu retirerPneuEnReserve(TypePneu type) {
        Pneu pneuARetirer = null;
        for (int i = 0; i < pneusEnReserve.length; i++) {
            if (pneusEnReserve[i].getType().equals(type)) {
                pneusEnReserve[i] = null;
                pneuARetirer = pneusEnReserve[i];
                break;

            }
        }
        return pneuARetirer;
    }

    public int compterNombrePneusEnReserveDeType(TypePneu type) {
        int nombreDePneuCompter = 0;

        for (int i = 0; i < pneusEnReserve.length; i++) {
            if (pneusEnReserve[i] != null) {
                nombreDePneuCompter++;
            }
        }
        return nombreDePneuCompter;
    }

    public int getNombrePneusEnReserve() {
        return NOMBRE_PNEUS_EN_RESERVE;
    }

    public Pneu[] getPneusEnReserveSansTrous() {

        return;
    }

    public String pressionMoyenneDesPneusEnReserveFormatee() {

        return pressionMoyenneDesPneusEnReserveFormatee();
    }

    public int supprimerPneusDePressionInferieure(double pression) {

        return supprimerPneusDePressionInferieure(pression);
    }

    public boolean ajouterLotDePneus(Pneu[] pneus) {

        return ajouterLotDePneus(pneus);
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

    public void getNombrePoints(int nombrePoints) {

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

    @Override
    public String toString() {
        return "Pilote [nom=" + nom + ", nationalite=" + nationalite + ", nombrePoints=" + nombrePoints
                + ", nombreCourses=" + nombreCourses + ", nombreVictoires=" + nombreVictoires + ", nombrePodiums="
                + nombrePodiums + ", pneusEnReserve=" + Arrays.toString(pneusEnReserve) + ", voiture=" + voiture + "]";
    }

}
