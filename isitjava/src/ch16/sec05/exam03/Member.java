package ch16.sec05.exam03;

public class Member {
    private String id;
    private String name;

    public Member(String id) {
        this.id = id;
    }

    public Member(String id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "{ id: " + id + ", name: " + name + " }";
    }
}
