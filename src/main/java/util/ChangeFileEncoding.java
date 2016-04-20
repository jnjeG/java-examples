package util;

import java.io.*;

/**
 * Created by 33 on 16/4/20.
 */
public class ChangeFileEncoding {
    private static final String srcFilePathCon = "/Users/chenjunjie/Downloads/《大话设计模式》Java版/DesignModel/src";
    private static final String desFilePath = "/Users/chenjunjie/Desktop/src";
    public static void main(String[] args) throws IOException {
        recur(srcFilePathCon);
    }

    private static void recur(String srcFilePath) throws IOException {
        File dir = new File(srcFilePath);
        File[] files = dir.listFiles();
        if(files != null) {
            for (File file : files) {
                if(file.isDirectory()){
                    recur(file.getAbsolutePath());
                }else{
                    InputStreamReader isr = new InputStreamReader(new FileInputStream(file), "GB2312");
                    BufferedReader br = new BufferedReader(isr);
                    String s = null;
                    StringBuffer sb = new StringBuffer();
                    while ((s = br.readLine()) != null) {
                        sb.append(s);
                        sb.append(System.lineSeparator());
                    }
                    br.close();

                    String curPath = file.getAbsolutePath();
                    String fileName = file.getName();
                    int fileNameIndex = curPath.indexOf(fileName);
                    String middlePath = curPath.substring(curPath.indexOf(srcFilePathCon) + srcFilePathCon.length(),fileNameIndex-1);
                    String newDirPath = desFilePath + File.separator + middlePath;
                    File newDirFile = new File(newDirPath);
                    if (!newDirFile.exists()) {
                        newDirFile.mkdirs();
                    }

                    File destFile = new File(newDirPath + File.separator + fileName);
                    if (!destFile.exists()) {
                        destFile.createNewFile();
                    }

                    OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream(destFile), "utf8");
                    BufferedWriter bw = new BufferedWriter(osw);
                    bw.write(sb.toString());

                    bw.close();
                }

            }
        }
    }
}
