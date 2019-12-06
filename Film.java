package Labb6;

public class Film extends DataObject {

    
    public String forfattare;
    
    public Film(String title, int pris, String miljomerkt, String regissor) {
        super(title, pris, miljomerkt);
        this.setRegissor(regissor);
        // TODO Auto-generated constructor stub
    }

    public String getRegissor() {
        return forfattare;
    }

    public void setRegissor(String forfattare) {
        this.forfattare = forfattare;
    }

}



