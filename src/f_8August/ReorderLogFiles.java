package f_8August;

import java.util.ArrayList;

public class ReorderLogFiles {
    public static void main(String[] args) {
        String[] strs = {"dig1 8 1 5 1","let1 art can","dig2 3 6","let2 own kit dig","let3 art zero"};
        //["a1 9 2 3 1","g1 act car","zo4 4 7","ab1 off key dog","a8 act zoo","a2 act car"]
        reorderLogFiles(strs);
    }

    /**
     * 关键点：读懂题目 + 分析清楚题意，这种题主要是逻辑性理顺就OK了，细节 + 整体思路 + 每一步的实现 + 每个函数的实现
     * 多动手写！！！
     * @param logs
     * @return
     */
    public static String[] reorderLogFiles(String[] logs) {
        ArrayList<String> lisLe = new ArrayList<>();
        ArrayList<String> lisNum = new ArrayList<>();
        for(String str : logs){
            if(judgeNum(str) == false)lisLe.add(str);//字母类型添加
            else lisNum.add(str);//数字类型添加
        }
        String[] res1 =  lisLe.toArray(new String[lisLe.size()]);
        for(int i = 0; i < res1.length - 1; i++){
            for(int j = i+1; j < res1.length; j++){
                if(judgeLe(res1[j], res1[i])){
                    String tem = res1[i];
                    res1[i] = res1[j];
                    res1[j] = tem;
                }
            }
        }
        String[] res2 = lisNum.toArray(new String[lisNum.size()]);
        for(int i = 0; i < res1.length;i++){
            logs[i] = res1[i];
        }
        for(int j = 0; j < res2.length; j++){
            logs[j + res1.length] = res2[j];
        }
        return logs;
    }

    /**
     * 判断str1 是否 大于 str2
     * @param str1
     * @param str2
     * @return
     */
    public static boolean judgeLe(String str1, String str2){
        int a = 0, b = 0;
        for(int i = 0; i < str1.length(); i++){
            if(str1.charAt(i)==' '){
                a=i;
                break;
            }
        }
        for(int i = 0; i < str2.length(); i++){
            if(str2.charAt(i)==' '){
                b=i;
                break;
            }
        }
        str1 = str1.substring(a);
        str2 = str2.substring(b);
        int len = 0;
        if(str1.length() > str2.length())len=str2.length();
        else len = str1.length();
        int i = 0;
        while(i < len){
            if(str1.charAt(i) > str2.charAt(i)){
                return true;
            }
            else if(str1.charAt(i) < str2.charAt(i))return false;
            i++;
        }
        if(str1.length() >= str2.length())return true;
        return false;
    }
    public static boolean judgeNum(String str){
        int a = 0;
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i)==' '){
                a=i;
                break;
            }
        }
        str = str.substring(a);
        for(char ch : str.toCharArray()){
            if(ch >= 'a' && ch <= 'z')return false;
        }
        return true;
    }
}
