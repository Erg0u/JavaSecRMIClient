package run.ergou.rmi.util;

import javassist.ClassPool;
import javassist.CtClass;
import javassist.CtField;
import javassist.Modifier;

public class ModifySystemClass {
    public static void main(String[] args) throws Exception {
        // 修改系统类
        // 为java.lang.Integer添加Object类型的字段obj
        ClassPool classPool = ClassPool.getDefault();
        CtClass ctClassInt = classPool.get("java.lang.Integer");
        CtClass ctClassObj = classPool.get("java.lang.Object");
        CtField ctFieldObj = new CtField(ctClassObj, "obj", ctClassInt);
        ctFieldObj.setModifiers(Modifier.PUBLIC);
        ctClassInt.addField(ctFieldObj);
        // 将修改后的系统Class输出至指定目录
        ctClassInt.writeFile("E:\\tmp\\prependBootstrap");
    }
}
