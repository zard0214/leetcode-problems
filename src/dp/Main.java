package dp;

import java.util.Scanner;

/**
 * @author zard
 * @date Created in 08/05/2022 10:19
 */
public class Main{

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        //物品的体积
        int w[] = {0,2,3,4};	//第一位补0

        //物品的价值
        int v[] = {0,2,3,4};	//第一位补0

        //第i件物品放入剩余容量为j时的背包价值
        int [][] val = getPerfectValue(w,v,10);

        System.out.println("the best value is "+val[w.length-1][10]);

	   /* //打印val
		for(int i=0;i<w.length;i++)
			for(int j=0;j<=10;j++)
				System.out.println("val["+i+"]"+"["+j+"]="+val[i][j]);*/

        int wuping[][] = getBestStrategy(val,w,v);

        for(int i=0;i<wuping[0].length;i++)
        {
            System.out.println("物品【"+(i+1)+"】共装入【"+wuping[1][i]+"】件");
        }
    }

    public static int[][] getPerfectValue(int[] w,int[] v,int capacity) {

        int len = w.length;	//物品个数
        int Val[][] = new int[len][capacity+1];

        for(int i=0;i<len;i++) 	//没有初始化的话Int数组默认全是0，这个循环可以不要
            Val[i][0] = 0;
        for(int j=0;j<=capacity;j++)
            Val[0][j] = 0;

        //递推公式 Val[z][y] = max{F[z-1][y-k*w[z]]+k*v[z]} 0<=k*w[z]<=y
        for(int z=1;z<len;z++){
            lab2:	for(int y=1;y<=capacity;y++) {
                if(w[z]>y) {	//物品重量大于背包剩余空间
                    if(Val[z][y-1] > Val[z-1][y]) {	//判断是k个v[z]大还是 v[z-1]大
                        Val[z][y] = Val[z][y-1];
                    }else {
                        Val[z][y] = Val[z-1][y];
                    }
                    continue;
                }else {
                    for(int k=1;k<=y/w[z];k++) {
                        if(w[z]>w[z-1] && v[z]<v[z-1]) {
                            Val[z][y] = Val[z-1][y];
                            break lab2;
                        }
                        if((k==1)&&(Val[z-1][y-k*w[z]]+k*v[z]) > (Val[z-1][y-(k-1)*w[z]]+(k-1)*v[z])) {
                            Val[z][y] = Val[z-1][y-k*w[z]]+k*v[z];
                        }else if((k==1)&&(Val[z-1][y-k*w[z]]+k*v[z]) < (Val[z-1][y-(k-1)*w[z]]+(k-1)*v[z])) {
                            Val[z][y] = Val[z-1][y];
                        }else if(Val[z][y] < Val[z-1][y-k*w[z]]+k*v[z]){
                            Val[z][y] = Val[z-1][y-k*w[z]]+k*v[z];
                        }
                    }
                }
            }
        }

        return Val;
    }

    public static int[][] getBestStrategy(int [][] val , int [] w, int [] v) {

        int capacity = val[0].length-1;
        int item[][] = {{1,2,3},{0,0,0}};
        int j = capacity;
        for(int i = w.length-1;i>0;i--)
            for(;j>0;) {
                for(int k=1;k<=j/w[i];k++) {
                    if((j-k*w[i]>=0) && val[i][j] == (val[i-1][j-k*w[i]]+k*v[i])) {
                        item[1][i-1] = k;
                    }
                }
                if(item[1][i-1] == 0) {
                    break;
                }else {
                    j = j - item[1][i-1]*w[i];
                    break;
                }
            }
        return item;
    }

//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int cap = Integer.parseInt(scanner.nextLine());
//        int w[] = {0,  20,  16};
//        int v[] = {0,  30,  20};
//        int [][] val = getPerfectValue(w,v,cap);
//        System.out.println("生命力 ： "+val[w.length-1][cap]);
//        int item[][] = getBestStrategy(val,w,v);
//        for(int i = 0;i < item[0].length; i++)
//        {
//            if(i == 0)
//                System.out.println("仙女草"+" "+item[1][i]+"件");
//            else
//                System.out.println("银河梭"+" "+item[1][i]+"件");
//        }
//    }
//
//    public static int[][] getPerfectValue(int[] w,int[] v,int capacity) {
//
//        int len = w.length;
//        int Val[][] = new int[len][capacity+1];
//
//        for(int i=0;i<len;i++)
//            Val[i][0] = 0;
//        for(int j=0;j<=capacity;j++)
//            Val[0][j] = 0;
//
//
//        for(int z=1;z<len;z++){
//            lab2:	for(int y = 1;y <= capacity;y++) {
//                if(w[z]>y) {
//                    if(Val[z][y-1] > Val[z-1][y]) {
//                        Val[z][y] = Val[z][y-1];
//                    }else {
//                        Val[z][y] = Val[z-1][y];
//                    }
//                    continue;
//                }else {
//                    for(int k=1;k<=y/w[z];k++) {
//                        if(w[z]>w[z-1] && v[z]<v[z-1]) {
//                            Val[z][y] = Val[z-1][y];
//                            break lab2;
//                        }
//                        if((k==1)&&(Val[z-1][y-k*w[z]]+k*v[z]) > (Val[z-1][y-(k-1)*w[z]]+(k-1)*v[z])) {
//                            Val[z][y] = Val[z-1][y-k*w[z]]+k*v[z];
//                        }else if((k==1)&&(Val[z-1][y-k*w[z]]+k*v[z]) < (Val[z-1][y-(k-1)*w[z]]+(k-1)*v[z])) {
//                            Val[z][y] = Val[z-1][y];
//                        }else if(Val[z][y] < Val[z-1][y-k*w[z]]+k*v[z]){
//                            Val[z][y] = Val[z-1][y-k*w[z]]+k*v[z];
//                        }
//                    }
//                }
//            }
//        }
//
//        return Val;
//    }
//
//    public static int[][] getBestStrategy(int [][] val , int [] w, int [] v) {
//        int capacity = val[0].length-1;
//        int item[][] = {{1,2},{0,0}};
//        int j = capacity;
//        for(int i = w.length-1;i>0;i--)
//            for(;j>0;) {
//                for(int k=1;k<=j/w[i];k++) {
//                    if((j-k*w[i]>=0) && val[i][j] == (val[i-1][j-k*w[i]]+k*v[i])) {
//                        item[1][i-1] = k;
//                    }
//                }
//                if(item[1][i-1] == 0) {
//                    break;
//                }else {
//                    j = j - item[1][i-1]*w[i];
//                    break;
//                }
//            }
//        return item;
//    }
}