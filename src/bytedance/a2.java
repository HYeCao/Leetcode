package bytedance;

import java.util.Scanner;

/**
 * 网段地址 与 IP地址的对应查找关系，如何判定IP是属于哪个网段的，基础还是计算机网络的基本知识
 */
public class a2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str1 = scanner.nextLine();
        int n = Integer.valueOf(str1.split("  ")[0]);
        int m = Integer.valueOf(str1.split("  ")[1]);
        String[] stand = new String[n];
        String[] ips = new String[m];
        for(int i = 0; i < n; i++){
            stand[i] = scanner.nextLine();
        }
        for(int i = 0; i < m; i++){
            ips[i] = scanner.nextLine();
        }
        int[] res = new int[m];
        for(int i = 0 ; i < m; i++){//每个IP逐个通过，来进行判别
            for(int j = 0; j < n; j++){//每个IP结合所有的网段来进行处理
                String str = stand[j].split(" ")[1];
                if(str.substring(0, 6).equals(ips[i].substring(0, 6))){
                    String tem = str.split("\\.")[3].split("/")[0];
                    if(res[i] == 0)res[i] = stand[j].charAt(0) -48;
                    else if(res[i] != 0 && !tem.equals("0") && tem.length()==ips[i].split("\\.")[3].length() && Integer.valueOf(tem) < Integer.valueOf(ips[i].split("\\.")[3]))res[i] = stand[j].charAt(0) -48;
                }
            }
            if(res[i] == 0)res[i] = -1;
        }
        for(int i : res){
            System.out.println(i);
        }
    }

}
