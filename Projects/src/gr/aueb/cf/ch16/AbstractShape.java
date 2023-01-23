package gr.aueb.cf.ch16;

public class AbstractShape implements IShape {

    private long id;


    @Override
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
