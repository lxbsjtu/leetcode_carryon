
package Banker;

import java.io.File;
import java.io.Writer;
import java.io.*;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;


//public class test{
//    public static void main(String[] args) throws FileNotFoundException {
//        File file=new File("/Users/lxb/Desktop/res111.txt");
//        System.out.println(file.exists());
//        File filemap=new File("/Users/lxb/Desktop/map.txt");
//        Map<String, String> map = new HashMap();
//        try {
//            BufferedReader br = new BufferedReader(new FileReader(filemap));
//
//            String line = null;
//            while ((line = br.readLine()) != null) {
//                String[] res = line.split("\t");
//                map.put(res[1], res[0]);
//            }
//
//        } catch (IOException e) {
//            System.err.print("read file error");
//        }
//
//
//        File filew = new File("/users/mkyong/filename.txt");
//
//        Writer writer = null;
//
//        try {
//            writer = new BufferedWriter(new OutputStreamWriter(
//                    new FileOutputStream("/Users/lxb/Desktop/ulres.txt"), "utf-8"));
//        } catch (IOException e) {
//            System.err.println("Problem writing to the file statsTest.txt");
//        }
//
//
//        try {
//            BufferedReader br = new BufferedReader(new FileReader(file));
//
//            String line = null;
//            while ((line = br.readLine()) != null) {
//                //Here you can manipulate the string the way you want
//                String[] tmp = line.split("\t", -1)[0].split(":::");
//                String[] res = {tmp[0], tmp[1], line.split("\t", -1)[1]};
//                try {
//                    writer.write(map.get(res[0]) + "::" + map.get(res[1]) + "\t"+res[2] + "\n");
//                } catch (IOException e) {
//                    System.err.println("Problem writing to the file statsTest.txt");
//                }
//            }
//
//        } catch (IOException e) {
//            System.err.print("read file error");
//        }
//
//
//        }
//    }