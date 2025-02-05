package com.epicode.projects.DependencyInjection;

public class Persona {

    private String fullName;
    // private EuropeanAddress address = new EuropeanAddress("Roma", "Italia", "Via Marconi"); //Accoppiamento forte, aka non consigliato in quanto poco riutilizzabile. Tutte le persone avranno questo indirizzo.
   // private EuropeanAddress address; // Usiamo la DI (DependencyInjection) passando nel costruttore.
   // private Address address; //rendiamo ancora più generico.
    private IAddress address; // esempio con interfaccia
    private String phone;

    public Persona() {
    }

/*
        public Persona(String fullName, EuropeanAddress address, String phone) {
        this.fullName = fullName;
        //this.address = new EuropeanAddress("Roma", "Italia", "Via Marconi"); //Accoppiamento forte (in questo esempio ovviamente non è tra i parametri);
        this.address = address;
        this.phone = phone;
        }
        é debole ma possiamo renderlo ancora più debole e generico.
    */

/*
        public Persona(String fullName, Address address, String phone) {
        this.fullName = fullName;
        //this.address = new EuropeanAddress("Roma", "Italia", "Via Marconi"); //Accoppiamento forte (in questo esempio ovviamente non è tra i parametri);
        this.address = address;
        this.phone = phone;
        } esempio con SuperClasse
    */

    public Persona(String fullName, IAddress address, String phone) {
        this.fullName = fullName;
        //this.address = new EuropeanAddress("Roma", "Italia", "Via Marconi"); //Accoppiamento forte (in questo esempio ovviamente non è tra i parametri);
        this.address = address;
        this.phone = phone;
    } // esempio con Interfaccia (risponde alla domanda ha un ...?) (mentre la classe risponde alla domanda è un...?)

    // Con l'interfaccia possiamo mettere in relazione oggetti di tipo diverso tipo cellulare con veicolo
    // se entrambi per esempio HANNO UN navigatore.
    // Quindi l'interfaccia si potrebbe dire che è un collegamento ancora più debole.
}
