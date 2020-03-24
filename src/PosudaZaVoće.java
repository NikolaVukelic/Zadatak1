import java.util.LinkedList;

public class PosudaZaVoće {
    double kapacitet=3000;
    LinkedList<Voće> lista=new LinkedList<Voće>();

    public PosudaZaVoće() {
    }

    public void dodajVoće(Voće voće){
        if(ostaloJe()<voće.getTežina()){
            System.out.println("Nema mesta");
            return;
        }
        if(voće.isTrula()==true) {
            System.out.println("Vocka "+voće.getNaziv()+" je trula.");
            return;
        }
        lista.add(voće);
        System.out.println("Ubacena vocka "+voće.getNaziv()+" tezine "+voće.getTežina()+" u posudu.");
    }

    public int stanje(){
        if(lista==null)
            return -1;
        return lista.size();
    }
    public double  ostaloJe(){
        if(lista==null)
            return 0;
        double ostalo=0;
        for(int i=0;i<lista.size();i++){
            ostalo = ostalo + lista.get(i).getTežina();
        }
        return kapacitet-ostalo;
    }
}
