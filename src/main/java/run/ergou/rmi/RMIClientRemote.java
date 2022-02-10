package run.ergou.rmi;

import run.ergou.rmi.codebase.Malicious;
import run.ergou.rmi.interfaces.IUserList;

import java.rmi.Naming;

public class RMIClientRemote {
    public static void main(String[] args) throws Exception {
        IUserList userList = (IUserList) Naming.lookup("rmi://localhost:1099/users");
        userList.createUserList(new Malicious());
    }
}
