import java.util.Random;

public class Cediljka {
    double ukupnaKolicinaSoka=0;
    PosudaZaVoće posuda;

    public Cediljka(PosudaZaVoće posuda) {
        this.posuda = posuda;
    }

    public double cedi(){
        double kolicinaSoka=0;
        double tezina = 0;
        if(posuda.lista == null)
            return 0;
        for(int i =0;i<posuda.stanje();i++){
            tezina=tezina+posuda.lista.get(i).getTežina();
        }
        kolicinaSoka = tezina*0.4;
        posuda.lista.clear();
        ukupnaKolicinaSoka = ukupnaKolicinaSoka + kolicinaSoka;
        //System.out.println("Dobijeno je "+kolicinaSoka+" soka.");
        return ukupnaKolicinaSoka;
    }

    public static void main(String[] args) {



        // PROVERA ZA PRVIH OSAM ZAHTEVA U ZADATKU
        /*Voće vocka1 = new Voće("jabuka",200,false);
        Voće vocka2 = new Voće("jabuka",100,false);
        Voće vocka3 = new Voće("jabuka",250,false);
        Voće vocka4 = new Voće("jabuka",800,false);

        Jabuka jabuka1 = new Jabuka(vocka1.getNaziv(),vocka1.getTežina(),vocka1.isTrula(),"sorta1");
        Jabuka jabuka2 = new Jabuka(vocka2.getNaziv(),vocka2.getTežina(),vocka2.isTrula(),"sorta2");
        Jabuka jabuka3 = new Jabuka(vocka3.getNaziv(),vocka3.getTežina(),vocka3.isTrula(),"sorta3");
        Jabuka jabuka4 = new Jabuka(vocka4.getNaziv(),vocka4.getTežina(),vocka4.isTrula(),"sorta4");

        PosudaZaVoće posuda = new PosudaZaVoće();
        Cediljka cediljka = new Cediljka(posuda);

        Sokovnik sokovnik = new Sokovnik(posuda,cediljka);
        sokovnik.posuda.dodajVoće(vocka1);
        sokovnik.posuda.dodajVoće(vocka2);
        sokovnik.posuda.dodajVoće(vocka3);
        sokovnik.posuda.dodajVoće(vocka4);

        sokovnik.cediljka.cedi();*/




        int i=0;
        PosudaZaVoće posuda = new PosudaZaVoće();
        Cediljka cediljka = new Cediljka(posuda);
        Sokovnik sokovnik = new Sokovnik(posuda,cediljka);
        double ukupno =0;
        while(i<100){
            Jabuka jabuka = GenerisiJabuku(i);
            //dodavanje(70%)
            Random rand1 = new Random(); //instance of random class
            int upperbound = 10;
            int int_random = rand1.nextInt(upperbound);
            if(int_random<7) {
                sokovnik.posuda.dodajVoće(jabuka);
            }
            else {
                System.out.println("Nije dodata vocka.");
            }
            //DODATI POSLEDNJI USLOV
            if(sokovnik.posuda.ostaloJe()<0)
                throw new PremasenKapacitetException("Premasen kapacitet.");

            //cedjenje(30%)
            Random rand2 = new Random(); //instance of random class
            int upperbound2 = 10;
            int int_random2 = rand1.nextInt(upperbound2);
            if(int_random2<3) {
                double kolicina=sokovnik.cediljka.cedi();
                ukupno = ukupno + kolicina;
                System.out.println("Iscedjen je sokovnik.");
            }
            else{
                System.out.println("Nije iscedjen sokovnik.");
            }
            i++;
        }
        System.out.println("Dobijeno je "+ukupno+" soka.");
    }

    private static Jabuka GenerisiJabuku(int i) {
        String naziv = "jabuka ";
        double min = 100;
        double max =300;
        double range = max-min+1;
        double rand = (Double)(Math.random()*range+min);

        Random rand1 = new Random(); //instance of random class
        int upperbound = 10;
        int int_random = rand1.nextInt(upperbound);
        boolean trula = false;
        if(int_random<2)
             trula = true;

        String vrsta = "vrsta "+i+1;

        Jabuka jabuka = new Jabuka(naziv,rand,trula,vrsta);
        return jabuka;
    }
}




//  5. Cediljka služi za ceđenje voća i radi tako što iscedi sve voće koje se nalazi u posudi. Pri svakom ceđenju mogu da pratim koliko soka je dobijeno.

//   6. Ceđenjem jedne voćke se dobija količina soka jednaka 40% težine voćke.