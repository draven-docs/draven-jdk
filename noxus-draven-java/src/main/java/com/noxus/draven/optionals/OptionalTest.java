package com.noxus.draven.optionals;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @since 1.8 java.util.Optional
 */
public class OptionalTest {

    User user = null;

    @BeforeEach
    public void getuser() {
        final User user = new User();
        user.setId("2234");
        user.setUsername("哇哈哈");
        this.user = user;
    }

    @Test
    public void maps() {
        final Optional<User> user = Optional.ofNullable(this.user);
        // final Optional<String> o = user.map(username -> user.get().getUsername().toString());
        // final String s = o.get();
        final String s = user.map(username -> user.get().getUsername().toString()).get();
        System.out.println(s);
    }

    @Test
    public void flatMap() {
      /*  String[] words = new String[]{"Hello","World"};
        List<String> a = Arrays.stream(words)
                .map(word -> word.split(""))

                .flatMap(Arrays::stream)

                .distinct()
                .collect(Collectors.toList());
        a.forEach(System.out::println);*/

        String[] words = new String[]{"Hello", "World"};
        List<String[]> a = Arrays.stream(words)
                .map(word -> word.split(""))
                .distinct()
                .collect(Collectors.toList());
        a.forEach(System.out::print);
    }

    @Test
    public void flatMapOrMap() {
        String[] ss = {
                "hello welcome",
                "world hello",
                "hello world",
                "hello world welcome"
        };
        Stream<String> testStream = Stream.of(ss);

        testStream.map(str -> str.split(" "))
                .forEach(strStream -> System.out.println(strStream));

       /* testStream.map(str-> Arrays.stream(str.split(" ")))
                .forEach(strStream-> System.out.println(Arrays.toString(strStream.toArray())));*/

       /* testStream.flatMap(str-> Arrays.stream(str.split(" ")))
                .forEach(strStream-> System.out.println(strStream));*/
    }

    @Test
    public void orElse() {
        final Optional<User> user = Optional.ofNullable(this.user);
        // return value != null ? value : other;
        final User user1 = user.orElse(new User("1", "优厚"));
        System.out.println(user1);
    }

    @Test
    public void orElseGet() {
        final Optional<User> user = Optional.ofNullable(this.user);
        // return value != null ? value : other;
        final User user2 = user.orElseGet(() -> new User("1", "优厚"));
        System.out.println(user2);
    }


    @Test
    public void orElseThrow() {
        final Optional<User> user = Optional.ofNullable(this.user);
        final User user3 = user.orElseThrow(() -> new NullPointerException());
        System.out.println(user3);
    }


    @Test
    public void nullPoint() {
        String id = user.getId();
        final String cid = user.getCity().getCid();

    }

    @Test
    public void ofNullable() {
        final Optional<User> user = Optional.ofNullable(this.user);
        if (user.isPresent()) {
            System.out.println("我有值" + user.get());
        }
        //Optional<String> nullOptional = Optional.of(null);
    }

    public static void main(String[] args) {
    }

}


class User {

    private String id;
    private String username;

    private City city;

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public User() {
    }

    public User(String id, String username) {
        this.id = id;
        this.username = username;
    }

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", username='" + username + '\'' +
                ", city=" + city +
                '}';
    }
}

class City {
    private String cid;

    private String cname;

    public String getCid() {
        return cid;
    }

    public void setCid(String cid) {
        this.cid = cid;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }
}
