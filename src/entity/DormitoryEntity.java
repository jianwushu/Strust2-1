package entity;

import javax.persistence.*;

@Entity
@Table(name = "dormitory", schema = "struts2", catalog = "")
public class DormitoryEntity {
    private int roomId;
    private String dormitoryName;
    private Integer roomNumber;

    @Id
    @Column(name = "RoomId")
    public int getRoomId() {
        return roomId;
    }

    public void setRoomId(int roomId) {
        this.roomId = roomId;
    }

    @Basic
    @Column(name = "DormitoryName")
    public String getDormitoryName() {
        return dormitoryName;
    }

    public void setDormitoryName(String dormitoryName) {
        this.dormitoryName = dormitoryName;
    }

    @Basic
    @Column(name = "RoomNumber")
    public Integer getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(Integer roomNumber) {
        this.roomNumber = roomNumber;
    }

    public DormitoryEntity() {
    }
    public DormitoryEntity(String dormitoryName,int roomNumber) {
        this.dormitoryName = dormitoryName;
        this.roomNumber = roomNumber;
    }
}


