import java.io.Serializable;

public class Book implements Serializable {
    private String name;
    private String authorName;
    private String text;

    public void setName (String name){
        this.name = name;
    }
    public String getName () {
        return name;
    }
    public void setAuthorName (String authorName){
        this.authorName = authorName;
    }
    public String getAuthorName () {
        return authorName;
    }
    public void setText (String text){
        this.text = text;
    }
    public String getText () {
        return text;
    }



}
