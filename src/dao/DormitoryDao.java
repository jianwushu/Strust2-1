package dao;

import entity.DormitoryEntity;

public interface DormitoryDao {
    public void addDormitoryDao(DormitoryEntity dormitoryEntity);
    public void deleteDormitory(DormitoryEntity dormitoryEntity);
    public void updateDormitory(DormitoryEntity dormitoryEntity);
    public DormitoryEntity findRoomById(int roomId);
    public DormitoryEntity findRoomByNumber(int roomNumber);
    public DormitoryEntity findRoomByName(String dormitoryName);
    public DormitoryEntity findRoomByBoth(String dormitoryName,int roomNumber);
}
