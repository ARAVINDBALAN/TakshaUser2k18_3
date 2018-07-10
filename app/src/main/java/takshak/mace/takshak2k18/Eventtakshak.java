package takshak.mace.takshak2k18;

public class Eventtakshak {

    private String event_name;
    private String event_id;
    private String event_dept;
    private String event_link;
    private int image;
    private String event_category;

    public Eventtakshak(){}

    public Eventtakshak(String  event_name,String event_id,String event_dept,String event_link,int image,String event_category){
        this.event_name = event_name;
        this.event_id = event_id;
        this.event_dept = event_dept;
        this.event_link = event_link;
        this.image = image;
        this.event_category = event_category;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getEvent_category() {
        return event_category;
    }

    public void setEvent_category(String event_category) {
        this.event_category = event_category;
    }

    public String getEvent_link() {
        return event_link;
    }

    public void setEvent_link(String event_link) {
        this.event_link = event_link;
    }

    public String getEvent_dept() {
        return event_dept;
    }

    public void setEvent_dept(String event_dept) {
        this.event_dept = event_dept;
    }

    public String getEvent_id() {
        return event_id;
    }

    public void setEvent_id(String event_id) {
        this.event_id = event_id;
    }

    public String getEvent_name() {
        return event_name;
    }

    public void setEvent_name(String event_name) {
        this.event_name = event_name;
    }
}
