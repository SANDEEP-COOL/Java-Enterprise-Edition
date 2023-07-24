package beans;

public class PersonEL {

    private String name;
    private int age;
    private DogEL dog;

    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setDog(DogEL dog) {
        this.dog = dog;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public DogEL getDog() {
        return dog;
    }
    
}
