package com.zxj.demo1;

import java.io.*;

/**
 * Created by 12423 on 2017/8/1.
 */
public class HelloWorld {
    public void test()
    {
        StringBuffer str = new StringBuffer();
        str.append("hello world!");
        System.out.println(str);
    }

    public  boolean copeFile(String sourFile,String targetFile){
        try {
            BufferedInputStream bs = new BufferedInputStream(new FileInputStream(sourFile));
            BufferedOutputStream bo = new BufferedOutputStream(new FileOutputStream(targetFile));
            byte[] size = new byte[2048];
            int len = 0;
            while((len=bs.read(size))!=-1){
                bo.write(size,0,len);
            }
            bo.flush();
            bo.close();
            bs.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            return false;
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }
    public static void main(String[] args){
        System.out.println(new HelloWorld().copeFile("D:\\JavaSE\\IO\\src\\file\\CopyFile.java","C:\\Users\\12423\\Desktop\\Test.java"));
    }
}
