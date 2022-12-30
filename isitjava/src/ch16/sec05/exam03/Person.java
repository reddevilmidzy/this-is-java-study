package ch16.sec05.exam03;

public class Person {
    public Member getMember1(Creatable1 creatable) {
        String id = "winter";
        return creatable.create(id);
    }

    public Member getMember2(Creatable2 creatable) {
        String id = "winter";
        String name = "한겨울";
        return creatable.create(id, name);
    }
}