package model;

import InterFace.RoomInterFace;

import java.time.LocalDateTime;

public class Employee  {
    private int stt;
    private String id;
    private String name;
    private int age;
    private Room roomF;

    public Room getRoomF() {
        return roomF;
    }

    public void setRoomF(Room roomF) {
        this.roomF = roomF;
    }

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

}
