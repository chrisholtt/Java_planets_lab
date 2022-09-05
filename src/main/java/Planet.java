public class Planet {
    private String name;
    private int size;
    public Planet(String name, int size){
        this.name = name;
        this.size = size;
    }

    public String getName() {
        return this.name;
    }

    public int getSize() {
        return this.size;
    }

    public void explode() {
        System.out.println(this.getName() + " has exploded");
    }

    public String describe() {
        return (this.getName() + " is " + this.getSize() + " meters cubed");
    }

}


