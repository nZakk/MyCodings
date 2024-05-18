public class Students {
    private String name;
    private String email;

    public Students(){}

    public Students(String name, String email){
        this.name = name;
        this.email = email;
    }

    public String getName(){
        return name;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString(){
        return name + ", " + email;
    }
}
