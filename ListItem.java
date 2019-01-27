package com.aditi.samachar;

public class ListItem {

    private String heading;   //heading is title
    private String description;
    private String imageurl;  // imageurl is url

    public ListItem(){
    }
    public ListItem(String heading, String description,String imageurl) {
        this.heading = heading;
        this.description = description;
        this.imageurl=imageurl;
    }


    public void setHeading(String heading) {
        this.heading = heading;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setImageurl(String imageurl) {
        this.imageurl = imageurl;
    }

    public String getHeading() {

        return heading;
    }

    public String getDescription() {
        return description;
    }

    public String getImageurl(){
        return imageurl;
    }
}
