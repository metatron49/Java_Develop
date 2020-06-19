package com.metatron;

import org.junit.Test;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

/**
 * @Author: Metatron
 * @CreateTime: 2020-06-13 15:08
 * @Description: ${Description}
 */
public class FileReaderTest {

    public static void main(String[] args) throws IOException {


    }

    @Test
    public void test1()  {
        FileReader fileReader=null;
        try {
            System.out.println(System.getProperty("user.dir"));
            fileReader = new FileReader("helloworld.txt");
            int m = 0;
            while ((m = fileReader.read())!=-1){
                System.out.print((char)m);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if(fileReader!=null){
                try {
                    fileReader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    @Test
    public void test2(){
        FileReader fileReader=null;
        try {
            fileReader = new FileReader("helloworld.txt");
            //int m = 0;
            char[] m = new char[5];
            int len = 0;
            while ((len = fileReader.read(m))!=-1){
                System.out.print(Arrays.toString(m));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if(fileReader!=null){
                try {
                    fileReader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
