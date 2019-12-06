package Labb6;


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Menu implements MenuItem {
    /**
     * Skapar en tom meny med den givna rubriken.
     */
    protected String title;
    List<MenuItem> items;
    public Menu(String title) {
        items = new ArrayList<>();
        this.title = title;
    }

    /**
     * Lägger till ett menyval till menyn.
     */
    public void add(MenuItem item) {
        items.add(item);
    }

    public String getTitle() {
        return title;
    }

    /**
     * Exekverar menyn enligt loopen definierad i punkterna (1) till (4). (1)
     * Skriver ut menyns rubrik med stora bokstäverunderstruket med ’=’. Därefter
     * följer en numrerad lista över alla menyelement i denna meny, numrerade från
     * 0. (2) Användaren får sedan välja ett av alternativen genom att ange talet
     * framför menyvalet. Vad händer om man inte anger ett giltigt tal? Användarens
     * menyval exekveras. (3) Om menyval 0 valts så returnerar metoden. 0 motsvarar
     * alltså alltid av avsluta/tillbaka/återgå. (4) gå till (1)
     */
    public void execute() {
        System.out.println(getTitle());
        for(int i=0; i<getTitle().length(); i++) {
            System.out.print("=");
        }
        System.out.println("\n");
        int b=-1;
        MenuItem toExecute = null;
        for(MenuItem item : items) {
            if(item.getTitle().equals(this.getTitle())) {
                toExecute = item;
            }
            b++;
            System.out.println("Val "+b+": " + item.getTitle());
            //ta in input.
            //Item toExecute = items.get(val)
            //toExecute.execute();
        }
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        toExecute = items.get(a);
        toExecute.execute();
    }
    
    public void varuLista() {

    }

    public static void main(String [] args) {
        int varunummer= 0;
        Menu varuLista = new Menu("Varulista");
        Menu varuMenu = new Menu("Varumeny");
        Menu bokMenu = new Menu("Lägg till bok");
        Menu huvudMenu = new Menu("Huvudmeny");
        Menu bockerLista = new Menu("Böcker");
        Menu filmLista = new Menu("Filmer");
        huvudMenu.add(new AbstractMenuItem("Avsluta") { //anonymkla​ ss
        public void execute() { // Gör ingenting.
        System.exit(0);
        }
        });
        
        
        huvudMenu.add(new AbstractMenuItem("Varulista") {  //anonymkla​ ss
        public void execute() {
        varuLista.execute();
        }
        });    
        
        
        varuMenu.add(new AbstractMenuItem("Tillbaka") {
        public void execute() { // Gör ingenting.
        huvudMenu.execute();
        }
        });
        
        String titel=null;
        String miljomerkt=null;
        String forfattare=null;
        Bok bok = new Bok(titel, varunummer, miljomerkt, forfattare);
        varuMenu.add(new AbstractMenuItem("Bok") {
       
        public void execute() { // Gör ingenting.
        
                    
            
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Varunummer");
        int varunummer = scan.nextInt();
        
        bok.setPris(varunummer);
        scan.nextLine();
        

        System.out.println("Titel: ");
        String titel = scan.nextLine();
        bok.setTitle(titel);
      

        System.out.println("Författare");
        String forfattare = scan.nextLine();
        bok.setForfattare(forfattare);

        System.out.println("Miljömärkt?");
        String miljomerkt = scan.nextLine();
        bok.setMiljomerkt(miljomerkt);
       
        varuMenu.execute();
        }
        });
        
        String titel2=null;
        String miljomerkt2=null;
        String regissor=null;
        Film film = new Film(titel2, varunummer, miljomerkt2, regissor);
        varuMenu.add(new AbstractMenuItem("Film") {     
        public void execute() { // Gör ingenting.
            

        Scanner scan = new Scanner(System.in);
                
        System.out.println("Varunummer");
        int varunummer = scan.nextInt();
        film.setPris(varunummer);
        scan.nextLine();
        
        System.out.println("Titel: ");
        String titel = scan.nextLine();
        film.setTitle(titel);
          
                
        System.out.println("Regissör");
        String regissor = scan.nextLine();
        film.setRegissor(regissor);
      
                
                
        System.out.println("Miljömärkt?");
        String miljomerkt = scan.nextLine();
        film.setMiljomerkt(miljomerkt);
         
        varuMenu.execute();
        }
        });
        
        varuLista.add(new AbstractMenuItem("Tillbaka") {
        public void execute() { // Gör ingenting.
        System.out.println(bok);
        huvudMenu.execute();
        }
        });//anonymkla​ ss
        
        varuLista.add(new AbstractMenuItem("Böcker") {
        public void execute() { // Gör ingenting.
        
        //System.out.println("Varunummer: " + bok.getPris());
        //System.out.println("Titel: " + bok.getTitle());
        //System.out.println("Författare: " + bok.getForfattare());
        //System.out.println("Miljämärkt: " + bok.getMiljomerkt());
        varuLista.execute();
        }
        });
        
        varuLista.add(new AbstractMenuItem("Filmer"){
        public void execute() {    
            
        System.out.println("Varunummer: " + film.getPris());
        System.out.println("Titel: " + film.getTitle());
        System.out.println("Regissör : " + film.getRegissor());
        System.out.println("Miljämärkt: " + film.getMiljomerkt());    
        varuLista.execute();
        }
        });

        /*bokMenu.add(new AbstractMenuItem("Titel") {
        public void execute() { // Gör ingenting
        Scanner scan = new Scanner(System.in);
        String titel = scan.nextLine();
        bokMenu.execute();
        }
        });
        
        
        bokMenu.add(new AbstractMenuItem("Författare") {
        public void execute() { // Gör ingenting
        Scanner scan = new Scanner(System.in);
        String forfattare = scan.nextLine();
        bokMenu.execute();
        }
        });
        
        
        bokMenu.add(new AbstractMenuItem("Pris") {
        public void execute() { // Gör ingenting
        Scanner scan = new Scanner(System.in);
        String pris = scan.nextLine();
        bokMenu.execute();
        }
        });
        
        
        bokMenu.add(new AbstractMenuItem("Miljömärkt") {
        public void execute() { // Gör ingenting
        Scanner scan = new Scanner(System.in);
        String miljomerkt = scan.nextLine();
        bokMenu.execute();
        }
        });*/
        
        
        
        huvudMenu.add(new AbstractMenuItem("Lägg till ny vara") {  //anonymkla​ ss
        public void execute() {
        varuMenu.execute();        
        }
        });
        

        
       /* bockerLista.add(new AbstractMenuItem("Tillbaka") {
        public void execute() { // Gör ingenting.
        varuLista.execute();
        }
        });    
        
        filmLista.add(new AbstractMenuItem("Tillbaka") {
        public void execute() { // Gör ingenting.
        varuMenu.execute();
        }
        });*/
        
        
        huvudMenu.add(huvudMenu); // Wow, en cirkulär meny!
        huvudMenu.execute();
        
        /*int result = -1;
        while (!(result == 0)) {
            System.out.println("hej");
            switch (result) {
            case 0:
                System.exit(0);
                break;

            case 1:
                
                break;
                
            case 2:
                
                break;
                
            default:
                System.out.println("Använd 0 - 2");
            }
        }*/
        
    }
}


