package wonmookapp.hs.kr.wonmookhs;

/**
 * Created by aruffolo on 7/13/16.
 */
public class CouncilCardViewRoom {

    private String name;
    private String date;
    private String description;

    public CouncilCardViewRoom() {

    }

    public CouncilCardViewRoom(String name, String date, String description){
        this.name = name;
        this.date = date;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
