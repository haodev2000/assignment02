package model;

import java.time.LocalDateTime;

public class Employee  {
    private int stt;
    private String id;
    private String name;
    private int age;
    private LocalDateTime dateJoin;
    private String roomName;

    public Employee() {
    }

    public int getStt() {
        return stt;
    }

    public void setStt(int stt) {
        this.stt = stt;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getRoomName() {
        return roomName;
    }

    public void setRoomName(String roomName) {
        this.roomName = roomName;

    }


    public LocalDateTime getDateJoin() {
        return dateJoin;
    }

    public void setDateJoin(LocalDateTime dateJoin) {
        this.dateJoin = dateJoin;
    }

    public Employee(int stt, String id, String name, int age) {
        this.stt = stt;
        this.id = id;
        this.name = name;
        this.age = age;

    }
}
