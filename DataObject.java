package Labb6;

public class DataObject {
    public String title;
    public int pris;
    public String miljomerkt;
    
    public DataObject (String title, int pris, String miljomerkt) {
        super();
        this.setTitle(title);
        this.setPris(pris);
        this.setMiljomerkt(miljomerkt);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPris() {
        return pris;
    }

    public void setPris(int pris) {
        this.pris = pris;
    }

    public String getMiljomerkt() {
        return miljomerkt;
    }

    public void setMiljomerkt(String miljomerkt) {
        this.miljomerkt = miljomerkt;
    }
    
    
}


