package run.ergou.rmi.customclass;

import java.io.Serializable;

// 远程方法参数为自定义类时，需要通过某种方式获得该类全限定名
public class User implements Serializable {
    // java.io.InvalidClassException: cc.ergou.rmi.remoteobject.User; local class incompatible:
    // stream classdesc serialVersionUID = -314877333898485661, local class serialVersionUID = 8246818335192651206
    private static final long serialVersionUID = 8246818335192651206L;

    // 反序列化时先将传递的成员变量反序列化，如果类定义中不存在该成员变量，再忽略
    public Object object;
}