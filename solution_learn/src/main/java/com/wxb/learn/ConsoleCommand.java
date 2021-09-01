package com.wxb.learn;

import org.apache.commons.lang3.StringUtils;

import java.io.*;
import java.net.URLEncoder;
import java.util.Arrays;
import java.util.StringTokenizer;

/**
 * @author wangxianbing
 * @date 2021-09-01 10:52:42
 */
public class ConsoleCommand {
    public static void main(String[] args) throws IOException {
        //System.out.println((char)97);

        String[] result = "this is a test".split("\\s");
        String[] result2 = StringUtils.split("this is a test2", " ");
        System.out.println(Arrays.toString(result2));
        Arrays.stream(result).forEach(System.out::println);


        /*Process ipconfig = Runtime.getRuntime().exec("ipconfig");
        InputStream inputStream = ipconfig.getInputStream();
        InputStreamReader ins = new InputStreamReader(inputStream);
        StringBuffer sb = new StringBuffer();
        int num = 0;
        byte[] bytes = new byte[1024];
        try {
            while ((num = inputStream.read(bytes)) != -1) {
                sb.append(new String(bytes, "gb2312"));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        StringTokenizer streamTokenizer = new StringTokenizer(sb.toString(), "\n");
        while (streamTokenizer.hasMoreTokens()){
            String line = streamTokenizer.nextToken().trim();

        }*/
    }
}
