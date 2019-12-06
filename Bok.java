package Labb6;

public class Bok extends DataObject{

    
    public String forfattare;
    
    public Bok(String title, int pris, String miljomerkt, String forfattare) {
        super(title, pris, miljomerkt);
        this.setForfattare(forfattare);
        // TODO Auto-generated constructor stub
    }

    public String getForfattare() {
        return forfattare;
    }

    public void setForfattare(String forfattare) {
        this.forfattare = forfattare;
    }

}


