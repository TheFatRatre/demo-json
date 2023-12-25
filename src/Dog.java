import java.util.Objects;

/**
 * ClassName: Dog
 * Package: PACKAGE_NAME
 * Description:
 *
 * @Author CYC
 * @Create 2023/12/25 14:21
 * @Version 1.0
 */
public class Dog {
    private String name;

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()){
            return false;
        }
        Dog dog = (Dog) o;
        return Objects.equals(name, dog.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Dog() {
    }

    public Dog(String name) {
        this.name = name;
    }
}
