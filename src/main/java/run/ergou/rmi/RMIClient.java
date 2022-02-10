package run.ergou.rmi;

import java.rmi.Naming;

public class RMIClient {
    public static void main(String[] args) throws Exception {

        // 列出远程对象
        String[] remoteObjs = Naming.list("rmi://localhost:1099");
        for (String remoteObj : remoteObjs) {
            System.out.println(remoteObj);
        }

        /*
            Exception java.rmi.UnmarshalException: error unmarshalling return
            java.lang.ClassNotFoundException:
                cc.ergou.rmi.remoteobject.IUserList (no security manager: RMI class loader disabled)
         */
        // RMI Client需要有该远程对象所实现接口的全限定名 可通过错误信息获得该全限定名
        // 验证接口全限定名后获得远程对象引用
        Naming.lookup("rmi://localhost:1099/users");

    }
}
