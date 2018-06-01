package com.oleksa.testng;

import org.testng.IAnnotationTransformer;
import org.testng.annotations.ITestAnnotation;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;


public class MyTransformer implements IAnnotationTransformer {
    @Override
    public void transform(ITestAnnotation iTestAnnotation, Class aClass, Constructor constructor, Method method) {
        System.out.print(method.getName());
        if ("divideTest".equals(method.getName())) {
            System.out.print(method.getName());
            iTestAnnotation.setInvocationCount(5);
        }
    }
}
