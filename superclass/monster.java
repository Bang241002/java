package superclass;

abstract public class monster {
    private String name;

    public monster(String name){
        this.name = name;
    }

    abstract public String attack();
}
