package run.ergou.rmi.interfaces;

import run.ergou.rmi.customclass.User;

import java.rmi.Remote;
import java.util.List;

public interface IUserList extends Remote {
    User getUser(Object obj);
    String addUser(User user);
    void createUserList(List list);
    void delUser(Integer id);
}