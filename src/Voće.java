public class Voće {
    private String naziv;
    private double težina;
    private boolean trula;

    public Voće(String naziv, double težina, boolean trula) {
        this.naziv = naziv;
        this.težina = težina;
        this.trula = trula;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public void setTežina(double težina) {
        this.težina = težina;
    }

    public void setTrula(boolean trula) {
        this.trula = trula;
    }

    public String getNaziv() {
        return naziv;
    }

    public double getTežina() {
        return težina;
    }

    public boolean isTrula() {
        return trula;
    }
}
    //Klasom Voće se opisuje voćka, koja je određena svojim nazivom, težinom (ceo broj, u gramima) i time da li je trula ili ne.

     //   2. Jabuka je voće koje je dodatno opisano sortom.

    //    3. Sokovnik se sastoji iz dva dela: posude za voće i cediljke.

     //   4. Posuda za voće ima svoj kapacitet i može da sadrži voće. U posudu za voće mogu da dodam voćku, mogu da
//   pratim koliko voćki ima unutra i koliko je prostora ostalo.

      //  5. Cediljka služi za ceđenje voća i radi tako što iscedi sve voće koje se nalazi u posudi. Pri svakom ceđenju mogu da pratim koliko soka je dobijeno.

     //   6. Ceđenjem jedne voćke se dobija količina soka jednaka 40% težine voćke.

     //   7. Sokovnik se ne sme prepuniti, a takođe ne prihvata trule voćke.

    //    8. Napisati program koji simulira rad sokovnika u koji može da stane 3kg jabuka.

    //    - Nad sokovnikom se vrše akcije ceđenja i ubacivanja jabuka, pri čemu se svaka akcija loguje u vidu ispisa na ekran ili snimanjem u .txt fajl.
//----------------------------------------------------------------------------------------------------------
     //   - Sokovnik je programiran da izvrši 100 akcija ceđenja i ubacivanja jabuka, pri čemu se
//   ceđenje voća radi sa verovatnoćom 30%, a dodavanje jabuke sa verovatnoćom od 70%.

    //    - Jabuka ima težinu u rasponu od 100g do 300g.

    //    - Jabuka ima 20% verovatnoće da bude trula.

    //    - Na kraju izvršavanja programa ispisati koliko je ukupno soka dobijeno ceđenjem.



     //   Ukoliko se desi da se kapacitet sokovnika premaši, potrebno je baciti PremasenKapacitetException i prekinuti izvršavanje programa.