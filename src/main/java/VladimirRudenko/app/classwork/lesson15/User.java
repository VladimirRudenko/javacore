package VladimirRudenko.app.classwork.lesson15;
import java.util.Objects;
/**
 * Created by vladimir on 06.03.17.
 */
public class User {
    public String name;
    public int age;

    @Override
    public boolean equals(Object o) {

        if (o == this)
            return true;

        if (!(o instanceof User)) {
            return false;
        }

        User user = (User) o;
        return age == user.age &&
        Objects.equals(name, user.name);
    }
    @Override public int hashCode(){
        return Objects.hash(name,age);
    }
}
